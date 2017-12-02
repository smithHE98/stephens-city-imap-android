package han.svuspiral.phonetoad;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoPageActivity extends AppCompatActivity {

    private ImageView iv;
    private TextView tv1;
    private TextView tv2;
    private Typeface ef;
    private Typeface lf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_page);
        iv = (ImageView)
                findViewById(R.id.iv);
        tv1 = (TextView)
                findViewById(R.id.tv1);
        tv2 = (TextView)
                findViewById(R.id.tv2);

        ef = Typeface.createFromAsset(getAssets(), "font/Economica-Bold.ttf");
        lf = Typeface.createFromAsset(getAssets(), "font/Lora-Regular.ttf");
        tv1.setTypeface(ef);
        tv2.setTypeface(lf);
    }



    public void onClick(View v){
        startActivity(new Intent(InfoPageActivity.this, MapsActivity.class));
    }

}
