package hafid.ramadhan10119089;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class RestoFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            LatLng resto1 = new LatLng(-6.887707760363346, 107.61515253751617);
            googleMap.addMarker(new MarkerOptions().position(resto1).title("Richeese Factory Dipatiukur"));
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(resto1, 14));

            LatLng resto2 = new LatLng(-6.88700825580651, 107.61273841521725);
            googleMap.addMarker(new MarkerOptions().position(resto2).title("Noah Barn's"));

            LatLng resto3 = new LatLng(-6.888270550032209, 107.6157173749208);
            googleMap.addMarker(new MarkerOptions().position(resto3).title("Baso Aci Akang"));

            LatLng resto4 = new LatLng(-6.88748472611971, 107.61635464928705);
            googleMap.addMarker(new MarkerOptions().position(resto4).title("Warkop Sariwangi"));

            LatLng resto5 = new LatLng(-6.887128034161037, 107.61486676016732);
            googleMap.addMarker(new MarkerOptions().position(resto5).title("Sop Iga Dipatiukur"));

        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_resto, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}