package com.example.sveta.testmvp.login;

/**
 * Created by Sveta on 28.02.2017.
 */

public interface LoginView {
    void showProgress();
    void hideProgress();
    void setUsernameError();
    void setPasswordError();
    void navigateToHome();
}
