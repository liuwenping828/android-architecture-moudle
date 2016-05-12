package com.wenping.android_architecture.internal.di.components;

import com.wenping.android_architecture.internal.di.PerActivity;
import com.wenping.android_architecture.internal.di.moudles.ActivityModule;
import com.wenping.android_architecture.internal.di.moudles.UserModule;
import com.wenping.android_architecture.view.fragment.UserDetailsFragment;
import com.wenping.android_architecture.view.fragment.UserListFragment;

import dagger.Component;

/**
 * Created by Administrator on 2016/4/27.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = {ActivityModule.class, UserModule.class})
public interface UserComponent {
    /**
     * 注解fragment 功能模块 UserListFragment
     * @param userListFragment
     */
    void inject(UserListFragment userListFragment);
    /**
     * 注解fragment 功能模块 UserDetailsFragment
     * @param userDetailsFragment
     */
    void inject(UserDetailsFragment userDetailsFragment);
}
