package han.svuspiral.phonetoad;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoPageFragment extends Fragment {

    View mView;
    private ImageView iv;
    private TextView tv1;
    private TextView tv2;
    private Typeface ef;
    private Typeface lf;
    location mlocation;

    public InfoPageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView =  inflater.inflate(R.layout.fragment_info_page, container, false);
        // Inflate the layout for this fragment
        iv = (ImageView)
                mView.findViewById(R.id.iv);
        tv1 = (TextView)
                mView.findViewById(R.id.tv1);
        tv2 = (TextView)
                mView.findViewById(R.id.tv2);

        ef = Typeface.createFromAsset(getActivity().getAssets(), "font/Economica-Bold.ttf");
        lf = Typeface.createFromAsset(getActivity().getAssets(), "font/Lora-Regular.ttf");
        tv1.setTypeface(ef);
        tv2.setTypeface(lf);
        updateInfo();



        return mView;
    }

    public void loadLocation(location Location){
        mlocation = Location;

    }

//    public void onClick(View v){

 //       getActivity().getFragmentManager().popBackStack();
 //   }

    private void updateInfo(){
//        iv.setImageDrawable(Drawable.createFromPath(mlocation.getImage()));
//        tv1.setText(mlocation.getTitle());
//        tv2.setText(mlocation.getDescription());
    }

}
