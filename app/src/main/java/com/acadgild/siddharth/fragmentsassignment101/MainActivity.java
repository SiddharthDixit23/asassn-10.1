package com.acadgild.siddharth.fragmentsassignment101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button mb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.editText);
        mb = (Button) findViewById(R.id.button);
        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentOne f1 = (FragmentOne) getFragmentManager().findFragmentById(R.id.fr1);
                String text = et.getText().toString();
                f1.getData(text);
            }
        });

    }
}
