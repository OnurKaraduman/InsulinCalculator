package com.iuce.main;

import java.util.List;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.insulinhesaplama.R;
import com.iuce.adapter.InsulinAdapter;
import com.iuce.constants.Constant;
import com.iüce.control.IInsulinOperations;
import com.iüce.control.InsulinOperations;
import com.iüce.entity.Insulin;

public class RaporActivity extends Activity {

	private IInsulinOperations insulinOperation;
	private ListView listDiary;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_insulin);
		listDiary = (ListView) findViewById(R.id.listInsulin);

		insulinOperation = new InsulinOperations(this);

		List<Insulin> kayitlar = insulinOperation.listInsulin();
		InsulinAdapter adapter = new InsulinAdapter(getApplicationContext(),
				R.layout.kayit_list_row, kayitlar);
		listDiary.setAdapter(adapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		Constant.karar = 1;
		AlertDialog.Builder builderSingle = new AlertDialog.Builder(
				RaporActivity.this);
		builderSingle.setTitle("Aylar");
		final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
				RaporActivity.this, android.R.layout.select_dialog_singlechoice);
		for (int i = 1; i < Constant.aylar.length; i++) {
			arrayAdapter.add(Constant.aylar[i]);
		}
		builderSingle.setNegativeButton("Ýptal",
				new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						dialog.dismiss();
					}
				});

		builderSingle.setAdapter(arrayAdapter,
				new DialogInterface.OnClickListener() {

					@Override
					public void onClick(DialogInterface dialog, int which) {
						Constant.secim = arrayAdapter.getItem(which);
						insulinOperation = new InsulinOperations(
								getApplicationContext());

						List<Insulin> kayitlar = insulinOperation.listInsulin();
						InsulinAdapter adapter = new InsulinAdapter(
								getApplicationContext(),
								R.layout.kayit_list_row, kayitlar);
						listDiary.setAdapter(adapter);
					}
				});
		builderSingle.show();
		return false;

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub

		return super.onOptionsItemSelected(item);
	}

}