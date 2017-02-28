package com.example.sveta.testmvp.login;

/**
 * Created by Sveta on 28.02.2017.
 */

public interface LoginInteractor {

    interface OnLoginFinishedListener {
        void onUsernameError();
        void onPasswordError();
        void onSuccess();
    }

    void login(String username, String passsword, OnLoginFinishedListener listener);
}
