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

        binding.imageView7.setImageResource(R.drawable.computer);
        binding.imageView8.setImageResource(R.drawable.web);
        binding.imageView9.setImageResource(R.drawable.linked);

        registerForContextMenu(binding.imageView7);
        registerForContextMenu(binding.imageView8);
        registerForContextMenu(binding.imageView9);






    }
    //Menu pulsado
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu, menu);
    }
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

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