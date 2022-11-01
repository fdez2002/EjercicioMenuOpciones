package com.example.ejerciciomenuopciones;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.ejerciciomenuopciones.databinding.ActivityMainBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.imageView7.setImageResource(R.drawable.computer);//asignamos la imagen
        binding.imageView8.setImageResource(R.drawable.web);//asignamos la imagen
        binding.imageView9.setImageResource(R.drawable.linked);//asignamos la imagen

        /*
        Vamos a añadir en primer lugar un menú contextual que aparezca al pulsar s
        obre la etiqueta de texto. Para ello, lo primero que vamos a hacer es indicar
        en el método onCreate() de nuestra actividad principal que la etiqueta tendrá
         */
        registerForContextMenu(binding.imageView7);
        registerForContextMenu(binding.imageView8);
        registerForContextMenu(binding.imageView9);






    }
    //Menu pulsado
    /*
    A continuación, igual que hacíamos con onCreateOptionsMenu() para los menús básicos,
    vamos a sobreescribir en nuestra actividad el evento encargado de construir los menús
    contextuales asociados a los diferentes controles de la aplicación. En este caso el evento
    se llama onCreateContextMenu(), y a diferencia de onCreateOptionsMenu() éste se llama cada vez
    que se necesita mostrar un menú contextual, y no una sola vez al inicio de la aplicación.
     */
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu, menu);
    }
    /*
    A continuación, igual que hacíamos con onCreateOptionsMenu() para los menús básicos,
    vamos a sobreescribir en nuestra actividad el evento encargado de construir los menús
    contextuales asociados a los diferentes controles de la aplicación. En este caso el evento
    se llama onCreateContextMenu(), y a diferencia de onCreateOptionsMenu() éste se llama cada vez
     que se necesita mostrar un menú contextual, y no una sola vez al inicio de la aplicación.
     */
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Intent intent = new Intent(this, ScrollingActivity.class);

        switch (item.getItemId()) {
            case R.id.menuDam:
                intent.putExtra("key", "CFGS DAM");

                break;
            case R.id.menuDaw:
                intent.putExtra("key", "CFGS DAW");
                break;
            case R.id.menuAsir:
                intent.putExtra("key", "CFGS ASIR");
                break;
            default: return super.onOptionsItemSelected(item);

        }
        startActivity(intent);

        return super.onOptionsItemSelected(item);
    }

    //Menu toolbar
    /*
    Añadimos las instancias del menu
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    /*
    Cuando el selecciona una opcion, el sistema llama al este metodo, que pasa el MenuItem seleccionado
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        Intent intent = new Intent(this, ScrollingActivity.class);

        switch (item.getItemId()) {
            case R.id.menuDam:
                intent.putExtra("key", "CFGS DAM");

                break;
            case R.id.menuDaw:
                intent.putExtra("key", "CFGS DAW");
                break;
            case R.id.menuAsir:
                intent.putExtra("key", "CFGS ASIR");
                break;
            default: return super.onOptionsItemSelected(item);

        }
        startActivity(intent);

        return super.onOptionsItemSelected(item);

    }
}