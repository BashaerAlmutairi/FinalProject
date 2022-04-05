package com.example.nextstation.ui.AutoReply;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AutoReplyViewModel extends ViewModel {
    private final MutableLiveData<String> mText;

    public AutoReplyViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Auto Reply");
    }

    public LiveData<String> getText() {
        return mText;
    }
}