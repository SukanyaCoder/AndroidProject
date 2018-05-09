package com.sukanya.emetest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainCourses extends AppCompatActivity {

    ListView list;

    String[] maintitle ={
            "JAVA","ANDROID",
            "WEB DESIGN","PHP","SEO","NETWORKING","DIGITAL MARKETING"

    };

//    String[] subtitle ={
//            "Sub Title 1","Sub Title 2",
//            "Sub Title 3","Sub Title 4",
//
//    };

    Integer[] imgid={
            R.drawable.java,R.drawable.alogo,R.drawable.web_design,
            R.drawable.php,R.drawable.seo,R.drawable.networking,R.drawable.images

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        listadapter adapter=new listadapter(this,maintitle,imgid );
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                if(position == 0) {
//                    Toast.makeText(getApplicationContext(), " First  Code", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(MainCourses.this,MainDifferentCourses.class));
//                }
//                else if(position == 1) {
//
//                    Toast.makeText(getApplicationContext()," Second  Code",Toast.LENGTH_SHORT).show();
//                }
//
//                else if(position == 2) {
//
//                    Toast.makeText(getApplicationContext()," Third  Code",Toast.LENGTH_SHORT).show();
//                }
//                else if(position == 3) {
//
//                    Toast.makeText(getApplicationContext()," Forth  Code",Toast.LENGTH_SHORT).show();
//                }
                Intent intent=new Intent(MainCourses.this,MainDifferentCourses.class);
                intent.putExtra("course",maintitle[position]);
                startActivity(intent);


            }
        });



    }
}
