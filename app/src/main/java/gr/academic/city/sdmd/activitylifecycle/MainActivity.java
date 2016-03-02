package gr.academic.city.sdmd.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = "LifecycleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG, "The activity is being created.");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "The activity is about to become visible.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "The activity has become visible (it is now \"resumed\").");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "Another activity is taking focus (this activity is about to be \"paused\").");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "The activity is no longer visible (it is now \"stopped\")");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "The activity is about to be destroyed.");
    }
}
