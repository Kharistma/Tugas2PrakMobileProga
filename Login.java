package com.example.kharist.tugas2prakmobileprog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    public EditText edUser, edPass;
    public Button Login, batal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initUI();
    }

    private void initUI() {
        edUser = (EditText) findViewById(R.id.edUser);
        edUser.getText();
        edPass = (EditText) findViewById(R.id.edPass);
        edPass.getText();
        Login = (Button) findViewById(R.id.btnLogin);
        batal = (Button) findViewById(R.id.btnBatal);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == Login){
                    if (edUser.getText().toString().equals("admin")) &&
                            edPass.getText().toString().equals("admin"); {
                        Intent pindah = new Intent(Login.this, KRS.class);
                        startActivity(pindah);

                    }else
                    Toast.makeText(Login.this, "login gagal", Toast.LENGTH_LONG).show();
                }
            }
        });
        batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edUser.setText("");
                edPass.setText("");
            }
        });
    }
}
