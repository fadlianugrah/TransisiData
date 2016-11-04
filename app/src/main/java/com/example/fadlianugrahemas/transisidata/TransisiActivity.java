package com.example.fadlianugrahemas.transisidata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TransisiActivity extends AppCompatActivity {

    EditText ed = (EditText) findViewById(R.id.editText);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transisi);
        Button next = (Button) findViewById(R.id.nx);
        Button back = (Button) findViewById(R.id.bk);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransisiActivity.this, PagetwoActivity.class);
                String tmp = ed.getText().toString();
                intent.putExtra("tmp",tmp);
                startActivity(intent);

            }
        });
    }
}
