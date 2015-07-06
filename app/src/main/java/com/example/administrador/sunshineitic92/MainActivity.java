package com.example.administrador.sunshineitic92;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            final ArrayList<Clima> listaClima = new ArrayList<Clima>();
            listaClima.add(new Clima("Lunes", "Medio Soleado","31°/35°", R.drawable.soleado));
            listaClima.add(new Clima("Martes", "Nublado","12°/15°", R.drawable.nublado));
            listaClima.add(new Clima("Miercoles", "Tormenta","24°/28°", R.drawable.tormenta));
            listaClima.add(new Clima("Jueves", "Muy LLuvioso","16°/18°", R.drawable.lluvia));
            listaClima.add(new Clima("Viernes", "Medio Nublado","35°/38°", R.drawable.nublado));

            List<Clima> lista = (List) listaClima;

            ClimaAdapter climaAdapter = new ClimaAdapter(getActivity(), R.layout.list_item_forecast, lista);

            ListView listView = (ListView) rootView.findViewById(R.id.list_item_forecast);
            listView.setAdapter(climaAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    String item = listaClima.get(position).toString();

                    Toast.makeText(getActivity(), item, Toast.LENGTH_LONG).show();

                    
                }
            });

            return rootView;
        }
    }
}
