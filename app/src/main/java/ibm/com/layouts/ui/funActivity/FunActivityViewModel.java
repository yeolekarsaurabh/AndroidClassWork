package ibm.com.layouts.ui.funActivity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FunActivityViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FunActivityViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is fun activity fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}