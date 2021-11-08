package com.example.listik;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    String[] devices = {"Планшеты", "Ноутбуки", "Телефоны", "Компьютеры"};
    String text = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_multiple_choice, devices
        );

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (lv.getCheckedItemCount() != 0)
                {
                    if (lv.isItemChecked(0))
                    {
                        if (text == null)
                            text = (String) lv.getItemAtPosition(0);
                    }

                    if (lv.isItemChecked(1))
                    {
                        if (text != null)
                            text = text + " и " + (String) lv.getItemAtPosition(1);
                        if (text == null)
                            text = (String) lv.getItemAtPosition(1);
                    }

                    if (lv.isItemChecked(2)) {
                        if (text != null)
                            text = text + " и " + (String) lv.getItemAtPosition(2);
                        if (text == null)
                            text = (String) lv.getItemAtPosition(2);
                    }

                    if (lv.isItemChecked(3)) {
                        if (text != null)
                            text = text + " и " + (String) lv.getItemAtPosition(3);
                        if (text == null)
                            text = (String) lv.getItemAtPosition(3);
                    }

                    if (text != null)
                    {
                        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
                        text = null;
                    }
                }
            }
        });
    }
}