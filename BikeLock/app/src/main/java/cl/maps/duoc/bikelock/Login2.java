package cl.maps.duoc.bikelock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login2 extends AppCompatActivity {

    TextView tv_registrar;
    Button btn_iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        tv_registrar= findViewById(R.id.tv_registrar);

        tv_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentReg= new Intent(Login2.this, Registro.class);
                Login2.this.startActivity(intentReg);
            }
        });

        btn_iniciar=findViewById(R.id.btn_iniciar);

        btn_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentInic= new Intent(Login2.this, MainActivity.class);
                Login2.this.startActivity(intentInic);
            }
        });


    }
}