package com.example.cstuser.casestudy;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    Button slideShowButton;
    Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        slideShowButton = (Button) this.findViewById(R.id.slideShowBtn);
        exitButton = (Button) this.findViewById(R.id.exitBtn);
        slideShowButton.setOnClickListener(this);
        exitButton.setOnClickListener(this);

        Toast.makeText(getApplicationContext(), "Welcome!", Toast.LENGTH_LONG).show();
    }



    public void onClick(View v) { // OnClick listeners for exit button
        if (v.getId() == slideShowButton.getId()){
            Intent i = new Intent("com.example.cstuser.casestudy.SlideshowActivity");
            startActivity(i);
        }
        if (v.getId() == exitButton.getId()){

            Toast.makeText(getApplicationContext(), "See you later!", Toast.LENGTH_SHORT).show();
            // make intent
            //delay
            //show webpage intent
            finish();
        }
    }



    /*
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
    */
}
