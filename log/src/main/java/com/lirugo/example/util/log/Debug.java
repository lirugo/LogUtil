package com.lirugo.example.util.log;

import android.util.Log;

public class Debug {
    private static final String TAG = "Debug";

    public void p(String message) {
        Log.d(TAG, message);
    }
}
