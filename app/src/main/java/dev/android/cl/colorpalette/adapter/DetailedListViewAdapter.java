package dev.android.cl.colorpalette.adapter;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import dev.android.cl.colorpalette.R;
import dev.android.cl.colorpalette.color.MaterialColor;

/**
 * Created by fran on 01-03-16.
 */
public class DetailedListViewAdapter extends ArrayAdapter<MaterialColor> {

    private static final String LOG_TAG = DetailedListViewAdapter.class.getSimpleName();

    public DetailedListViewAdapter(Context context, ArrayList<MaterialColor> materialColors) {
        super(context, 0, materialColors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        MaterialColor materialColor = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_main, parent, false);
        }

        TextView textViewColorName = (TextView) convertView.findViewById(R.id.textViewColorName);
        ImageView imageViewBackgroundColor = (ImageView) convertView.findViewById(R.id.imageViewBackgroundColor);

        textViewColorName.setText(materialColor.getName());
        imageViewBackgroundColor.setBackgroundColor(Color.parseColor(materialColor.getHEX()));

        return convertView;
    }
}
