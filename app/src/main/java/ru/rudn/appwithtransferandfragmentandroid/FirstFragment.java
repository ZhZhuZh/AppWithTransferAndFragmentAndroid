package ru.rudn.appwithtransferandfragmentandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    Button btn1;
    TextView txt1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_first, container, false);
        btn1 = v.findViewById(R.id.mybtn1);
        txt1 = v.findViewById(R.id.mytxt1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt1.setText("");
                Intent sw = new Intent(getContext(), MainActivity2.class);
                sw.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getContext().startActivity(sw);
            }
        });
        return v;
    }
}