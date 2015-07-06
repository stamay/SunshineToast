package com.example.administrador.sunshineitic92;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class WeatherActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        //Bundle bundle = getIntent().getExtras();
        Clima clima = (Clima) getIntent().getSerializableExtra("clima");

        TextView dia = (TextView) findViewById(R.id.textView_weather_dia);
        TextView estado = (TextView) findViewById(R.id.textView_weather_estado);
        TextView temperatura = (TextView) findViewById(R.id.textView_weather_temperatura);
        ImageView icono = (ImageView) findViewById(R.id.imageView_weather_icono);

        dia.setText(clima.getDia());
        estado.setText(clima.getEstado());
        temperatura.setText(clima.getTemperatura());
        icono.setImageResource(clima.getIcono());


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_weather, menu);
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
}
