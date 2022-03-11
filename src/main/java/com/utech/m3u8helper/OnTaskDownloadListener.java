package com.utech.m3u8helper;


import com.utech.m3u8helper.model.M3U8;


interface OnTaskDownloadListener extends BaseListener {

    void onStartDownload(int totalTs, int curTs);

    void onDownloading(long totalFileSize, long itemFileSize, int totalTs, int curTs);

    void onSuccess(M3U8 m3U8);

    void onProgress(long curLength);

    void onStart();

    void onError(Throwable errorMsg);
}
