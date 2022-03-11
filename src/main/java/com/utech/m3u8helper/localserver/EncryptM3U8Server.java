package com.utech.m3u8helper.localserver;

import android.text.TextUtils;

import java.io.File;

import com.utech.m3u8helper.M3U8Downloader;
import com.utech.m3u8helper.M3U8EncryptHelper;
import com.utech.m3u8helper.utils.M3U8Log;



public class EncryptM3U8Server extends M3U8HttpServer {

    public void encrypt(){
        if (TextUtils.isEmpty(filesDir) || isEncrypt(filesDir))return;

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    M3U8EncryptHelper.encryptTsFilesName(
                            M3U8Downloader.getInstance().getEncryptKey()
                            ,filesDir
                    );
                } catch (Exception e) {
                    M3U8Log.e("M3u8Server encrypt: "+e.getMessage());
                }
            }
        }).start();

    }

    public void decrypt(){
        if (TextUtils.isEmpty(filesDir) || !isEncrypt(filesDir))return;
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    M3U8EncryptHelper.decryptTsFilesName(
                            M3U8Downloader.getInstance().getEncryptKey()
                            ,filesDir
                    );
                } catch (Exception e) {
                    M3U8Log.e("M3u8Server decrypt: "+e.getMessage());
                }
            }
        }).start();

    }

    private boolean isEncrypt(String dirPath){
        try {
            File dirFile = new File(dirPath);
            if (dirFile.exists() && dirFile.isDirectory()){
                File[] files = dirFile.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].getName().contains(".ts"))return false;
                }
            }
        }catch (Exception e){
        }
        return true;
    }

}
