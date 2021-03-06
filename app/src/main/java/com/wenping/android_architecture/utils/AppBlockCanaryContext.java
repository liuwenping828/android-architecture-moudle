package com.wenping.android_architecture.utils;

import com.github.moduth.blockcanary.BlockCanaryContext;
import com.wenping.android_architecture.BuildConfig;

/**
 * Created by Administrator on 2016/5/12.
 */
public class AppBlockCanaryContext extends BlockCanaryContext {

    // override to provide context like app qualifier, uid, network type, block threshold, log save path

    // this is default block threshold, you can set it by phone's performance
    @Override
    public int getConfigBlockThreshold() {
        return 500;
    }

    // if set true, notification will be shown, else only write log file
    @Override
    public boolean isNeedDisplay() {
        return BuildConfig.DEBUG;
    }

    // path to save log file
    @Override
    public String getLogPath() {
        return "/blockcanary/performance";
    }
}
