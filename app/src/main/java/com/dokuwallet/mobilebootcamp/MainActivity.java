package com.dokuwallet.mobilebootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView edittextMainUsername = findViewById(R.id.edittext_main_username);
        TextView edittexMainPassword = findViewById(R.id.edittext_main_password);

        Button buttonMainSubmit = findViewById(R.id.Button_main_submit);
        buttonMainSubmit.setOnClickListener(v ->
        {
            if (!"".equals(edittextMainUsername.getText().toString()) && !"".equals(edittexMainPassword.getText().toString())) {
                Toast.makeText(getApplicationContext(), "Selamat Datang  " + edittextMainUsername.getText().toString(), Toast.LENGTH_SHORT).show();

                Intent intentMain = new Intent(MainActivity.this, DashboardBottomNavigation.class);
                intentMain.putExtra("userName", edittextMainUsername.getText().toString());
                startActivity(intentMain);
            }else{
                Toast.makeText(getApplicationContext(), "Silahkan lengkapi Username dan Password", Toast.LENGTH_SHORT).show();
            }
        });
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
}
