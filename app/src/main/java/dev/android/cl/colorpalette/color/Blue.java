package dev.android.cl.colorpalette.color;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dev.android.cl.colorpalette.R;

/**
 * Created by fran on 15-02-16.
 */
public class Blue {

    public static final String LOG_TAG = Blue.class.getSimpleName();
    //public List<MaterialColor> listBlue = new ArrayList<>();

    public List<MaterialColor> listBlue = new ArrayList<>();

    public Blue() {
    }

    public List<MaterialColor> getAllBlue(Context c) {

        int BLUE_50 = c.getResources().getColor(R.color.blue_50);
        int BLUE_100 = c.getResources().getColor(R.color.blue_100);
        int BLUE_200 = c.getResources().getColor(R.color.blue_200);
        int BLUE_300 = c.getResources().getColor(R.color.blue_300);
        int BLUE_400 = c.getResources().getColor(R.color.blue_400);
        int BLUE_500 = c.getResources().getColor(R.color.blue_500);
        int BLUE_600 = c.getResources().getColor(R.color.blue_600);
        int BLUE_700 = c.getResources().getColor(R.color.blue_700);
        int BLUE_800 = c.getResources().getColor(R.color.blue_800);
        int BLUE_900 = c.getResources().getColor(R.color.blue_900);
        int BLUE_A100 = c.getResources().getColor(R.color.blue_A100);
        int BLUE_A200 = c.getResources().getColor(R.color.blue_A200);
        int BLUE_A400 = c.getResources().getColor(R.color.blue_A400);
        int BLUE_A700 = c.getResources().getColor(R.color.blue_A700);


        try {


        } catch (Exception e) {
            Log.d(LOG_TAG, "getAllBlue: " + e);
        }
        return listBlue;
    }

}
