package com.example.calculatrice;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {
Button btn1,btn2,btn3,btn4,btn5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout1);
        btn1=(Button)findViewById(R.id.bt1);
        btn1.setOnClickListener(this);
        btn2=(Button)findViewById(R.id.bt2);
        btn2.setOnClickListener(this);
        btn3=(Button)findViewById(R.id.bt3);
        btn3.setOnClickListener(this);
        btn4=(Button)findViewById(R.id.bt4);
        btn4.setOnClickListener(this);
        btn5=(Button)findViewById(R.id.bt5);
        btn5.setOnClickListener(this);
                
    }
	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat(); 
		if(view.getId()== R.id.bt2){
			try{
				EditText ed =(EditText)findViewById(R.id.ed1);
				Double n1 =Double.parseDouble(ed.getText().toString());
				EditText edt2 =(EditText)findViewById(R.id.ed2);
				Double n2 = Double.parseDouble(edt2.getText().toString());
				Double Re = n1+n2;
				TextView tx = (TextView)findViewById(R.id.tv1);
				tx.setText(""+df.format(Re));	
				
			}
			catch (Exception e){
				Toast.makeText(getApplicationContext(), "erreur", Toast.LENGTH_SHORT).show();
			}
			
		}
		else if (view.getId()== R.id.bt3){
			try{
				EditText ed = (EditText)findViewById(R.id.ed1);
				Double n1 = Double.parseDouble(ed.getText().toString());
				EditText edt2 = (EditText)findViewById(R.id.ed2);
				Double n2 = Double.parseDouble(edt2.getText().toString());
				Double Res = n1-n2;
				TextView tx =(TextView)findViewById(R.id.tv1);
				tx.setText(""+df.format(Res));
			}
			catch(Exception e ){
				Toast.makeText(getApplicationContext(), "errreur", Toast.LENGTH_SHORT).show();
			}
		}
		else if (view.getId()==R.id.bt4){
			try{
				EditText ed = (EditText)findViewById(R.id.ed1);
				Double n1 = Double.parseDouble(ed.getText().toString());
				EditText edt2 = (EditText)findViewById(R.id.ed2);
				Double n2 = Double.parseDouble(edt2.getText().toString());
				Double Re = n1*n2;
				TextView tx = (TextView)findViewById(R.id.tv1);
				tx.setText(""+df.format(Re));
			}
			catch(Exception e){
				Toast.makeText(getApplicationContext(), "erreur", Toast.LENGTH_SHORT).show();
			}
		}
		else if (view.getId()==R.id.bt5){
			try{
				EditText ed =(EditText)findViewById(R.id.ed1);
				Double n1 = Double.parseDouble(ed.getText().toString());
				EditText edt2 = (EditText)findViewById(R.id.ed2);
				Double n2 = Double.parseDouble(edt2.getText().toString());
				Double Res = n1/n2;
				if(n2==0){
					Toast.makeText(getApplicationContext()," impossible division par 0",Toast.LENGTH_SHORT).show();
				}else{
					TextView tx = (TextView)findViewById(R.id.tv1);
					tx.setText(""+df.format(Res));
				}
			}catch(Exception e){
				Toast.makeText(getApplicationContext(), "erreur", Toast.LENGTH_SHORT).show();
			}
		}
		else{
			EditText ed = (EditText)findViewById(R.id.ed1);
			ed.setText("");
			EditText edt2 =(EditText)findViewById(R.id.ed2);
			edt2.setText("");
			TextView tx = (TextView)findViewById(R.id.tv1);
			tx.setText("");
		}
	}
}
