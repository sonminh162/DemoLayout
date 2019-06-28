package com.lifetime.title;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.mobsandgeeks.saripaar.ValidationError;
import com.mobsandgeeks.saripaar.Validator;
import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.NotEmpty;

import java.util.ArrayList;
import java.util.List;

public class login extends AppCompatActivity implements Validator.ValidationListener {

    @Email
    @NotEmpty
    private EditText editTextUsername;
    private EditText editTextPassword;
    Button btnFirst;
    SharedPreferences sharedPreferences;
    private Validator validator;
    CheckBox cbRemember;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //anh xa------
        editTextUsername = findViewById(R.id.editText);
        editTextPassword = findViewById(R.id.editText2);
        validator = new Validator(this);
        validator.setValidationListener(this);
        btnFirst = findViewById(R.id.button);
        cbRemember = findViewById(R.id.checkBox);
        //-----------

        sharedPreferences = getSharedPreferences("dataLogin",MODE_PRIVATE);

        //get values
        editTextPassword.setText(sharedPreferences.getString("password",""));
        editTextUsername.setText(sharedPreferences.getString("user",""));
        cbRemember.setChecked(sharedPreferences.getBoolean("checked",false));

        btnFirst.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                validator.validate();
            }
        });
    }

    @Override
    public void onValidationSucceeded() {
        String username = editTextUsername.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        if(cbRemember.isChecked()){
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("user",username);
            editor.putString("password",password);
            editor.putBoolean("checked",true);
            editor.commit();
        }else{
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.remove("user");
            editor.remove("password");
            editor.remove("checked");
            editor.commit();
        }
        Toast.makeText(getApplicationContext(),"Successfully", Toast.LENGTH_LONG).show();
        Intent intent = new Intent(login.this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onValidationFailed(List<ValidationError> errors) {
        for(ValidationError error : errors){
            View view = error.getView();
            String message = error.getCollatedErrorMessage(this);
            if(view instanceof EditText){
                ((EditText) view).setError(message);
            }else{
                Toast.makeText(this, message, Toast.LENGTH_LONG).show();
            }
        }
    }
}
