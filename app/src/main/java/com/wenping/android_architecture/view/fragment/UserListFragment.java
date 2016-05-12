package com.wenping.android_architecture.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wenping.android_architecture.model.UserModel;
import com.wenping.android_architecture.view.UserListView;

import java.util.Collection;

/**
 * Created by Administrator on 2016/4/27.
 */
public class UserListFragment extends BaseFragment implements UserListView{


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void renderUserList(Collection<UserModel> userModelCollection) {

    }

    @Override
    public void viewUser(UserModel userModel) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showRetry() {

    }

    @Override
    public void hideRetry() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public Context context() {
        return null;
    }
}
