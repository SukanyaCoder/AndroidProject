package com.sukanya.emetest;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainGrid extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_grid);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });



        //oN click on image

        ImageView iv1=(ImageView) findViewById(R.id.image22);
        iv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGrid.this,MainCompanyProfile.class));
            }
        });
        //on Click listener on text
        TextView tv1=(TextView) findViewById(R.id.t2);
        tv1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGrid.this,MainCompanyProfile.class));
            }
        });
        //oN click on image2

        ImageView iv2=(ImageView) findViewById(R.id.image23);
        iv2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGrid.this,MainCourses.class));
            }
        });
        //on Click listener on text2
        TextView tv2=(TextView) findViewById(R.id.t1);
        tv2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGrid.this,MainCourses.class));
            }
        });
        //oN click on image3

        ImageView iv3=(ImageView) findViewById(R.id.image21);
        iv3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGrid.this,MainVideos.class));
            }
        });
        //on Click listener on text3
        TextView tv3=(TextView) findViewById(R.id.t21);
        tv3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGrid.this,MainVideos.class));
            }
        });
        //oN click on image4

        ImageView iv4=(ImageView) findViewById(R.id.image222);
        iv4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGrid.this,MainContact.class));
            }
        });
        //on Click listener on text4
        TextView tv4=(TextView) findViewById(R.id.t222);
        tv4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGrid.this,MainContact.class));
            }
        });
        //oN click on image5

        ImageView iv5=(ImageView) findViewById(R.id.image31);
        iv5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGrid.this,MainRegistration.class));
            }
        });
        //on Click listener on text5
        TextView tv5=(TextView) findViewById(R.id.t31);
        tv5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainGrid.this,MainRegistration.class));
            }
        });

//        //oN click on image6
//        ImageView iv6=(ImageView) findViewById(R.id.image33);
//        iv6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i =new Intent(Intent.ACTION_SEND);
//
//
//
//                i.setData(Uri.parse("email"));
//                String[]s ={"sunil@emetechnologies.com"};
//                i.putExtra(Intent.EXTRA_EMAIL,s);
//                i.putExtra(Intent.EXTRA_SUBJECT,"this is subject");
//                i.putExtra(Intent.EXTRA_TEXT,"hii This is the Email Body");
//                i.setType("message/rfc822");
//                Intent chooser=Intent.createChooser(i,"Send Email");
//            }
//        });


        //onnnnn Image6
        ImageView iv6=(ImageView) findViewById(R.id.image33);
        iv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_SEND);

                i.setData(Uri.parse("email"));
                String[]s ={"sunil@emetechnologies.com"};
                i.putExtra(Intent.EXTRA_EMAIL,s);


                i.setType("message/rfc822");
                Intent chooser=Intent.createChooser(i,"Send Email");

                startActivity(chooser);
            }
        });

        //on text6
        TextView tv6=(TextView) findViewById(R.id.t33);
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(Intent.ACTION_SEND);

                i.setData(Uri.parse("email"));
                String[]s ={"sunil@emetechnologies.com"};
                i.putExtra(Intent.EXTRA_EMAIL,s);


                i.setType("message/rfc822");
                Intent chooser=Intent.createChooser(i,"Send Email");

                startActivity(chooser);
            }
        });












        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main_grid, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
////        if (id == R.id.action_settings) {
////            return true;
////        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.company) {
            // Handle the camera action
            startActivity(new Intent(MainGrid.this,MainCompanyProfile.class));
        } else if (id == R.id.course) {

            startActivity(new Intent(MainGrid.this,MainCourses.class));
        } else if (id == R.id.videos) {

            startActivity(new Intent(MainGrid.this,MainVideos.class));
        } else if (id == R.id.contact) {

            startActivity(new Intent(MainGrid.this,MainContact.class));
        }
//        else if (id == R.id.send) {
//
//            startActivity(new Intent(MainGrid.this,MainCompanyProfile.class));
//        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
