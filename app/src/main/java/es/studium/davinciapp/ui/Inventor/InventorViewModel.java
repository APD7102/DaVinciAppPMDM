package es.studium.davinciapp.ui.Inventor;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InventorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InventorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ornitóptero");
    }

    public LiveData<String> getText() {
        return mText;
    }
}