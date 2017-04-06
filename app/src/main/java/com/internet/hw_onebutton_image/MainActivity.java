package com.internet.hw_onebutton_image;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{
    Button button1;
    ImageView imageView1;
    Boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        imageView1 = (ImageView) findViewById(R.id.imageView1);

        button1.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        if(flag)
        {
            imageView1.setImageResource(R.drawable.nav);
            flag = false;
        }
        else
        {
            imageView1.setImageResource(R.drawable.close);
            flag = true;
        }
    }
}
