package dev.android.cl.colorpalette.color;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import dev.android.cl.colorpalette.R;
import dev.android.cl.colorpalette.activity.DetailActivity;
import dev.android.cl.colorpalette.util.Constant;

/**
 * Created by fran on 15-02-16.
 */
public class DeepOrange {

    private static final String LOG_TAG = Red.class.getSimpleName();

    private Context context;

    private float colorBoxHeight;
    private float colorBoxWidth;
    private float colorBoxPadding;

    private int intColorBoxHeight;
    private int intColorBoxWidth;
    private int intColorBoxPadding;

    public DeepOrange() {
    }

    public DeepOrange(Context context) {
        this.context = context;
    }

    public View allColorDeepOrange(View view) {
        TableLayout tableLayout = (TableLayout) view.findViewById(R.id.tableLayout);

        colorBoxHeight = context.getResources().getDimension(R.dimen.color_box_height);
        colorBoxWidth = context.getResources().getDimension(R.dimen.color_box_width);
        colorBoxPadding = context.getResources().getDimension(R.dimen.color_box_padding);

        intColorBoxHeight = Math.round(colorBoxHeight);
        intColorBoxWidth = Math.round(colorBoxWidth);
        intColorBoxPadding = Math.round(colorBoxPadding);

        MaterialColor getMaterialColorArray = new MaterialColor();
        String[] allColor = getMaterialColorArray.getColorsValues(context, context.getResources().getString(R.string.deep_orange));

        int intColorPosition = 0;
        for (int i = 0; i < allColor.length / 2; i++) {

            final TableRow tableRow = new TableRow(context);
            tableRow.setLayoutParams(
                    new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));

            for (int j = 1; j <= 2; j++) {

                final TextView textColorHex = new TextView(context);
                textColorHex.setText(allColor[intColorPosition]);

                textColorHex.setLayoutParams(new TableRow.LayoutParams(intColorBoxWidth, intColorBoxHeight, 1));
                textColorHex.setPadding(intColorBoxPadding, intColorBoxPadding, intColorBoxPadding, intColorBoxPadding);
                textColorHex.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
                textColorHex.setBackgroundColor(Color.parseColor(allColor[intColorPosition]));

                final MaterialColor materialColor = new MaterialColor();
                materialColor.setName(allColor[intColorPosition]);

                final int finalIntColorPosition = intColorPosition;
                textColorHex.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(context.getApplicationContext(), DetailActivity.class);
                        i.putExtra("SELECTED_COLOR_NAME", materialColor.getName());
                        i.putExtra("GROUP_COLOR_NAME", "deep_orange");
                        i.putExtra("COLOR_POSITION", finalIntColorPosition);
                        context.startActivity(i);
                    }
                });

                tableRow.addView(textColorHex);
                intColorPosition++;
            }
            tableLayout.addView(tableRow);
        }
        return tableLayout;
    }

    public View setTextViewColor(View view) {

        TableLayout tableLayout = (TableLayout) view.findViewById(R.id.tableLayout);
        colorBoxPadding = context.getResources().getDimension(R.dimen.color_box_padding);
        intColorBoxPadding = Math.round(colorBoxPadding);

        TextView textView = new TextView(context);
        textView.setText(R.string.deep_orange_title);
        textView.setTextColor(context.getResources().getColor(R.color.grey_50));
        textView.setPadding(intColorBoxPadding * 2, intColorBoxPadding * 2, intColorBoxPadding * 2, intColorBoxPadding * 2);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, Constant.BOX_TILE_TEXT_SIZE);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                colorBoxHeight = context.getResources().getDimension(R.dimen.color_box_height);
                Intent i = new Intent(context.getApplicationContext(), DetailActivity.class);
                i.putExtra("GROUP_COLOR_NAME", "deep_orange");
                context.startActivity(i);
            }
        });
        tableLayout.addView(textView);
        return tableLayout;
    }
}