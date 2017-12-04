package han.svuspiral.phonetoad;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Context;
import android.widget.Toast;

import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback, OnMarkerClickListener {

    ArrayList<location> locations;
    JSONObject locationInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);
        locations = new ArrayList<>();
        try {
            locationInfo = new JSONObject(loadJSONFromAsset(this));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        getLocations();
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera.
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
        //Add marker for (11)
        LatLng steele = new LatLng(39.087280, -78.214820);
        googleMap.addMarker(new MarkerOptions().position(steele)
                .title("Home of the Steele family who acquired the property in 1847 and kept diaries during the Civil War"));
        //Add marker for (12)
        LatLng general = new LatLng(39.089586, -78.212818);
        googleMap.addMarker(new MarkerOptions().position(general)
                .title("Approximate site of Methodist parsonage burned by General Hunter's Union Troops during May of 1864 due to misunderstanding about an attack on a Union wagon train\n"));
        //Add marker for (13)
        LatLng market = new LatLng(39.083115, -78.218315);
        googleMap.addMarker(new MarkerOptions().position(market)
                .title("Site of the town's Market House that was torn down in 1833 to make way for the macadamized paving of the Valley Pike (U.S. Rt. 11)"));
        //Add marker for (14)
        LatLng lemley = new LatLng(39.085057, -78.218221);
        googleMap.addMarker(new MarkerOptions().position(lemley)
                .title("Home of James Lemley (1821-1899) who was a blacksmith and son of one of the town's most noted blacksmith/wagon makers "));
        //Add marker for (15)
        LatLng stone = new LatLng(39.082489, -78.218714);
        googleMap.addMarker(new MarkerOptions().position(stone)
                .title("Stone House - possibly the oldest standing house in town"));
        //Add marker for (16)
        LatLng newtown = new LatLng(39.079407, -78.221703);
        googleMap.addMarker(new MarkerOptions().position(newtown)
                .title("Newtown History Center housed in 1819 Newtown Tavern/Hotel"));
        //Add marker for (17)
        LatLng steelestore = new LatLng(39.084132, -78.217426);
        googleMap.addMarker(new MarkerOptions().position(steelestore)
                .title("Steele House & Streele & Bro. Store"));
        //Add marker for (18)
        LatLng school = new LatLng(39.080635, -78.220239);
        googleMap.addMarker(new MarkerOptions().position(school)
                .title("Old Stephen City School built in 1916"));
        //Add marker for (19)
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
      //  for (int i = 0; locations.size() > i; i++) {
           // if (marker.getId().equals(locations.get(i).getTitle())) {

                  FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                  fragmentTransaction.addToBackStack("");
                  fragmentTransaction.replace(R.id.map, new InfoPageFragment());
                  fragmentTransaction.commit();

          //  }
            return true;
      //  }

     //   return true;
    }

    /** Method to get locations. */
    private void getLocations(){
        Gson gson = new GsonBuilder().create();
        location newLocation = gson.fromJson(String.valueOf(locationInfo), location.class);
        locations.add(newLocation);
        locations.add(new location("Old Town Cemetery and site of town East Academy", "string", "place", "@drawable/pt1", 39.081549, -78.218520));
  //      Toast.makeText(this, locations.get(0).title , Toast.LENGTH_LONG).show();
    }

    public String loadJSONFromAsset(Context context) {
        String json = null;
        try {
            InputStream is = context.getAssets().open("phoneToadAddresses.json");

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }
}
