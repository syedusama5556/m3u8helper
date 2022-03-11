package com.utech.m3u8helper;


import com.utech.m3u8helper.model.M3U8;


public interface OnM3U8InfoListener extends BaseListener {

    @Override
    void onStart();

    void onSuccess(M3U8 m3U8);

    @Override
    void onError(Throwable errorMsg);
}
