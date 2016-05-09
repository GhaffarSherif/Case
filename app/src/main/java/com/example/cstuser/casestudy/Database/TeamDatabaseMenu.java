package com.example.cstuser.casestudy.Database;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cstuser.casestudy.R;

/**
 * Created by sherif on 2016-05-05.
 */
public class TeamDatabaseMenu extends Activity implements View.OnClickListener{
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
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == addBtn.getId()){

        }
        else if(v.getId() == editBtn.getId()){

        }
        else if (v.getId() == queryBtn.getId()){

        }
        else if (v.getId() == deleteBtn.getId()){

        }
        else if (v.getId() == returnBtn.getId()){
            i = new Intent("com.example.cstuser.casestudy.MainMenu");
            startActivity(i);
            finish();
        }
    }
}
