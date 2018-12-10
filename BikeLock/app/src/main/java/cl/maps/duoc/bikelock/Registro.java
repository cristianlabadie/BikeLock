package cl.maps.duoc.bikelock;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {

    Button btn_confirmar_reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btn_confirmar_reg = findViewById(R.id.btn_confirmar_reg);

        btn_confirmar_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentConReg= new Intent(Registro.this,MainActivity.class);
                Registro.this.startActivity(intentConReg);
            }
        });
    }
}
