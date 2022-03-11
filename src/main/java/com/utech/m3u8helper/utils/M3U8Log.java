package com.utech.m3u8helper.utils;

import android.util.Log;

import com.utech.m3u8helper.M3U8Config;

public class M3U8Log {

    private static String TAG = "M3U8Log";

    public static void d(String msg){
        if (M3U8Config.isDebugMode()) Log.d(TAG, msg);
    }

    public static void e(String msg){
        if (M3U8Config.isDebugMode()) Log.e(TAG, msg);
    }


}
