package com.example.cstuser.casestudy;

/**
 * Created by sherif on 2016-04-29.
 */

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainMenu extends Activity {

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        Toast.makeText(getApplicationContext(), "Welcome!", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onAttachedToWindow() {
        openOptionsMenu();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuChoice(item);
    }

    private void CreateMenu(Menu menu){
        MenuItem mnu1 = menu.add(0, 0, 0, "Soccer Database");
        {
            mnu1.setAlphabeticShortcut('a');
            mnu1.setIcon(R.mipmap.ic_launcher);
        }
        MenuItem mnu2 = menu.add(0, 1, 1, "Slideshow");
        {
            mnu2.setAlphabeticShortcut('b');
            mnu2.setIcon(R.mipmap.ic_launcher);
        }
        MenuItem mnu3 = menu.add(0, 2, 2, "SMS Messenger");
        {
            mnu3.setAlphabeticShortcut('c');
            mnu3.setIcon(R.mipmap.ic_launcher);
        }
        MenuItem mnu4 = menu.add(0, 3, 3, "Animation");
        {
            mnu4.setAlphabeticShortcut('c');
        }
        MenuItem mnu5 = menu.add(0, 4, 4, "Exit");
        {
            mnu4.setAlphabeticShortcut('d');
        }
    }
    private boolean MenuChoice(MenuItem item){
        switch (item.getItemId()) {
            case 0: //DADABEAZ OPTION
                Toast.makeText(this, "DADABEZ",
                        Toast.LENGTH_LONG).show();
                return true;
            case 1: //SLIDESHOW
                i = new Intent("com.example.cstuser.casestudy.slideshow.SlideshowActivity");
                startActivity(i);
                return true;
            case 2: //Animation
                Toast.makeText(this, "Start Activity3",
                        Toast.LENGTH_LONG).show();
                return true;
            case 3://SMS THO
                Toast.makeText(this, "Activty4",
                        Toast.LENGTH_LONG).show();
                return true;
            case 4: //EXIT OPTIONS MENU
                i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.vaniercollege.qc.ca"));
                startActivity(i);
                Toast.makeText(this, "Bye! Come back soon! ", Toast.LENGTH_LONG).show();
                finish();
                return true;
        }
        return false;
    }
}
