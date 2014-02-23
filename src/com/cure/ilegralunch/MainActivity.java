package com.cure.ilegralunch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button buttonGenerate = (Button) findViewById(R.id.button_generate);
		buttonGenerate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				List<Restaurante> restaurantes = null;
				TextView textRestaurante = (TextView) findViewById(R.id.textRestaurante);
				RadioButton radioPerto = (RadioButton) findViewById(R.id.radio_perto);
				
				if (radioPerto.isChecked()) textRestaurante.setText(gerarRestauranteAleatorio(gerarRestaurantesPerto()));
				else textRestaurante.setText(gerarRestauranteAleatorio(gerarRestaurantesLonge()));
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public String gerarRestauranteAleatorio(List<Restaurante> restaurantes) {
		Random generator = new Random();
		int index = generator.nextInt(restaurantes.size());
		return restaurantes.get(index).getNome();
	}
	
	public List<Restaurante> gerarRestaurantesPerto() {
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		restaurantes.add(new Restaurante("Santo Antônio (Fedoras)", 'P'));
		restaurantes.add(new Restaurante("UFRGS", 'P'));
		restaurantes.add(new Restaurante("CIENTEC", 'P'));
		restaurantes.add(new Restaurante("Garagem (Ahora)", 'P'));
		restaurantes.add(new Restaurante("Espetão na Brasa II", 'P'));
		restaurantes.add(new Restaurante("Novo Fedoras", 'P'));
		restaurantes.add(new Restaurante("Guaipeca", 'P'));
		restaurantes.add(new Restaurante("Onze e meio", 'P'));
		restaurantes.add(new Restaurante("Gurias (Titton)", 'P'));
		restaurantes.add(new Restaurante("Mr Chao (Yakisoba)", 'P'));
		restaurantes.add(new Restaurante("Cia da Picanha", 'P'));
		restaurantes.add(new Restaurante("Olá", 'P'));
		restaurantes.add(new Restaurante("Corcovado", 'P'));
		restaurantes.add(new Restaurante("Ponto Grill", 'P'));
		restaurantes.add(new Restaurante("Boka Loka", 'P'));
		return restaurantes;
	}
	
	public List<Restaurante> gerarRestaurantesLonge() {
		List<Restaurante> restaurantes = new ArrayList<Restaurante>();
		restaurantes.add(new Restaurante("Bon Manggiare", 'L'));
		restaurantes.add(new Restaurante("Cavanhas", 'L'));
		restaurantes.add(new Restaurante("Via Imperatore", 'L'));
		restaurantes.add(new Restaurante("Pampa Burger", 'L'));
		restaurantes.add(new Restaurante("Pastel com Borda", 'L'));
		restaurantes.add(new Restaurante("Praia de Belas", 'L'));
		restaurantes.add(new Restaurante("Barra Shopping", 'L'));
		restaurantes.add(new Restaurante("Nutri", 'L'));
		restaurantes.add(new Restaurante("Japesca", 'L'));
		restaurantes.add(new Restaurante("Kantô", 'L'));
		return restaurantes;
	}

}
