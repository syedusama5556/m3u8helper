package com.utech.m3u8helper;


public interface OnDeleteTaskListener extends BaseListener {
    void onStart();

    void onSuccess();

    void onFail();
}
