package com.iuce.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.example.insulinhesaplama.R;

public class AksamActivity extends Activity {

	private EditText edtKalori;
	private Button btnAksamTamam;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_aksam);
		edtKalori = (EditText) findViewById(R.id.edtKalori);
		btnAksamTamam = (Button) findViewById(R.id.btnTamamAksam);
		btnAksamTamam.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (edtKalori.getText().toString().equals("")) {
					edtKalori.setText("0");
				}
				Intent intentAksam = new Intent(AksamActivity.this,
						OlcumActivity.class);
				intentAksam.putExtra("toplamKalori", edtKalori.getText()
						.toString());
				startActivity(intentAksam);
			}
		});
	}

}
