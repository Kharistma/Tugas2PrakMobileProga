package com.example.kharist.tugas2prakmobileprog;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class KRS extends AppCompatActivity {
    public EditText Nim, Nama;
    public TextView txNim, txNama, txMatkul;
    public Button submit;
    public CheckBox Matkul1,Matkul2, Matkul3, Matkul4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krs);

        txNim = (TextView)findViewById(R.id.textViewNIM);
        txNama = (TextView) findViewById(R.id.textViewNama);
        txMatkul = (TextView) findViewById(R.id.textViewMatkul);

        Nim = (EditText) findViewById(R.id.edNIM);
        Nama = (EditText) findViewById(R.id.edNama);
        Matkul1 = (CheckBox) findViewById(R.id.cbMP);
        Matkul2 = (CheckBox) findViewById(R.id.cbPMP);
        Matkul3 = (CheckBox) findViewById(R.id.cbPCD);
        Matkul4 = (CheckBox) findViewById(R.id.cbDM);
        submit = (Button) findViewById(R.id.btnSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentform = new Intent(getApplicationContext(), hasilkrs.class);
                intentform.putExtra("txtnim", txNim.getText().toString());
                intentform.putExtra("txtnama", txNama.getText().toString());
                intentform.putExtra("txtmatkul", txMatkul.getText().toString());
                intentform.putExtra("nim",Nim.getText().toString());
                intentform.putExtra("nama", Nama.getText().toString());
                boolean checkstatus1 = Matkul1.isChecked();
                intentform.putExtra("status1", checkstatus1);
                boolean checkstatus2 = Matkul2.isChecked();
                intentform.putExtra("status2", checkstatus2);
                boolean checkstatus3 = Matkul3.isChecked();
                intentform.putExtra("status3", checkstatus3);
                boolean checkstatus4 = Matkul4.isChecked();
                intentform.putExtra("status4", checkstatus4);
                startActivity(intentform);
            }
        });

    }
}