package com.example.ardi.pantheon;

import android.app.Activity;
import android.widget.ArrayAdapter;


public class customListAdapter extends ArrayAdapter<String> {




    customListAdapter(Activity context, String[] osname, Integer[] imgid) {
        super(context, R.layout.custom_list_adapter, osname);

    }


}