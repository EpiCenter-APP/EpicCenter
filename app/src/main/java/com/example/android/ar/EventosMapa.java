package com.example.android.ar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import android.view.LayoutInflater;

public class EventosMapa extends Fragment implements LocationListener{

    public EventosMapa() {
        // Required empty public constructor



    }

    private LocationManager locationManager;

    private static View view;
    private static GoogleMap mMap;
    private static Double latitude, longitude;
    private String provider;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        LocationProvider provider;

        //proveedor de los servicios
        locationManager = (LocationManager)getActivity().getSystemService(Context.LOCATION_SERVICE);
        this.locationManager.removeUpdates(this);
        this.locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 1, this);


        if (container == null) {
            return null;
        }

        view = (RelativeLayout) inflater.inflate(R.layout.evento_mapa, container, false);
        // Passing harcoded values for latitude & longitude. Please change as per your need. This is just used to drop a Marker on the Map
        latitude = 13.699314;
        longitude = -89.224308;

        setUpMapIfNeeded(); // For setting up the MapFragment

        return view;
        //return inflater.inflate(R.layout.evento_mapa, container, false);

    }



    @Override
    public void onResume() {
        super.onResume();
        setUpMapIfNeeded();

    }

    public void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.


        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.mymapId)).getMap();

            // Check if we were successful in obtaining the map.
            if (mMap != null)
                setUpMap();
        }


        //mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(13.700486, -89.217666), 16.0f));
    }

    private static void setUpMap() {
        // For showing a move to my loction button
        mMap.setMyLocationEnabled(true);
        // For dropping a marker at a point on the Map
        mMap.addMarker(new MarkerOptions().position(new LatLng(latitude, longitude)).title("Event").snippet("Event description"));
        // For zooming automatically to the Dropped PIN Location
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude,
                longitude), 12.0f));
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {

        // TODO Auto-generated method stub
        if (mMap != null)
            setUpMap();

        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.mymapId)).getMap();

            // Check if we were successful in obtaining the map.
            if (mMap != null)
                setUpMap();
        }
    }

    @Override
    public void onLocationChanged(Location location) {

        double lat = location.getLatitude();
        latitude = lat;

        double lon = location.getLongitude();
        longitude = lon;

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
