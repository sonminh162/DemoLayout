package com.lifetime.title;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
    Button btnFirst;

    private Validator validator;

    RecyclerView listViewItem;
    ArrayList<Item> mangItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        editTextUsername = findViewById(R.id.editText);

        validator = new Validator(this);
        validator.setValidationListener(this);

        btnFirst = findViewById(R.id.button);

        btnFirst.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                validator.validate();
                Intent intent = new Intent(login.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onValidationSucceeded() {
        Toast.makeText(getApplicationContext(),"Successfully", Toast.LENGTH_LONG).show();
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
