package com.elite.activitytransition;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by wjc13 on 2015/10/9.
 */
public class SharedActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        setContentView(R.layout.activity_transition);

    }
}
