package com.tiemenschut.tutorials.progressbar;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ProgressBarTutorial extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar_tutorial);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_progress_bar_tutorial, menu);
        return true;
    }

}
