package han.svuspiral.phonetoad;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoPageFragment extends android.support.v4.app.Fragment implements View.OnClickListener {

    ImageView imageView;
    TextView title;
    TextView description;
    TextView address;
    Button returnToMap;
    Location mLocation;
    private Typeface economica_bold, lora_regular;

    public InfoPageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_info_page, container, false);

        // Initializes views for Text & Image

        imageView = (ImageView) view.findViewById(R.id.image_view);
        title = (TextView) view.findViewById(R.id.title_view);
        description = (TextView) view.findViewById(R.id.description_view);
        address = (TextView) view.findViewById(R.id.address_view);
        returnToMap = (Button) view.findViewById(R.id.returnToMap);
        returnToMap.setOnClickListener(this);

        // Sets typeface for text

        economica_bold = Typeface.createFromAsset(getActivity().getAssets(), "font/Economica-Bold.ttf");
        lora_regular = Typeface.createFromAsset(getActivity().getAssets(), "font/Lora-Regular.ttf");
        title.setTypeface(economica_bold);
        description.setTypeface(lora_regular);
        address.setTypeface(economica_bold);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        updateLocationInfo();
    }

    // onClick method for button to go back to map

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.returnToMap) {
            android.support.v4.app.FragmentTransaction t = this.getFragmentManager().beginTransaction();
            t.addToBackStack("map");
            MapFragment mFrag = new MapFragment();
            t.replace(R.id.main_container, mFrag);
            t.commit();
        }
    }

    // Location information updater

    private void updateLocationInfo() {
        title.setText(mLocation.getTitle().toString());
        description.setText(mLocation.getDescription().toString());
        address.setText(mLocation.getAddress().toString());
        Context context = imageView.getContext();
        int id = context.getResources().getIdentifier(mLocation.getImage(), "drawable", context.getPackageName());
        imageView.setImageResource(id);
    }

    public void passLocation(Location location) {
        mLocation = location;
    }

}
