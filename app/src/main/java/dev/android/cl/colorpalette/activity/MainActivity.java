package dev.android.cl.colorpalette.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TableLayout;

import dev.android.cl.colorpalette.R;
import dev.android.cl.colorpalette.color.Amber;
import dev.android.cl.colorpalette.color.Blue;
import dev.android.cl.colorpalette.color.BlueGrey;
import dev.android.cl.colorpalette.color.Brown;
import dev.android.cl.colorpalette.color.Cyan;
import dev.android.cl.colorpalette.color.DeepOrange;
import dev.android.cl.colorpalette.color.DeepPurple;
import dev.android.cl.colorpalette.color.Green;
import dev.android.cl.colorpalette.color.Grey;
import dev.android.cl.colorpalette.color.Indigo;
import dev.android.cl.colorpalette.color.LightBlue;
import dev.android.cl.colorpalette.color.LightGreen;
import dev.android.cl.colorpalette.color.Lime;
import dev.android.cl.colorpalette.color.Orange;
import dev.android.cl.colorpalette.color.Pink;
import dev.android.cl.colorpalette.color.Purple;
import dev.android.cl.colorpalette.color.Red;
import dev.android.cl.colorpalette.color.Teal;
import dev.android.cl.colorpalette.color.Yellow;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout);

        /*
        *
        * red, pink, purple, deep_purple, indigo, blue, light_blue, cyan,
        * teal, green, light_green, lime, yellow, amber, orange, deep_orange
        * grey, brown, blue_grey
        *
        */

        Red red = new Red(this);
        red.setTextViewColor(tableLayout);
        red.allColorRed(tableLayout);

        Pink pink = new Pink(this);
        pink.setTextViewColor(tableLayout);
        pink.allColorPink(tableLayout);

        Purple purple = new Purple(this);
        purple.setTextViewColor(tableLayout);
        purple.allColorPurple(tableLayout);

        DeepPurple deepPurple = new DeepPurple(this);
        deepPurple.setTextViewColor(tableLayout);
        deepPurple.allColorDeepPurple(tableLayout);

        Indigo indigo = new Indigo(this);
        indigo.setTextViewColor(tableLayout);
        indigo.allColorIndigo(tableLayout);

        Blue blue = new Blue(this);
        blue.setTextViewColor(tableLayout);
        blue.allColorBlue(tableLayout);

        LightBlue lightBlue = new LightBlue(this);
        lightBlue.setTextViewColor(tableLayout);
        lightBlue.allColorLightBlue(tableLayout);

        Cyan cyan = new Cyan(this);
        cyan.setTextViewColor(tableLayout);
        cyan.allColorCyan(tableLayout);

        Teal teal = new Teal(this);
        teal.setTextViewColor(tableLayout);
        teal.allColorTeal(tableLayout);

        Green green = new Green(this);
        green.setTextViewColor(tableLayout);
        green.allColorGreen(tableLayout);

        LightGreen lightGreen = new LightGreen(this);
        lightGreen.setTextViewColor(tableLayout);
        lightGreen.allColorLightGreen(tableLayout);

        Lime lime = new Lime(this);
        lime.setTextViewColor(tableLayout);
        lime.allColorLime(tableLayout);

        Yellow yellow = new Yellow(this);
        yellow.setTextViewColor(tableLayout);
        yellow.allColorYellow(tableLayout);

        Amber amber = new Amber(this);
        amber.setTextViewColor(tableLayout);
        amber.allColorAmber(tableLayout);

        Orange orange = new Orange(this);
        orange.setTextViewColor(tableLayout);
        orange.allColorOrange(tableLayout);

        DeepOrange deepOrange = new DeepOrange(this);
        deepOrange.setTextViewColor(tableLayout);
        deepOrange.allColorDeepOrange(tableLayout);

        Grey grey = new Grey(this);
        grey.setTextViewColor(tableLayout);
        grey.allColorGrey(tableLayout);

        Brown brown = new Brown(this);
        brown.setTextViewColor(tableLayout);
        brown.allColorBrown(tableLayout);

        BlueGrey blueGrey = new BlueGrey(this);
        blueGrey.setTextViewColor(tableLayout);
        blueGrey.allColorBlueGrey(tableLayout);

        tableLayout.setBackgroundColor(getResources().getColor(R.color.grey_800));
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
