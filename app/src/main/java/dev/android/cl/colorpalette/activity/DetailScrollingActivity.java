package dev.android.cl.colorpalette.activity;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import dev.android.cl.colorpalette.R;
import dev.android.cl.colorpalette.color.MaterialColor;

public class DetailScrollingActivity extends AppCompatActivity {

    private static final String LOG_TAG = DetailScrollingActivity.class.getSimpleName();
    private CollapsingToolbarLayout toolbarLayout;
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;
    private String colorGroupName;
    private int i;
    private MaterialColor materialColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_scrolling);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            String colorName = extras.getString("SELECTED_COLOR_NAME");
            colorGroupName = extras.getString("GROUP_COLOR_NAME");
            int colorPosition = extras.getInt("COLOR_POSITION");

            toolbarLayout.setTitle(colorName);
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
