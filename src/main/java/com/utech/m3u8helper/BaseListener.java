package com.utech.m3u8helper;

public interface BaseListener {
    void onStart();

    void onError(Throwable errorMsg);
}
