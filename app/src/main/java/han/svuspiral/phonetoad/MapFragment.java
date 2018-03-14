package han.svuspiral.phonetoad;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;


public class MapFragment extends Fragment implements OnMapReadyCallback {

    GoogleMap mGoogleMap;
    MapView mapView;
    View view;
    ArrayList<Location> locations;

    public MapFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_maps, container, false);

        locations = new ArrayList<>();
        setLocations();

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mapView = (MapView) view.findViewById(R.id.mapView);
        if (mapView != null) {
            mapView.onCreate(null);
            mapView.onResume();
            mapView.getMapAsync(this);
        }
    }

    public void onMapReady(GoogleMap googleMap) {

        // Sets zoom bounds

        googleMap.setMinZoomPreference(15.0f);
        googleMap.setMaxZoomPreference(20.0f);

        //Add marker for (1)
        LatLng mulberry = new LatLng(39.081549, -78.218520);
        googleMap.addMarker(new MarkerOptions().position(mulberry)
                .title("Old Town Cemetery and site of town East Academy"));
        //Add marker for (2)
        LatLng lotsouth = new LatLng(39.082940, -78.216938);
        googleMap.addMarker(new MarkerOptions().position(lotsouth)
                .title("Former site of Lutheran and German Reform Church Chapel and Cemetery"));
        //Add marker for (3)
        LatLng methodistchurch = new LatLng(39.086219, -78.216642);
        googleMap.addMarker(new MarkerOptions().position(methodistchurch)
                .title("First Methodist Church Cemetery"));
        //Add marker for (4)
        LatLng orrick = new LatLng(39.084362, -78.215604);
        googleMap.addMarker(new MarkerOptions().position(orrick)
                .title("Orrick Chapel"));
        //Add marker for (5)
        LatLng african = new LatLng(39.087338, -78.220137);
        googleMap.addMarker(new MarkerOptions().position(african)
                .title("Locust Grove — African American Cemetery"));
        //Add marker for (6)
        LatLng greenhill = new LatLng(39.085160, -78.220606);
        googleMap.addMarker(new MarkerOptions().position(greenhill)
                .title("Green Hill Cemetery — European Descent Cemetery"));
        //Add marker for (7)
        LatLng stephensstreet = new LatLng(39.080298, -78.222009);
        googleMap.addMarker(new MarkerOptions().position(stephensstreet)
                .title("Approximate site of log home built by original settler Peter Stephens and his family circa 1732"));
        //Add marker for (8)
        LatLng primitive = new LatLng(39.081185, -78.219866);
        googleMap.addMarker(new MarkerOptions().position(primitive)
                .title("St. John's Primitive Baptist Church built in 1892 by African American Primitive Baptists"));
        //Add marker for (9)
        LatLng original = new LatLng(39.087894, -78.218910);
        googleMap.addMarker(new MarkerOptions().position(original)
                .title("Original home of Lewis Stephens Jr. and later home of John Bell Tilden, Revolutionary War veteran and Methodist minister"));
        //Add marker for (10)
        LatLng store = new LatLng(39.084377, -78.217057);
        googleMap.addMarker(new MarkerOptions().position(store)
                .title("Known during the Civil War as Samuel Hull's Store"));
//        //Add marker for (11)
//        LatLng steele = new LatLng(39.087280, -78.214820);
//        googleMap.addMarker(new MarkerOptions().position(steele)
//                .title("Home of the Steele family who acquired the property in 1847 and kept diaries during the Civil War"));
//        //Add marker for (12)
//        LatLng general = new LatLng(39.089586, -78.212818);
//        googleMap.addMarker(new MarkerOptions().position(general)
//                .title("Approximate site of Methodist parsonage burned by General Hunter's Union Troops during May of 1864 due to misunderstanding about an attack on a Union wagon train\n"));
//        //Add marker for (13)
//        LatLng market = new LatLng(39.083115, -78.218315);
//        googleMap.addMarker(new MarkerOptions().position(market)
//                .title("Site of the town's Market House that was torn down in 1833 to make way for the macadamized paving of the Valley Pike (U.S. Rt. 11)"));
//        //Add marker for (14)
        LatLng lemley = new LatLng(39.085057, -78.218221);
//        googleMap.addMarker(new MarkerOptions().position(lemley)
//                .title("Home of James Lemley (1821-1899) who was a blacksmith and son of one of the town's most noted blacksmith/wagon makers "));
//        //Add marker for (15)
//        LatLng stone = new LatLng(39.082489, -78.218714);
//        googleMap.addMarker(new MarkerOptions().position(stone)
//                .title("Stone House - possibly the oldest standing house in town"));
//        //Add marker for (16)
//        LatLng newtown = new LatLng(39.079407, -78.221703);
//        googleMap.addMarker(new MarkerOptions().position(newtown)
//                .title("Newtown History Center housed in 1819 Newtown Tavern/Hotel"));
//        //Add marker for (17)
//        LatLng steelestore = new LatLng(39.084132, -78.217426);
//        googleMap.addMarker(new MarkerOptions().position(steelestore)
//                .title("Steele House & Streele & Bro. Store"));
//        //Add marker for (18)
//        LatLng school = new LatLng(39.080635, -78.220239);
//        googleMap.addMarker(new MarkerOptions().position(school)
//                .title("Old Stephen City School built in 1916"));
//        //Add marker for (19)
//        LatLng toll = new LatLng(39.079374, -78.222020);
//        googleMap.addMarker(new MarkerOptions().position(toll)
//                .title("Site of Nicewanger's Toll House"));

        // Sets the camera at a location that is at center of the map

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(lemley));

        // Creates a window with simple title/description on click and sets a click listener for the window that pops up

        googleMap.setOnInfoWindowClickListener(new GoogleMap.OnInfoWindowClickListener() {
            @Override
            public void onInfoWindowClick(Marker marker) {
                loadLocationInfo(locations.get(0));
            }
        });

    }

    private void setLocations() {
        Location mLocation = new Location("Locust Grove — African American Cemetery", "In the decade after the Civil War two cemeteries were established on land that was once the town’s common, a tract originally held in reserve by the town’s proprietor Lewis Stephens. The African American population of the town and its African American suburb to the east, called Crossroads or Freetown, buried their dead here in this cemetery. In includes the grave of Cornelia Barbour Turner Avery (1867-1927), a noted midwife and matriarch of the town’s African American community. This cemetery remains in active use.", "Southeast Corner of Grove and Locust Streets: Locust Grove", "@drawable/pt5", 39.087338, 78.220137);
        locations.add(mLocation);

    }

    private void loadLocationInfo(Location location) {
        InfoPageFragment mFrag = new InfoPageFragment();
        FragmentTransaction t = this.getFragmentManager().beginTransaction();
        t.addToBackStack("Event");
        mFrag.passLocation(location);
        t.replace(R.id.main_container, mFrag);
        t.commit();
    }
}


