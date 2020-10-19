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

public class difficultiy_hard extends AppCompatActivity
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
    ImageView iv_17;
    ImageView iv_18;
    ImageView iv_19;
    ImageView iv_20;
    ImageView iv_21;
    ImageView iv_22;


    Integer[] imageList = {101,201,102,202,103,203,104,204,105,205,106,206};

    int image101;
    int image102;
    int image103;
    int image104;
    int image105;
    int image106;

    int image201;
    int image202;
    int image203;
    int image204;
    int image205;
    int image206;





    int firstCard;
    int secondCard;

    int clickedFirst;
    int clickedSecond;
    int cardNumber = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficultiy_hard);

       /**
        * Find items from xml file and link with find view by id
       **/
        iv_11 = (ImageView) findViewById(R.id.iv_11);
        iv_12 = (ImageView) findViewById(R.id.iv_12);
        iv_13 = (ImageView) findViewById(R.id.iv_13);
        iv_14 = (ImageView) findViewById(R.id.iv_14);

        iv_15 = (ImageView) findViewById(R.id.iv_15);
        iv_16 = (ImageView) findViewById(R.id.iv_16);

        iv_17 = (ImageView) findViewById(R.id.iv_17);
        iv_18 = (ImageView) findViewById(R.id.iv_18);
        iv_19 = (ImageView) findViewById(R.id.iv_19);
        iv_20 = (ImageView) findViewById(R.id.iv_20);

        iv_21 = (ImageView) findViewById(R.id.iv_21);
        iv_22 = (ImageView) findViewById(R.id.iv_22);

        iv_11.setTag("0");
        iv_12.setTag("1");
        iv_13.setTag("2");
        iv_14.setTag("3");
        iv_15.setTag("4");
        iv_16.setTag("5");
        iv_17.setTag("6");
        iv_18.setTag("7");

        iv_19.setTag("8");
        iv_20.setTag("9");
        iv_21.setTag("10");
        iv_22.setTag("11");

        //load the card images
        frontOfCardsResources();

        //shuffle cards
        Collections.shuffle(Arrays.asList(imageList));


        iv_11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                System.out.printf("Image101");
                gameLogic(iv_11, theCard);
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
                gameLogic(iv_12, theCard);
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
                gameLogic(iv_13, theCard);
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
                gameLogic(iv_14, theCard);
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
                gameLogic(iv_15, theCard);
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
                gameLogic(iv_16, theCard);
                System.out.printf("Image101");
                mCounter ++;
            }
        });

        iv_17.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                System.out.printf("Image101");
                gameLogic(iv_17, theCard);
                //iv_11.setVisibility(View.INVISIBLE);
                //checkEnd();
                mCounter ++;
            }
        });

        iv_18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                gameLogic(iv_18, theCard);
                System.out.printf("Image101");
                //iv_12.setVisibility(View.INVISIBLE);
                //checkEnd();
                mCounter ++;
            }
        });

        iv_19.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                gameLogic(iv_19, theCard);
                System.out.printf("Image101");
                mCounter ++;
            }
        });

        iv_20.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                gameLogic(iv_20, theCard);
                System.out.printf("Image101");
                mCounter ++;

            }
        });

        iv_21.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                gameLogic(iv_21, theCard);
                System.out.printf("Image101");
                mCounter ++;
            }
        });

        iv_22.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int theCard = Integer.parseInt((String) view.getTag());
                gameLogic(iv_22, theCard);
                System.out.printf("Image101");
                mCounter ++;
            }
        });



    }

    private void gameLogic(ImageView iv, int card)
    {
        //set the correct image to imageview
        if (imageList[card] == 101)
        {
            iv.setImageResource(image101);
        }
        else if (imageList[card] == 102)
        {
            iv.setImageResource(image102);
        }
        else if (imageList[card] == 103)
        {
            iv.setImageResource(image103);
        }
        if (imageList[card] == 201)
        {
            iv.setImageResource(image201);
        }
        else if (imageList[card] == 202)
        {
            iv.setImageResource(image202);
        }
        else if (imageList[card] == 203)
        {
            iv.setImageResource(image203);
        }


        //set the correct image to imageview
        if (imageList[card] == 104)
        {
            iv.setImageResource(image104);
        }
        else if (imageList[card] == 105)
        {
            iv.setImageResource(image105);
        }
        else if (imageList[card] == 106)
        {
            iv.setImageResource(image106);
        }
        if (imageList[card] == 204)
        {
            iv.setImageResource(image204);
        }
        else if (imageList[card] == 205)
        {
            iv.setImageResource(image205);
        }
        else if (imageList[card] == 206)
        {
            iv.setImageResource(image206);
        }




            //check which image is selected and save it to the temporary variable
        if (cardNumber == 1)
        {
            firstCard = imageList[card];
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
            secondCard = imageList[card];
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

            iv_17.setEnabled(false);
            iv_18.setEnabled(false);
            iv_19.setEnabled(false);
            iv_20.setEnabled(false);
            iv_21.setEnabled(false);
            iv_22.setEnabled(false);

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
            else if (clickedFirst == 6)
            {
                iv_17.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 7)
            {
                iv_18.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 8)
            {
                iv_19.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 9)
            {
                iv_20.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 10)
            {
                iv_21.setVisibility(View.INVISIBLE);
            }
            else if (clickedFirst == 11)
            {
                iv_22.setVisibility(View.INVISIBLE);
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

            else if (clickedSecond == 6)
            {
                iv_17.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 7)
            {
                iv_18.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 8)
            {
                iv_19.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 9)
            {
                iv_20.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 10)
            {
                iv_21.setVisibility(View.INVISIBLE);
            }
            else if (clickedSecond == 11)
            {
                iv_22.setVisibility(View.INVISIBLE);
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

            iv_17.setImageResource(R.drawable.ic_back);
            iv_18.setImageResource(R.drawable.ic_back);
            iv_19.setImageResource(R.drawable.ic_back);
            iv_20.setImageResource(R.drawable.ic_back);
            iv_21.setImageResource(R.drawable.ic_back);
            iv_22.setImageResource(R.drawable.ic_back);
        }

        iv_11.setEnabled(true);
        iv_12.setEnabled(true);
        iv_13.setEnabled(true);
        iv_14.setEnabled(true);
        iv_15.setEnabled(true);
        iv_16.setEnabled(true);

        iv_17.setEnabled(true);
        iv_18.setEnabled(true);
        iv_19.setEnabled(true);
        iv_20.setEnabled(true);
        iv_21.setEnabled(true);
        iv_22.setEnabled(true);

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
                && iv_16.getVisibility() == View.INVISIBLE
                && iv_17.getVisibility() == View.INVISIBLE
                && iv_18.getVisibility() == View.INVISIBLE
                && iv_19.getVisibility() == View.INVISIBLE
                && iv_20.getVisibility() == View.INVISIBLE
                && iv_21.getVisibility() == View.INVISIBLE
                && iv_22.getVisibility() == View.INVISIBLE)
        {
            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(difficultiy_hard.this);
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
        image104 = R.drawable.ic_image_104;
        image105 = R.drawable.ic_image105;
        image106 = R.drawable.ic_image106;

        image201 = R.drawable.ic_image201;
        image202 = R.drawable.ic_image202;
        image203 = R.drawable.ic_image_203;
        image204 = R.drawable.ic_image_204;
        image205 = R.drawable.ic_image205 ;
        image206 = R.drawable.ic_image206;


    }






}