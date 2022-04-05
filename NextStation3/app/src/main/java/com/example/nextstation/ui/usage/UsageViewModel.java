package com.example.nextstation.ui.usage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UsageViewModel extends ViewModel {
    private final MutableLiveData<String> usageText;

    public UsageViewModel() {
        usageText = new MutableLiveData<>();
        usageText.setValue("instructions");
    }

    public LiveData<String> getText() {
        return usageText;
    }
}