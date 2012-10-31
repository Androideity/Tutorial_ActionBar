package com.androideity.tutorialactionbar;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// --Activaremos el boton Home
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		// --Creamos un metodo para crear cada item
		CrearMenu(menu);
		return true;
	}

	// --Sobre escribimos el metodo para saber que item fue pulsado
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// --Llamamos al metodo que sabe que itema fue seleccionado
		return MenuSelecciona(item);
	}

	private boolean MenuSelecciona(MenuItem item) {
		switch (item.getItemId()) {

		case 0:
			Toast.makeText(this, "Has pulsado el Item 1 del Action Bar",
					Toast.LENGTH_SHORT).show();
			return true;

		case 1:
			Toast.makeText(this, "Has pulsado el Item 2 del Action Bar",
					Toast.LENGTH_SHORT).show();
			return true;

		case 2:
			Toast.makeText(this, "Has pulsado el Item 3 del Action Bar",
					Toast.LENGTH_SHORT).show();
			return true;

		case 3:
			Toast.makeText(this, "Has pulsado el Item 4 del Action Bar",
					Toast.LENGTH_SHORT).show();
			return true;

		case 4:
			Toast.makeText(this, "Has pulsado el Item 5 del Action Bar",
					Toast.LENGTH_SHORT).show();
			return true;

			// --Añadimos el caso para cuando se pulse el boton home

		case android.R.id.home:
			Toast.makeText(this, "Has pulsado el Home del Action Bar",
					Toast.LENGTH_SHORT).show();
			return true;

		}
		return false;
	}

	private void CrearMenu(Menu menu) {
		MenuItem item1 = menu.add(0, 0, 0, "Item 1");
		{
			// --Copio las imagenes que van en cada item
			item1.setIcon(R.drawable.calendar);
			item1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

		MenuItem item2 = menu.add(0, 1, 1, "Item 2");
		{
			item2.setIcon(R.drawable.lock);
			item2.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

		MenuItem item3 = menu.add(0, 2, 2, "Item 3");
		{
			item3.setIcon(R.drawable.question);
			item3.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

		MenuItem item4 = menu.add(0, 3, 3, "Item 4");
		{
			item4.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

		MenuItem item5 = menu.add(0, 4, 4, "Item 5");
		{
			item5.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		}

	}

}
