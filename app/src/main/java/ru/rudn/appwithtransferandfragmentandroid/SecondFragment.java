package ru.rudn.appwithtransferandfragmentandroid;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    // обновление текстового поля
    public void setSelectedItem(String selectedItem) {
        TextView view = getView().findViewById(R.id.text);
        view.setText(selectedItem);
    }
}