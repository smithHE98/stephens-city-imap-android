package han.svuspiral.phonetoad;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class SplashActivity extends AppCompatActivity {

private TextView tv1;
private TextView tv2;
private TextView tv3;
private ImageView iv;
private Typeface economica_bold, lora_regular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // Initializes views for Text & Image

            tv1 = (TextView)
                    findViewById(R.id.splashtitle);
            tv2 = (TextView)
                    findViewById(R.id.splashtitle2);
            iv = (ImageView)
                    findViewById(R.id.logo);
            tv3 = (TextView)
                    findViewById(R.id.warning);

        // Sets typeface for text

            economica_bold = Typeface.createFromAsset(getAssets(), "font/Economica-Bold.ttf");
            lora_regular = Typeface.createFromAsset(getAssets(), "font/Lora-Regular.ttf");
            tv1.setTypeface(economica_bold);
            tv2.setTypeface(economica_bold);
            tv3.setTypeface(lora_regular);

        // Transition to MainActivity

        final Intent i = new Intent(this, MainActivity.class);

        // Timer for splash screen

        Thread timer = new Thread() {
            public void run () {
                try {
                    sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();

                }
            }
        };
        timer.start();


    }
    }

