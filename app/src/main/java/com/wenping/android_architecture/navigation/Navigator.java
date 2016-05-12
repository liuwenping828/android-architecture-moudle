package com.wenping.android_architecture.navigation;

import android.content.Context;
import android.content.Intent;

import com.wenping.android_architecture.utils.CommonUtils;
import com.wenping.android_architecture.view.activity.UserDetailsActivity;
import com.wenping.android_architecture.view.activity.UserListActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * 导航视图Activity 跳转
 */
@Singleton
public class Navigator {

    @Inject
    public Navigator() {
    }

    // ----功能代码-------

    /**
     * Goes to the user list screen.
     *
     * @param context A Context needed to open the destiny activity.
     */
    public void navigateToUserList(Context context) {
        CommonUtils.checkNotNull(context);
        Intent intentToLaunch = UserListActivity.getCallingIntent(context);
        context.startActivity(intentToLaunch);
    }

    /**
     * Goes to the user details screen.
     *
     * @param context A Context needed to open the destiny activity.
     */
    public void navigateToUserDetails(Context context, int userId) {
        CommonUtils.checkNotNull(context);
        Intent intentToLaunch = UserDetailsActivity.getCallingIntent(context, userId);
        context.startActivity(intentToLaunch);
    }

    // ----功能代码-------


}
