package com.wenping.android_architecture.view.activity;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2016/4/28.
 */
public class UserDetailsActivity extends BaseActivity {

    public static Intent getCallingIntent(Context context, int userId) {
        return new Intent(context,UserDetailsActivity.class);
    }
}
