package org.valenz.myron.dragonballhero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText txtUser;
    private EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtUser = (EditText)findViewById(R.id.txtUser);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
    }

    public void SignIN(View v){
        if (txtUser.getText().toString().equals("MyronX")&& (txtPassword.getText().toString().equals("IronMan"))){
           //Ingreso al sistema
            startActivity(new Intent(this,MainActivity.class));
            }
        else{
            Toast.makeText(this, "Ingrese Usuario o Contraseña correcta", Toast.LENGTH_SHORT).show();
        }
    }

    private void TestUpload(){
        int i = 1+1; 
    }
}
