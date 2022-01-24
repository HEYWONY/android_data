package com.example.a220124_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {
    private EditText mEditName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditName = (EditText) findViewById(R.id.editName);
    }

    // 버튼 관련 -> 하나는 파일 열기, 하나는 파일 닫기
    public void mOnClick(View v) {
        switch(v.getId()) {
            case R.id.btnSave:
                FileOutputStream fos;
                try {
                    fos = openFileOutput("test.txt", Context.MODE_PRIVATE); // 앞으로 여기에 저장을 하겠다.
                    fos.write(mEditName.getText().toString().getBytes());  //getBytes -> 메모리가 꽉차면 알려줘야 되니까
                    fos.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;

            case R.id.btnLoad:
                FileInputStream fis;
                try {
                    fis = openFileInput("test.txt");
                    int nbytes = fis.available();
                    byte[] data = new byte[nbytes];
                    fis.read(data);
                    mEditName.setText(new String(data));
                    fis.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                break;
        }
    }
}