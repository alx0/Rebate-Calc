package my.android.rebate;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;

public class RebateActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent intent = new Intent( this , RebateCalc.class ) ;
        
        try {
        	Thread.sleep(2000) ;
        } catch(InterruptedException ie ) {}
        
        startActivity(intent) ;
        
    }
}