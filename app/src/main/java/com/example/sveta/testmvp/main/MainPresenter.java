package com.example.sveta.testmvp.main;

/**
 * Created by Sveta on 28.02.2017.
 */

public interface MainPresenter {
    void onResume();
    void onItemClicked(int position);
    void onDestroy();
}
