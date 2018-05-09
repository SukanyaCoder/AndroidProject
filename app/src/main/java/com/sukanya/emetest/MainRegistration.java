package com.sukanya.emetest;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class MainRegistration extends AppCompatActivity implements View.OnClickListener {


    Button btn;
    Spinner spinner;
    EditText uname,password,email,phone,address;
    private FirebaseAuth mAuth;
    private FirebaseDatabase mFirebaseDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_registration);


        mAuth = FirebaseAuth.getInstance();
        mFirebaseDatabase=FirebaseDatabase.getInstance();


        // Spinner element
        spinner=(Spinner)findViewById(R.id.idSpinner);
         uname=(EditText)findViewById(R.id.input_name);
        password=(EditText)findViewById(R.id.input_password);
        email=(EditText)findViewById(R.id.input_email);
       phone=(EditText)findViewById(R.id.input_phone);
       address=(EditText)findViewById(R.id.input_address);
        spinner.setPrompt("Course");

        // Spinner Drop down elements
        // String[] Course ={"JAVA","ANDROID","WEB DESIGN","PHP",".net","NETWORKING","TESTING"};
        // Creating adapter for spinner// Drop down layout style
        //ArrayAdapter adapter=new ArrayAdapter (this,android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.course_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(adapter);



        btn=(Button)findViewById(R.id.idbtn);
        btn.setOnClickListener( this);


    }

    @Override
    protected void onStart() {
        super.onStart();

        if (mAuth.getCurrentUser() != null) {
            //handle the already login user
        }

    }
    private  void registerUser(){
        final String userName = uname.getText().toString().trim();
        final String uemail = email.getText().toString().trim();
        String upass = password.getText().toString().trim();
        final String uphone = phone.getText().toString().trim();

        if (userName.isEmpty()) {
            uname.setError(getString(R.string.input_error_name));
           uname.requestFocus();
            return;
        }

        if (uemail.isEmpty()) {
           email.setError(getString(R.string.input_error_email));
            email.requestFocus();
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(uemail).matches()) {
            email.setError(getString(R.string.input_error_email_invalid));
            email.requestFocus();
            return;
        }

        if (upass.isEmpty()) {
            password.setError(getString(R.string.input_error_password));
            password.requestFocus();
            return;
        }

        if (upass.length() < 6) {
            password.setError(getString(R.string.input_error_password_length));
            password.requestFocus();
            return;
        }

        if (uphone.isEmpty()) {
            phone.setError(getString(R.string.input_error_phone));
            phone.requestFocus();
            return;
        }

        if (uphone.length() != 10) {
           phone.setError(getString(R.string.input_error_phone_invalid));
            phone.requestFocus();
            return;
        }
        mAuth.createUserWithEmailAndPassword(uemail,upass)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            //stoe data in firebase
                            User user=new User(
                                    userName,
                                    uemail,
                                    uphone
                            );
                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    Toast.makeText(MainRegistration.this,"successfull",Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                        else
                            Toast.makeText(MainRegistration.this,task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.idbtn:
                registerUser();
                break;
        }
    }
}






