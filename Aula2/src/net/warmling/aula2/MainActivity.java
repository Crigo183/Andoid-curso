package net.warmling.aula2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

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
	
	public void displayData(RssItem item)
	{
		TextView titulo = (TextView)findViewById(R.id.titulo);
		TextView data = (TextView)findViewById(R.id.data);
		ImageView imagem = (ImageView)findViewById(R.id.image);
		TextView descricao = (TextView)findViewById(R.id.descricao);
		
		if (item != null)
		{
			titulo.setText(item.getTitle());
			data.setText(item.getDate());
			imagem.setImageBitmap(item.getImage());
			descricao.setText(item.getDescription());
		}
		
		
	}

}
