package com.example.cstuser.casestudy.slideshow;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import com.example.cstuser.casestudy.R;


public class SlideshowActivity extends Activity {

    Fragment frag1;
    Fragment frag2;

    ImageView image;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slideshow_layout);

        /*frag1 = getSupportFragmentManager().findFragmentById(R.id.fragment1);
        frag2 = getSupportFragmentManager().findFragmentById(R.id.fragment2);*/

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        frag1 = fm.findFragmentById(R.id.fragment1);
        frag2 = fm.findFragmentById(R.id.fragment2);

        //image = (ImageView) frag2.getView().findViewById(R.id.image);
    }

    public void passData(int identifier, boolean isTrue){
        //frag2.receiveData(identifier, isTrue);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_slideshow, menu);
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