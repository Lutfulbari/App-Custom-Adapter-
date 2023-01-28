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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    ListView myListView;
    ArrayList <HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap <String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = findViewById(R.id.listView);


        hashMap = new HashMap<>();
        hashMap.put("name", "Jubayer Hossain");
        hashMap.put("mobile", "999");
        hashMap.put("Email", "lutfulbarimusa@gmail.com");
        arrayList.add(hashMap);




        hashMap = new HashMap<>();
        hashMap.put("name", "Musa");
        hashMap.put("Mobile", "111");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "Musk");
        hashMap.put("Mobile", "222");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name", "Mohammadsk");
        hashMap.put("Mobile", "3333");
        arrayList.add(hashMap);

        MyAdapter myAdaper = new MyAdapter();
        myListView.setAdapter(myAdaper);


    }

    //+++++++++++++++++++++++++++

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return arrayList.size();
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
        public View getView(int position, View view, ViewGroup viewGroup) {

            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View myView = LayoutInflater.inflate(R.layout.item, viewGroup, false);


            View imageView;
            imageView = myView.findViewById(R.id.imageView);
            TextView tvName = myView.findViewById(R.id.tvName);
            TextView tvMobile = myView.findViewById(R.id.tvMobile);


            HashMap<String, String> hashMap = arrayList.get(position);
            String name = hashMap.get("name");
            String mobile = hashMap.get("name");

            tvName.setText("name");
            tvMobile.setText("mobile");


            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(getApplicationContext(), "hi\n" + name, Toast.LENGTH_LONG).show();

                }
            });

            return myView;
        }
    }
}