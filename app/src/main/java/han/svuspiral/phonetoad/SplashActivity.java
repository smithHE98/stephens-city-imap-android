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
private Typeface ef, lf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
            tv1 = (TextView)
                    findViewById(R.id.tv1);
            tv2 = (TextView)
                    findViewById(R.id.tv2);
            iv = (ImageView)
                    findViewById(R.id.iv);
            tv3 = (TextView)
                    findViewById(R.id.tv3);
            ef = Typeface.createFromAsset(getAssets(), "font/Economica-Bold.ttf");
            lf = Typeface.createFromAsset(getAssets(), "font/Lora-Regular.ttf");
            tv1.setTypeface(ef);
            tv2.setTypeface(ef);
            tv3.setTypeface(lf);
        final Intent i = new Intent(this, MainActivity.class);
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

