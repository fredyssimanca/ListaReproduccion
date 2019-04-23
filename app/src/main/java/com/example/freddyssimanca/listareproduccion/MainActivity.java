package com.example.freddyssimanca.listareproduccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.lista);
        lv.setAdapter(new CustomListAdapter(this, userList));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                ListItem user = (ListItem) lv.getItemAtPosition(position);
                Intent paso = new Intent(getApplicationContext(), Reproductor.class);
                paso.putExtra("urlPATH", user.getLocation());
                startActivity(paso);
                //Toast.makeText(MainActivity.this, "Selected :" + " " + user.getName() + ", " + user.getLocation(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayList getListData() {
        ArrayList<ListItem> results = new ArrayList<>();

        ListItem c1 = new ListItem();
        c1.setNombre("ALF 24/7");
        c1.setDesignation("TV Live");
        c1.setLocation("http://spy-iptv.com:25461/offices/2BJJSCJTSv/1138");
        results.add(c1);

        ListItem c2 = new ListItem();
        c2.setNombre("CHAPULIN COLORADO 24/7");
        c2.setDesignation("TV Live");
        c2.setLocation("http://spy-iptv.com:25461/offices/2BJJSCJTSv/1135");
        results.add(c2);

        ListItem c3 = new ListItem();
        c3.setNombre("CHESPIRITO 24/7");
        c3.setDesignation("TV Live");
        c3.setLocation("http://spy-iptv.com:25461/offices/2BJJSCJTSv/1134");
        results.add(c3);

        ListItem c4 = new ListItem();
        c4.setNombre("CORAJE EL PERRO COBARDE 24/7");
        c4.setDesignation("TV Live");
        c4.setLocation("http://spy-iptv.com:25461/offices/2BJJSCJTSv/1133");
        results.add(c4);

        return results;
    }

}