// JAVA CODE //

package com.example.madp8;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle; import android.view.View; import android.widget.Button; import android.widget.EditText; import android.widget.TextView;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button button; EditText t1,t2,t3,t4,t5; TextView tt1,tt2,tt3; @Override
protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main); button=(Button) findViewById(R.id.button); button.setOnClickListener(this);
t1=(EditText) findViewById(R.id.pa); t2=(EditText) findViewById(R.id.dp); t3=(EditText) findViewById(R.id.ir); t4=(EditText) findViewById(R.id.lt); t5=(EditText) findViewById(R.id.in); 
tt1=(TextView) findViewById(R.id.emi); tt2=(TextView) findViewById(R.id.ins); tt3=(TextView) findViewById(R.id.totemi);
}

public void onClick(View v)
{

double p,r,n,d,emi,ins,insu,totemi; p=Double.parseDouble(t1.getText().toString()); d=Double.parseDouble(t2.getText().toString()); p=p-d; r=Double.parseDouble(t3.getText().toString()); r=r/(12*100); n=Double.parseDouble(t4.getText().toString()); insu=Double.parseDouble(t5.getText().toString());
emi=(p*r*Math.pow((1+r),n))/(Math.pow((1+r),n)-1); ins=((0.02)*p*insu)/12;


totemi=emi+ins; tt1.setText(String.valueOf(emi)); tt2.setText(String.valueOf(ins)); tt3.setText(String.valueOf(totemi));
}
}
