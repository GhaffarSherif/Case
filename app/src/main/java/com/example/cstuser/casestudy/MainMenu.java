package com.example.cstuser.casestudy;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
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

      // MenuItem mnu1 = menu.add(0, 0, 0, "Soccer Database");
        SubMenu subMenu = menu.addSubMenu(Menu.NONE, 0, 1, "Database");
        subMenu.add(1,5,1,"Soccer");
        subMenu.add(2,6,2,"Team");

        MenuItem mnu2 = menu.add(0, 1, 1, "Slideshow");
        MenuItem mnu3 = menu.add(0, 2, 2, "SMS Messenger");
        MenuItem mnu4 = menu.add(0, 3, 3, "Animation");
        MenuItem mnu5 = menu.add(0, 4, 4, "Exit");

    }
    private boolean MenuChoice(MenuItem item){
        switch (item.getItemId()) {
            case 0: //DADABEAZ OPTION
                Toast.makeText(this, "DADABEZ",
                        Toast.LENGTH_LONG).show();
                return true;
            case 1: //SLIDESHOW
                i = new Intent("com.example.cstuser.casestudy.SlideshowActivity");
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
            case 5: // Submenu SOCCER
                return  true;
            case 6: // Submenu team
                return  true;
        }
        return false;
    }
}
