package com.wenping.android_architecture.internal.di.components;

import android.content.Context;

import com.wenping.android_architecture.internal.di.moudles.ApplicationMoudle;
import com.wenping.android_architecture.view.activity.BaseActivity;
import com.wenping.domain.executor.PostExecutionThread;
import com.wenping.domain.executor.ThreadExecutor;
import com.wenping.domain.repository.UserRepository;

import javax.inject.Singleton;

import dagger.Component;

/**
 * A component whose lifetime is the life of the application.
 */
@Singleton  // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = ApplicationMoudle.class)
public interface ApplicationComponent {

    /**
     * 基类 Activity 注解
     * @param baseActivity
     */
    void inject(BaseActivity baseActivity);

    //Exposed to sub-graphs.


    /**
     * 上下文
     * @return
     */
    Context context();
    ThreadExecutor threadExecutor();
    PostExecutionThread postExecutionThread();
    UserRepository userRepository();

}


