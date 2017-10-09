package com.example.hp1.project;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lv1;
    ArrayAdapter<String> adapter;
    ArrayList<String> California = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        California.add("Universal Studio Hollywood");
        California.add("Disney Land");
        California.add("Lego Land");
        California.add("Hollywood Wax Museum");
        California.add("About The Application");
        adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, California);
        lv1 = (ListView) findViewById(R.id.lv1);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://promotions.universalstudioshollywood.com/general-admission-ticket-usa/?__source=search_gps_all-lang_b_intl_intl_busa_brand_tix_15off&gclid=Cj0KEQjwzpfHBRC1iIaL78Ol-eIBEiQAdZPVKmivP0ut8SdRKdjOzPBrJ3fK5smirpJb8GiXcPDZICMaAm428P8HAQ"));
            startActivity(i);
        }
        if (position == 1) {
            Intent i1 = new Intent(this, Disneyland.class);
            startActivity(i1);
        }
        if (position == 2) {
            Intent i2 = new Intent(this, Legoland.class);
            startActivity(i2);
        }
        if (position == 3) {
            Intent i3 = new Intent(this, Hollywood.class);
            startActivity(i3);
        }
        if (position == 4) {
            Intent i4 = new Intent(this, About.class);
            startActivity(i4);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.mnItmExit){
            AlertDialog.Builder builder=new AlertDialog.Builder(this);
            builder.setMessage("Are you sure you want to Exit?");
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setNegativeButton("No",null);
            AlertDialog dialog=builder.create();
            dialog.show();


        }
        return true;
    }
}
