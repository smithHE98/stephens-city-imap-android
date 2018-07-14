package han.svuspiral.phonetoad;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;


/**
 * Created by han on 7/13/2018.
 */

public class JSONParser {

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
