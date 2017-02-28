package com.example.sveta.testmvp.login;

/**
 * Created by Sveta on 28.02.2017.
 */

public interface LoginPresenter {
    void validateCredentials(String username, String password);
    void onDestroy();
}
