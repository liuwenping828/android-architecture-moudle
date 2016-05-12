package com.wenping.android_architecture.view.activity;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2016/4/28.
 */
public class UserListActivity extends BaseActivity {


    public static Intent getCallingIntent(Context context) {
        return new Intent(context,UserListActivity.class);
    }
}
