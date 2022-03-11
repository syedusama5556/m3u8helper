package com.utech.m3u8helper;

import com.utech.m3u8helper.model.M3U8FileTask;



public abstract class M3U8FileDownloadListener {

    public void onDownloadItem(M3U8FileTask task, long itemFileSize, int totalTs, int curTs) {

    }

    public void onDownloadSuccess(M3U8FileTask task) {

    }

    public void onDownloadPause(M3U8FileTask task) {

    }

    public void onDownloadPending(M3U8FileTask task) {

    }

    public void onDownloadProgress(M3U8FileTask task) {

    }

    public void onDownloadPrepare(M3U8FileTask task) {

    }

    public void onDownloadError(M3U8FileTask task, Throwable errorMsg) {

    }

}
