package com.example.sveta.testmvp.main;

import java.util.List;

/**
 * Created by Sveta on 28.02.2017.
 */

public interface FindItemsInteractor {

    interface OnFinishedListener {
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}
