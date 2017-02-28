package com.example.sveta.testmvp.main;

import java.util.List;

/**
 * Created by Sveta on 28.02.2017.
 */

public interface MainView {
    void showProgress();
    void hideProgress();
    void setItems(List<String> items);
    void showMessage(String message);
}
