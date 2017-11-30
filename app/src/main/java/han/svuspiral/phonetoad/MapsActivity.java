package han.svuspiral.phonetoad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.content.Context;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback, OnMarkerClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user receives a prompt to install
     * Play services inside the SupportMapFragment. The API invokes this method after the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        // Add a marker in Stephens City, Virginia,
        // and move the map's camera to the same location.

        googleMap.setMinZoomPreference(15.0f);
        googleMap.setMaxZoomPreference(20.0f);

        //Add a marker
        LatLng mulberry = new LatLng(39.081549, -78.218520);
        googleMap.addMarker(new MarkerOptions().position(mulberry)
                .title("Old Town Cemetery and site of town East Academy"));
        //Add a marker
        LatLng lotsouth = new LatLng(39.082940, -78.216938);
        googleMap.addMarker(new MarkerOptions().position(lotsouth)
                .title("Former site of Lutheran and German Reform Church Chapel and Cemetery"));
        //Add a marker
        LatLng methodistchurch = new LatLng(39.086219, -78.216642);
        googleMap.addMarker(new MarkerOptions().position(methodistchurch)
                .title("First Methodist Church Cemetery"));
        //Add a marker
        LatLng orrick = new LatLng(39.087338, -78.220137);
        googleMap.addMarker(new MarkerOptions().position(orrick)
                .title("Orrick Chapel"));
        //Add a marker
        LatLng african = new LatLng(39.087338, -78.220137);
        googleMap.addMarker(new MarkerOptions().position(african)
                .title("Locust Grove — African American Cemetery"));
        //Add a marker
        LatLng greenhill = new LatLng(39.085160, -78.220606);
        googleMap.addMarker(new MarkerOptions().position(greenhill)
                .title("Green Hill Cemetery — European Descent Cemetery"));
        //Add a marker
        LatLng stephensstreet = new LatLng(39.080298, -78.222009);
        googleMap.addMarker(new MarkerOptions().position(stephensstreet)
                .title("Approximate site of log home built by original settler Peter Stephens and his family circa 1732"));
        //Add a marker
        LatLng primitive = new LatLng(39.081185, -78.219866);
        googleMap.addMarker(new MarkerOptions().position(primitive)
                .title("St. John's Primitive Baptist Church built in 1892 by African American Primitive Baptists"));
        //Add a marker
        LatLng original = new LatLng(39.087894, -78.218910);
        googleMap.addMarker(new MarkerOptions().position(original)
                .title("Original home of Lewis Stephens Jr. and later home of John Bell Tilden, Revolutionary War veteran and Methodist minister"));
        //Add a marker
        LatLng store = new LatLng(39.084377, -78.217057);
        googleMap.addMarker(new MarkerOptions().position(store)
                .title("Known during the Civil War as Samuel Hull's Store"));
        //Add a marker
        LatLng steele = new LatLng(39.087280, -78.214820);
        googleMap.addMarker(new MarkerOptions().position(steele)
                .title("Home of the Steele family who acquired the property in 1847 and kept diaries during the Civil War"));
        //Add a marker
        LatLng general = new LatLng(39.089586, -78.212818);
        googleMap.addMarker(new MarkerOptions().position(general)
                .title("Approximate site of Methodist parsonage burned by General Hunter's Union Troops during May of 1864 due to misunderstanding about an attack on a Union wagon train\n"));
        //Add a marker
        LatLng market = new LatLng(39.083115, -78.218315);
        googleMap.addMarker(new MarkerOptions().position(market)
                .title("Site of the town's Market House that was torn down in 1833 to make way for the macadamized paving of the Valley Pike (U.S. Rt. 11)"));
        //Add a marker
        LatLng lemley = new LatLng(39.085057, -78.218221);
        googleMap.addMarker(new MarkerOptions().position(lemley)
                .title("Home of James Lemley (1821-1899) who was a blacksmith and son of one of the town's most noted blacksmith/wagon makers "));
        //Add a marker
        LatLng stone = new LatLng(39.082489, -78.218714);
        googleMap.addMarker(new MarkerOptions().position(stone)
                .title("Stone House - possibly the oldest standing house in town"));
        //Add a marker
        LatLng newtown = new LatLng(39.079407, -78.221703);
        googleMap.addMarker(new MarkerOptions().position(newtown)
                .title("Newtown History Center housed in 1819 Newtown Tavern/Hotel"));
        //Add a marker
        LatLng steelestore = new LatLng(39.084132, -78.217426);
        googleMap.addMarker(new MarkerOptions().position(steelestore)
                .title("Steele House & Streele & Bro. Store"));
        //Add a marker
        LatLng school = new LatLng(39.080635, -78.220239);
        googleMap.addMarker(new MarkerOptions().position(school)
                .title("Old Stephen City School built in 1916"));
        //Add a marker
        LatLng toll = new LatLng(39.079374, -78.222020);
        googleMap.addMarker(new MarkerOptions().position(toll)
                .title("Site of Nicewanger's Toll House"));

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(lemley));

        // Set a listener for marker click.
        googleMap.setOnMarkerClickListener(this);
        }

    /** Called when the user clicks a marker. */
    @Override
    public boolean onMarkerClick(final Marker marker) {
        Context context = this;
        Intent intent = new Intent(context, InfoPageActivity.class);
        startActivity(intent);
        return true;
    }

}
