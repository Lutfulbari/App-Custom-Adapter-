package com.lutful.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = findViewById(R.id.listView);

        MyAdapter myAdaper = new MyAdapter();
        myListView.setAdapter(myAdaper);

    }
//+++++++++++++++++++++++++++

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {

            return 5;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int  i, View view, ViewGroup viewGroup) {

           LayoutInflater layoutInflater = (android.view.LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View myView = LayoutInflater.inflate(R.layout.item, viewGroup, false);

            ImageView imageView;
            imageView = myView.findViewById(R.id.imageView);
            TextView textView = myView.findViewById(R.id.textView);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Toast.makeText(getApplicationContext(), "hi", Toast.LENGTH_LONG) .show();

                    }
                });

           return myView;
        }
    }
}