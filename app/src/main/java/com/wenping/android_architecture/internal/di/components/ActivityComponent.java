package com.wenping.android_architecture.internal.di.components;

import android.app.Activity;

import com.wenping.android_architecture.internal.di.PerActivity;
import com.wenping.android_architecture.internal.di.moudles.ActivityModule;

import dagger.Component;

/**
 * Created by Administrator on 2016/4/27.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}
