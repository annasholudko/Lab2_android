package com.example.lab2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View;
import android.widget.Toast;
import android.widget.CheckBox;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;

public class BlankFragment extends Fragment {
   // CheckBox checkBox;
    CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;
    CheckBox ch4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        ch1 = (CheckBox) view.findViewById(R.id.checkBox10);
        ch2 = (CheckBox) view.findViewById(R.id.checkBox11);
        ch3 = (CheckBox) view.findViewById(R.id.checkBox12);
        ch4 = (CheckBox) view.findViewById(R.id.checkBox13);
        Button but = (Button) view.findViewById(R.id.button);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectedItems = "";
                if(ch1.isChecked())
                    selectedItems +=ch1.getText() + "\n";
                if(ch2.isChecked())
                    selectedItems +=ch2.getText()+"\n";
                if(ch3.isChecked())
                    selectedItems +=ch3.getText()+"\n";
                if(ch4.isChecked())
                    selectedItems +=ch4.getText();
                Toast.makeText(view.getContext(), selectedItems, Toast.LENGTH_SHORT).show();
                if(!ch1.isChecked() && !ch2.isChecked() && !ch3.isChecked() && !ch4.isChecked())
                {
                    Toast.makeText(view.getContext(), "Дайтe відповідь на питання", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}
