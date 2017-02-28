package com.example.sveta.testmvp.login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by Sveta on 28.02.2017.
 */

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String username, final String passsword, final OnLoginFinishedListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean error = false;
                if (TextUtils.isEmpty(username)) {
                    listener.onUsernameError();
                    error = true;
                    return;
                }
                if (TextUtils.isEmpty(passsword)) {
                    listener.onPasswordError();
                    error = true;
                    return;
                }
                if (!error) {
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}