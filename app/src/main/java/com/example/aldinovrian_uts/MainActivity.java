package com.example.aldinovrian_uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_activity, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId() == R.id.alamat) {
            startActivity(new Intent(this, MapsActivity.class));
        } else if (item.getItemId() == R.id.kisahnabi) {
            startActivity(new Intent(this, kisahnabi.class));
        } else if (item.getItemId() == R.id.mukjizat) {
            startActivity(new Intent(this, MukjizatActivity.class));
        }
        return true;
    }
}