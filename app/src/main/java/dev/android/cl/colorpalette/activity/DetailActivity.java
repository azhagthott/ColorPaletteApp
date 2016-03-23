package dev.android.cl.colorpalette.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import dev.android.cl.colorpalette.R;
import dev.android.cl.colorpalette.adapter.DetailedListViewAdapter;
import dev.android.cl.colorpalette.color.MaterialColor;

public class DetailActivity extends AppCompatActivity {

    private static final String LOG_TAG = DetailActivity.class.getSimpleName();
    private Toolbar toolbar;
    private String colorGroupName;
    private int i;
    private MaterialColor materialColor;
    private TextView textViewColorName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayList<MaterialColor> arrayList = new ArrayList<>();
        DetailedListViewAdapter adapter = new DetailedListViewAdapter(getApplicationContext(), arrayList);
        ListView listView = (ListView) findViewById(R.id.listView);

        textViewColorName = (TextView) findViewById(R.id.textViewColorName);

        adapter.clear();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            /*
            *
            * i.putExtra("SELECTED_COLOR_NAME", materialColor.getName());
                        i.putExtra("GROUP_COLOR_NAME", "red");
                        i.putExtra("COLOR_POSITION", finalIntColorPosition);
            * */

            String colorName = extras.getString("SELECTED_COLOR_NAME");
            colorGroupName = extras.getString("GROUP_COLOR_NAME");
            int colorPosition = extras.getInt("COLOR_POSITION");

            Log.d(LOG_TAG, "#########################################");
            Log.d(LOG_TAG, "onItemClick: colorName " + colorName);
            Log.d(LOG_TAG, "onItemClick: colorGroupName " + colorGroupName);
            Log.d(LOG_TAG, "onItemClick: colorPosition " + colorPosition);
            Log.d(LOG_TAG, "#########################################");

            MaterialColor materialColor = new MaterialColor();
            String[] colors = materialColor.getAllColorsByGroup(this, colorGroupName);

            for (i = 0; i < colors.length; i++) {
                MaterialColor colorToAdd = new MaterialColor();
                colorToAdd.setName(colors[i]);
                colorToAdd.setHEX(colors[i]);
                adapter.add(colorToAdd);
            }
        }

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), DetailScrollingActivity.class);
                i.putExtra("GROUP_COLOR_NAME", "red");

                Log.d(LOG_TAG, "#########################################");
                Log.d(LOG_TAG, "onItemClick: View " + view);
                Log.d(LOG_TAG, "onItemClick: position " + position);
                Log.d(LOG_TAG, "onItemClick: id " + id);
                Log.d(LOG_TAG, "#########################################");
                //startActivity(i);
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
