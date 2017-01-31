package com.example.harvey.toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    String[] values={"11","22","33","hide"};
    ListView lv;
    Toast tos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tos=Toast.makeText(this,"",Toast.LENGTH_LONG);


        lv=(ListView)findViewById(R.id.lv);
        lv.setOnItemClickListener(this);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,values);
        lv.setAdapter(adapter);

    }

    public void tosTest(View v){
        String msg=" ";
        Toast.makeText(this,"toast test",Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       // tosTest(view);


        String msg=" ";
        if (position==3){
            //tos.cancel();
            tos.setGravity(Gravity.TOP|Gravity.LEFT,0,50);
            tos.setText("gravity");
            tos.show();
        }else{
            msg=values[position];
            tos.setText(msg);
            tos.show();

        }

    }
}
