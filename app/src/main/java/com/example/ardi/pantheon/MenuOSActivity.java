package com.example.ardi.pantheon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MenuOSActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView list;
    Intent intent;
    String[] osname = {"Persegi","Lingkaran","Segiiga","Persegi Panjang","Trapesium"};
    Integer[] imgid = {R.drawable.panca, R.drawable.panca, R.drawable.panca };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_os);

        customListAdapter adapter = new customListAdapter(this, osname, imgid );
        list = findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent = new Intent(MenuOSActivity.this, MainActivity.class);
                intent.putExtra("Tit", "Persegi");
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(MenuOSActivity.this, MainActivity.class);
                intent.putExtra("Tit", "Lingkaran");
                startActivity(intent);
                break;

            case 2:
                intent = new Intent(MenuOSActivity.this, MainActivity.class);
                intent.putExtra("Tit", "Segitiga");
                startActivity(intent);
                break;

            case 3:
                intent = new Intent(MenuOSActivity.this, MainActivity.class);
                intent.putExtra("Tit", "Persegi Panjang");
                startActivity(intent);
                break;

            case 4:
                intent = new Intent(MenuOSActivity.this, MainActivity.class);
                intent.putExtra("Tit", "Trapesium");
                startActivity(intent);
                break;


            default:
                break;
        }
    }
}
