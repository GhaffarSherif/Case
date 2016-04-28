package com.example.cstuser.casestudy;

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


public class SlideshowActivity extends ActionBarActivity implements View.OnClickListener {

    ImageView image;
    CheckBox repeat;
    RadioButton legendText;
    RadioButton playSoundFile;
    Button startButton;
    Button returnToMainMenu;
    boolean repeatSlideshow = false;
    boolean playSound = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slideshow_layout);

        image = (ImageView) this.findViewById(R.id.image);
        repeat = (CheckBox) this.findViewById(R.id.repeatCheckBox);
        legendText = (RadioButton) this.findViewById(R.id.legendTextRButton);
        playSoundFile = (RadioButton) this.findViewById(R.id.playSoundFileRButton);
        startButton = (Button) this.findViewById(R.id.startButton);
        returnToMainMenu = (Button) this.findViewById(R.id.returnToMainMenuButton);

        repeat.setOnClickListener(this);
        legendText.setOnClickListener(this);
        playSoundFile.setOnClickListener(this);
        startButton.setOnClickListener(this);
        returnToMainMenu.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        if(v.getId() == repeat.getId()){
            if(repeat.isChecked())
                repeatSlideshow = true;
            else
                repeatSlideshow = false;
        }
        if(v.getId() == legendText.getId()){
            playSound = false;
        }
        if(v.getId() == playSoundFile.getId()){
            playSound = true;
        }
        if(v.getId() == startButton.getId()){
            startSlideshow();
        }
        if(v.getId() == returnToMainMenu.getId()){
            finish();
        }
    }

    private void startSlideshow() {
        int[] images = {R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5};

        /*for()
        image.setImageResource(R.drawable.pic1);*/

        try {
            for(int i = 0; i < images.length; i++) {
                image.setImageResource(R.drawable.pic1);
                Thread.sleep(5 * 1000);
                if(repeatSlideshow && i == images.length-1)
                    i = -1;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}