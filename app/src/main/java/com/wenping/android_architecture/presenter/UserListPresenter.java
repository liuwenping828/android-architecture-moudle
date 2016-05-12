package com.wenping.android_architecture.presenter;

import com.wenping.android_architecture.internal.di.PerActivity;
import com.wenping.android_architecture.view.UserListView;
import com.wenping.domain.interactor.GetUserList;
import com.wenping.domain.interactor.UserCase;

/**
 * Created by Administrator on 2016/4/28.
 */
@PerActivity
public class UserListPresenter implements Presenter {

    private UserListView userListView;

    private final UserCase userCase;
    private final GetUserList getUserList;


    public UserListPresenter(UserListView userListView, UserCase userCase, GetUserList getUserList) {
        this.userListView = userListView;
        this.userCase = userCase;
        this.getUserList = getUserList;
    }

    public void setView(UserListView userListView){
        this.userListView= userListView;
    }



    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {

    }
}
