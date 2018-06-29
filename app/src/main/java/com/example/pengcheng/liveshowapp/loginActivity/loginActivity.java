package com.example.pengcheng.liveshowapp.loginActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import com.example.pengcheng.liveshowapp.R;

/**
 * Created by pengcheng on 6/19/18.
 */

public class loginActivity extends AppCompatActivity {

    private EditText accountEditor;
    private EditText passwdEditor;
    private Button loginButton;
    private Button signupButton;

    // Refresh the page
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    private void findAllViews(){
        this.accountEditor = (EditText)findViewById(R.id.account);
    }


}
