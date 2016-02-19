package dev.android.cl.colorpalette.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import dev.android.cl.colorpalette.R;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final TableLayout tableLayout = (TableLayout) findViewById(R.id.tableLayout);

        float colorBoxHeight = getApplication().getResources().getDimension(R.dimen.color_box_height);
        float colorBoxWidth = getApplication().getResources().getDimension(R.dimen.color_box_width);
        float colorBoxPadding = getApplication().getResources().getDimension(R.dimen.color_box_padding);


        int intColorBoxHeight = Math.round(colorBoxHeight);
        int intColorBoxWidth = Math.round(colorBoxWidth);
        int intColorBoxPadding = Math.round(colorBoxPadding);

        String[] allColors = getApplicationContext().getResources().getStringArray(R.array.colors);
        String[] allColorName = getApplicationContext().getResources().getStringArray(R.array.colors);

        int intColorPosition = 0;
        for (int i = 0; i <= 83; i++) {

            final TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(
                    new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));

            for (int j = 1; j <= 3; j++) {

                final TextView textColorHex = new TextView(this);
                textColorHex.setText(allColorName[intColorPosition]);
                textColorHex.setLayoutParams(new TableRow.LayoutParams(intColorBoxWidth, intColorBoxHeight, 1));
                textColorHex.setPadding(intColorBoxPadding, intColorBoxPadding, intColorBoxPadding, intColorBoxPadding);
                textColorHex.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
                textColorHex.setBackgroundColor(Color.parseColor(allColors[intColorPosition]));

                tableRow.addView(textColorHex);
                intColorPosition++;
            }
            tableLayout.addView(tableRow);
        }
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
