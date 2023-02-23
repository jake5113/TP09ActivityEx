package com.jake5113.tp09activityex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText etName, etNickname, etTitle, etContent;
    TextView tvCount;
    Button btnClose, btnComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etContent = findViewById(R.id.et_content);
        //tvCount = findViewById(R.id.tv_count);
        etContent.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //tvCount.setText("글자수 : " + etContent.length() + "/500"); //글자수 : 0/500"
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
}