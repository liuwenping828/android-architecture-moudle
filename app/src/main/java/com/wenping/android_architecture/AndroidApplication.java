package com.wenping.android_architecture;

import android.app.Application;
import android.os.Environment;

import com.github.moduth.blockcanary.BlockCanary;
import com.squareup.leakcanary.LeakCanary;
import com.wenping.android_architecture.config.BuildConfig;
import com.wenping.android_architecture.internal.di.components.ApplicationComponent;
import com.wenping.android_architecture.utils.AppBlockCanaryContext;

/**
 * Created by Administrator on 2016/4/21.
 */
public class AndroidApplication extends Application {

    public static String CACHE_DIR = "";  // 缓存目录

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化注解
        initializeInjector();
        // 内存泄露分析记录
        initializeLeakDetection();
        //Android UI界面卡顿检查库
        BlockCanary.install(this, new AppBlockCanaryContext()).start();

        // 如果存在SD卡则将缓存写入SD卡,否则写入手机内存
        if (getApplicationContext().getExternalCacheDir() != null && ExistSDCard()) {
            CACHE_DIR = getApplicationContext().getExternalCacheDir().toString();
        } else {
            CACHE_DIR = getApplicationContext().getCacheDir().toString();
        }

    }

    private boolean ExistSDCard() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }

    private void initializeInjector() {
        this.applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    private void initializeLeakDetection() {
        if (BuildConfig.DEBUG){
            LeakCanary.install(this);
        }
    }

    public ApplicationComponent getApplicationComponent() {
        return this.applicationComponent;
    }
}
