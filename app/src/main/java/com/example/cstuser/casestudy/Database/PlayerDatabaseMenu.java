package com.example.cstuser.casestudy.Database;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cstuser.casestudy.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class PlayerDatabaseMenu extends Activity implements View.OnClickListener {
    PlayerDBAdapter db;
    Button addBtn;
    Button returnBtn;
    Button editBtn;
    Button queryBtn;
    Button deleteBtn;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_database_menu_ui);

        addBtn = (Button)this.findViewById(R.id.addBtn);
        editBtn = (Button)this.findViewById(R.id.editBtn);
        queryBtn = (Button)this.findViewById(R.id.queryBtn);
        deleteBtn = (Button)this.findViewById(R.id.deleteBtn);
        returnBtn = (Button)this.findViewById(R.id.returnBtn);

        addBtn.setOnClickListener(this);
        editBtn.setOnClickListener(this);
        queryBtn.setOnClickListener(this);
        deleteBtn.setOnClickListener(this);
        returnBtn.setOnClickListener(this);


        db = new PlayerDBAdapter(this);
        long id;

        //---add a Player---
        db.open();
        id = db.insertPlayer("Jason", "12-JUNE-1992", "1234", "2");
        id = db.insertPlayer("Chea", "12-JULY-1995", "1235", "3");

        Cursor c = db.getPlayer(1);

        db.DisplayPlayer(c);

        db.close();




       /*
        try {
            String destPath = "/data/data/" + getPackageName() + "/databases";
            File f = new File(destPath);
            if (!f.exists()) {
                f.mkdirs();
                f.createNewFile();

                //---copy the db from the assets folder into the databases folder---
                CopyDB(getBaseContext().getAssets().open("player"),
                        new FileOutputStream(destPath + "/player"));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


    }

    public void CopyDB(InputStream inputStream,
                       OutputStream outputStream) throws IOException {
        //---copy 1K bytes at a time---
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0, length);
        }
        inputStream.close();
        outputStream.close();
    }



    @Override
    public void onClick(View v) {
        if (v.getId() == addBtn.getId()){
            i = new Intent("com.example.ctuser.casestudy.Database.AddEditDeleteRecord");
            startActivity(i);
        }
        else if(v.getId() == editBtn.getId()){

        }
        else if (v.getId() == queryBtn.getId()){

        }
        else if (v.getId() == deleteBtn.getId()){

        }
        else if (v.getId() == returnBtn.getId()){
            i = new Intent("com.example.ctuser.casestudy.MainMenu");
            startActivity(i);
            finish();
        }

    }
}
