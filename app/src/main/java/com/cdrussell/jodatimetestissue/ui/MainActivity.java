package com.cdrussell.jodatimetestissue.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.cdrussell.jodatimetestissue.R;
import com.cdrussell.jodatimetestissue.business.BusinessLogic;

import org.joda.time.DateTime;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String formattedDate = new BusinessLogic().formatDate(DateTime.now());
        Log.i(TAG, "Current time is "  + formattedDate);
    }
}
