package han.svuspiral.phonetoad;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class SplashActivity extends AppCompatActivity {

    private TextView p1;
    private TextView p2;
    private TextView p3;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
            p1 = (TextView)
                    findViewById(R.id.p1);
            p2 = (TextView)
                    findViewById(R.id.p2);
            imageView = (ImageView)
                    findViewById(R.id.imageView);
            p3 = (TextView)
                    findViewById(R.id.p3);
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
        finish();
    }

}