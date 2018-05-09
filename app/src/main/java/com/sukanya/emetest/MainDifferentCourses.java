package com.sukanya.emetest;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainDifferentCourses extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_different_courses);

        textView=(TextView)findViewById(R.id.syllabus);
        imageView=(ImageView)findViewById(R.id.courseImage);
        floatingActionButton=(FloatingActionButton)findViewById(R.id.floatingImage);

        // Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        android.support.v7.widget.Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar()!=null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        String hh=getIntent().getExtras().getString("course");
        switch (hh)
        {
            case "JAVA":
                textView.setText("Java Application\n" +
                        "Complete OOPS Concept\n" +
                        "Strings,Thread\n"+
                        "Objects,Class\n"+
                        "Collection API\n"+
                        "File Handling\n"+
                        "Applet\n"+
                        "Event Handling\n"+
                        "AWT,Swings\n"+
                        "HTML,CSS,JavaScript\n"+
                        "SQL JDB\n"+
                        "Advance Java Servlet\n"+
                        "JSP\n"+
                        "AJAX\n"+
                        "Frameworks\n"+
                        "Strut 2.x\n"+
                        "Hibernate\n"+
                        "EJB,Springs");

                imageView.setImageResource(R.drawable.java);
                floatingActionButton.setImageResource(R.drawable.java);
                break;
            case "ANDROID":
                textView.setText("Android Application");
                imageView.setImageResource(R.drawable.alogo);
                floatingActionButton.setImageResource(R.drawable.alogo);
                textView.setText("Android Basics\n"+
                        "Application Structure\n"+
                        "Emulator Android Virtual Device\n"+
                        "Launching Emulator\n"+
                        "Basic UI Design\n"+
                        "Intents (In Detail)\n"+
                        "SQLite Programming\n"+
                        "Cursor\n"+
                        "Tabs & Tab Activity Styles & Themes\n"+
                        "Multimedida\n"+
                        "Noti cacats\n"+
                        "Latest In Android\n"+
                        "2 D Animations\n"+
                        "XML Parsing\n"+
                        "GPS,Location based Services\n"+
                        "Sensors"
                );
                break;
            case "WEB DESIGN":
                textView.setText("Web Design");
                imageView.setImageResource(R.drawable.web_design);
                floatingActionButton.setImageResource(R.drawable.web_design);
                textView.setText("HTML 5,CSS3\n"+
                        "JavaScript,JQuery\n"+
                        "Bootstrap\n"+
                        "Photoshop\n"+
                        "Coreldraw"
                );
                break;
            case "PHP":
                textView.setText("PHP");
                imageView.setImageResource(R.drawable.php);
                floatingActionButton.setImageResource(R.drawable.php);
                textView.setText("PHP Introduction\n"+
                        "Loops,Array,Functions\n"+
                        "Spring,File Handling\n"+
                        "Complete OOPs Concepts\n"+
                        "Advance PHP\n"+
                        "JQuery\n"+
                        "AJAX\n"+
                        "Working with my SQL Admin\n"+
                        "SQL Queries\n"+
                        "CMS\n"+
                        "WordPress\n"+
                        "Joomla\n"+
                        "Magento\n"+
                        "Drupan"

                );
                break;
            case  "SEO":
                textView.setText("Seo Application");
                imageView.setImageResource(R.drawable.seo);
                floatingActionButton.setImageResource(R.drawable.seo);
                textView.setText("SEO Basic Tip,Tricks & Optimisation\n"+
                        "On Page SEO\n"+
                        "OFF SEO\n"+
                        "Advance SEO Techniques\n"+
                        "Google Tools & updates\n"+
                        "Research & Analysis\n"+
                        "Keyword Strategies\n"+
                        "Social Media Optimisation"
                );


                break;
            case "NETWORKING":
                textView.setText("Networking Application");
                imageView.setImageResource(R.drawable.networking);
                floatingActionButton.setImageResource(R.drawable.networking);
                textView.setText("CCNA CCNP NMAP\n"+
                        "Network Basics\n"+
                        "Subnetting\n"+
                        "TCPIP & OSA Model\n"+
                        "Routing Protocols\n"+"Subnet mask & Network Mask\n"+
                        "Network Infrastructure\n"+
                        "RIP, OSPS, EIGRP\n"+
                        "Switching\n"+"VLAN,STP Ether Chanel"
                        +"Security,WAN,Port Security\n"+
                        "Inter-VLAN routing\n"+
                        "Wireless Line\n"+"IPv4,IPv6"


                );
                break;
            case "DIGITAL MARKETING":
                textView.setText("Digital Marketing Application");
                imageView.setImageResource(R.drawable.images);
                floatingActionButton.setImageResource(R.drawable.images);
                textView.setText("Search Engine Optmiation\n"+
                        "Introduction\n"+"Social Media\n"+"Content Marketing\n"+"Email Marketing\n"+
                        "pay per click\n"+"Website conversion rate optimisation\n"+"Digital Analytics\n"+
                        "Tools-Google Analytics:Specific Techniques\n"+
                        "Tools-Facebook Marketing & Advertising\n"+
                        "Tools-Youtube & Video Marketing\n"+
                        "Tools-Twitter Advertising\n"+
                        "Digital marketing Strategy"
                );
                break;
        }


    }
}
