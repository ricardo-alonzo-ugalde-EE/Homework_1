package org.electricuniverse.homework_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.awt.font.TextAttribute;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainActivity extends AppCompatActivity
{
    private Button button;
    private Button button2;
    private Button button3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Hard button
         * */
        button = (Button) findViewById(R.id.hard_button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                difficultyHard();
            }
        });

        /**
         * medium button
         * */
        button3 = (Button) findViewById(R.id.medium_button);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                difficultyMedium();
            }
        });

        /**
         * Easy Button
         * */
        button2 = (Button) findViewById(R.id.easy_button);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                difficultyEasy();
            }
        });



    }


//

    public void  difficultyHard()
    {
        Intent intent  = new Intent(this, difficultiy_hard.class);
        startActivity(intent);
    }

    public void  difficultyMedium()
    {
        Intent intent  = new Intent(this, difficulty_medium.class);
        startActivity(intent);
    }


    public void  difficultyEasy()
    {
        Intent intent  = new Intent(this, difficulty_easy.class);
        startActivity(intent);
    }

}