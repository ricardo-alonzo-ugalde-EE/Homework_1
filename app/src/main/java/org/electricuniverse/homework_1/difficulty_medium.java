package org.electricuniverse.homework_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.Collections;

public class difficulty_medium extends AppCompatActivity
{
    /**
     * Variables
     * **/
    private int mCounter = 0;

    ImageView iv_11;
    ImageView iv_12;
    ImageView iv_13;
    ImageView iv_14;

    ImageView iv_15;
    ImageView iv_16;



    Integer[] cardsArray = {101, 201,102,202,103,203};

    int image101;
    int image102;
    int image103;
    int image201;
    int image202;
    int image203;




    int firstCard;
    int secondCard;

    int clickedFirst;
    int clickedSecond;
    int cardNumber = 1;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_medium);

        /**
         * Find items from xml file and link with find view by id
         **/
        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);

        iv_15 = (ImageView) findViewById(R.id.iv_15);
        iv_16 = (ImageView) findViewById(R.id.iv_16);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_15.setTag("4");
        iv_16.setTag("5");

        //load the card images
        frontOfCardsResources();

        //shuffle cards
        Collections.shuffle(Arrays.asList(cardsArray));


        iv_11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                System.out.printf("Image101");
                doStuff(iv_11, theCard);
                //iv_11.setVisibility(View.INVISIBLE);
                //checkEnd();
                mCounter ++;
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_12, theCard);
                System.out.printf("Image101");
                //iv_12.setVisibility(View.INVISIBLE);
                //checkEnd();
                mCounter ++;
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_13, theCard);
                System.out.printf("Image101");
                mCounter ++;
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_14, theCard);
                System.out.printf("Image101");
                mCounter ++;

            }
        });

        iv_15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_15, theCard);
                System.out.printf("Image101");
                mCounter ++;
            }
        });

        iv_16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                doStuff(iv_16, theCard);
                System.out.printf("Image101");
                mCounter ++;
            }
        });


    }

    private void doStuff(ImageView iv, int card)
    {
        //set the correct image to imageview
        if (cardsArray[card] == 101)
        {
            iv.setImageResource(image101);
        }
        else if (cardsArray[card] == 102)
        {
            iv.setImageResource(image102);
        }
        else if (cardsArray[card] == 103)
        {
            iv.setImageResource(image103);
        }
        if (cardsArray[card] == 201)
        {
            iv.setImageResource(image201);
        }
        else if (cardsArray[card] == 202)
        {
            iv.setImageResource(image202);
        }
        else if (cardsArray[card] == 203)
        {
            iv.setImageResource(image203);
        }



        //check which image is selected and save it to the temporary variable
        if (cardNumber == 1)
        {
            firstCard = cardsArray[card];
            if (firstCard > 200)
            {
                firstCard = firstCard - 100;
            }
            cardNumber = 2;
            clickedFirst = card;
            iv.setEnabled(false);
        }
        else if (cardNumber == 2)
        {
            secondCard = cardsArray[card];
            if (secondCard > 200)
            {
                secondCard = secondCard - 100;
            }
            cardNumber = 1;
            clickedSecond = card;

            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_15.setEnabled(false);
            iv_16.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable()
            {
                @Override
                public void run()
                {
                    //check if the selected images are equal
                    calculate();
                }
            },1000);

        }

    }

    private void calculate()
    {
        // if images are equal remove them and make them invisible
        if( firstCard ==secondCard)
        {
            if (clickedFirst == 0)
            {
                iv_11.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 1)
            {
                iv_12.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 2)
            {
                iv_13.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 3)
            {
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 4)
            {
                iv_15.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 5)
            {
                iv_16.setVisibility(View.INVISIBLE);
            }

            if (clickedSecond == 0)
            {
                iv_11.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 1)
            {
                iv_12.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 2)
            {
                iv_13.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 3)
            {
                iv_14.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 4)
            {
                iv_15.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 5)
            {
                iv_16.setVisibility(View.INVISIBLE);
            }

        }
        else
        {
            iv_11.setImageResource(R.drawable.ic_back);
            iv_12.setImageResource(R.drawable.ic_back);
            iv_13.setImageResource(R.drawable.ic_back);
            iv_14.setImageResource(R.drawable.ic_back);
            iv_15.setImageResource(R.drawable.ic_back);
            iv_16.setImageResource(R.drawable.ic_back);
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_15.setEnabled(true);
        iv_16.setEnabled(true);

        //check if the game is over
        checkEnd();


    }

    private void checkEnd()
    {
        if(iv_11.getVisibility() == View.INVISIBLE
                && iv_12.getVisibility() == View.INVISIBLE
                && iv_13.getVisibility() == View.INVISIBLE
                && iv_14.getVisibility() == View.INVISIBLE
                && iv_15.getVisibility() == View.INVISIBLE
                && iv_16.getVisibility() == View.INVISIBLE)
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(difficulty_medium.this);
            alertDialogBuilder.setMessage("Game Over! Total clicks: " + Integer.toString(mCounter))
                    .setCancelable(false)
                    .setPositiveButton("New", new DialogInterface.OnClickListener()
                    {
                        @Override
                        public void onClick(DialogInterface dialog, int which)
                        {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    })
                    .setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }
    }


    private  void frontOfCardsResources()
    {
        image101 = R.drawable.ic_image101;
        image102 = R.drawable.ic_image102;
        image103 = R.drawable.ic_image_103;
        image201 = R.drawable.ic_image201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_image_203;
    }


}