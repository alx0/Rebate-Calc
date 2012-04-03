package my.android.rebate;

import android.app.Activity ;
import android.os.Bundle ;
import android.widget.EditText ;
import android.widget.Toast;
import android.widget.Spinner ;
import android.widget.Button ;
import android.widget.ArrayAdapter ;
import android.view.View ;
import android.view.View.OnClickListener ;

public class RebateCalc extends Activity {
	
	public void onCreate(Bundle savedInstanceState ) {
		
		super.onCreate(savedInstanceState) ;
		setContentView(R.layout.main2) ;
		final Spinner spinner = (Spinner) findViewById(R.id.action) ;
		ArrayAdapter adapter = ArrayAdapter.createFromResource( this , R.array.actions , android.R.layout.simple_spinner_dropdown_item) ;
		adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item ) ;
		spinner.setAdapter(adapter) ;
		Button calc = (Button) findViewById(R.id.calc) ;
		final EditText first = (EditText) findViewById(R.id.firstEdit) ;
		final EditText second = (EditText) findViewById(R.id.secondEdit) ;
		
		calc.setOnClickListener( new OnClickListener(){
			
			public void onClick(View v) {
				
				String choice = spinner.getSelectedItem().toString();
				
				if ( choice.equals("Calcola il prezzo scontato") ) {
					
					double prezzo = Double.parseDouble(first.getText().toString()) ;
					double percentuale = Double.parseDouble(second.getText().toString()) ;
					double prezzo_scontato = ( prezzo * percentuale ) / 100 ;
					double sconto = prezzo - prezzo_scontato ;
					Toast.makeText( RebateCalc.this , "Il prezzo scontato e' "+sconto, Toast.LENGTH_SHORT).show() ;
					
					
				}
				
				if ( choice.equals("Calcola il prezzo di base")) {
					
					double prezzo = Double.parseDouble(first.getText().toString()) ;
					double percentuale = 100 - Double.parseDouble(second.getText().toString()) ;
					double prezzo_intero = ( 100 * prezzo ) / percentuale ;
					
					Toast.makeText(RebateCalc.this , "Il prezzo intero e' "+prezzo_intero , Toast.LENGTH_SHORT).show() ;
					
				}
			}
		}) ;
		
		
	}

}
