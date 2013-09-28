package net.warmling.helloword;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void OnButtonClick(View v)
    {
    	TextView text = (TextView)findViewById(R.id.textView1);
    	text.setVisibility(TextView.VISIBLE);
    	
    	new AlertDialog.Builder(this).setTitle("Aviso").setMessage(R.string.mensagem).setNeutralButton("Clique aqui", 
    			new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) 
					{
						Toast.makeText(MainActivity.this, getText(R.string.mensagem), Toast.LENGTH_LONG).show();
					}
				}).show();
    }
    
}
