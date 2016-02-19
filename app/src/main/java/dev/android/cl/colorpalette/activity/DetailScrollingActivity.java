package dev.android.cl.colorpalette.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import dev.android.cl.colorpalette.R;

public class DetailScrollingActivity extends AppCompatActivity {

    private static final String LOG_TAG = DetailScrollingActivity.class.getSimpleName();
    private CollapsingToolbarLayout toolbar_layout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_scrolling);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar_layout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String colorName = extras.getString("COLOR_NAME");
            Log.d(LOG_TAG, "onCreate: " + colorName);

            toolbar.setBackgroundColor(Color.parseColor(colorName));
            toolbar_layout.setBackgroundColor(Color.parseColor(colorName));
            toolbar_layout.setTitle(colorName);

        }


        setSupportActionBar(toolbar);

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
