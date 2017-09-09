package com.example.aj.autocomplatetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] languages={"Android","Java",".Net","DCN","PL/SQL"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,languages);

        AutoCompleteTextView act=(AutoCompleteTextView)findViewById(R.id.auto);
        act.setAdapter(adapter);
    }
}
