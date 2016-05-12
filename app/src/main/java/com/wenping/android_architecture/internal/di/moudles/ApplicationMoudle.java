package com.wenping.android_architecture.internal.di.moudles;

import android.app.Application;

import com.wenping.android_architecture.AndroidApplication;
import com.wenping.android_architecture.UIThread;
import com.wenping.data.executor.JobExecutor;
import com.wenping.domain.executor.PostExecutionThread;
import com.wenping.domain.executor.ThreadExecutor;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module that provides objects which will live during the application lifecycle.
 */
@Module
public class ApplicationMoudle {

    private final AndroidApplication application;

    public ApplicationMoudle(AndroidApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    public Application provideApplicationContext() {
        return application;
    }

    @Singleton
    @Provides
    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {   // ThreadExecutor imp JobExecutor
        return jobExecutor;
    }

    @Provides
    @Singleton
    PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }


}
