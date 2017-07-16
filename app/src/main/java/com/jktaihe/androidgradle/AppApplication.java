package com.jktaihe.androidgradle;

import android.app.Application;

import com.jktaihe.configlibrary.HostConstant;

/**
 * Created by jktaihe on 16/7/17.
 * blog: blog.jktaihe.com
 */

public class AppApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        HostConstant.host = BuildConfig.API_HOST;
    }
}
