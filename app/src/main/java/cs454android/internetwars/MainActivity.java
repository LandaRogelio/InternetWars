package cs454android.internetwars;

import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends ActionBarActivity {
    Deck deck; //deck of 60 cards
    Card mainCard; //card that you add to
    Card[] hand; //array of cards make up player's hand
    TextView addUpTo; //TextView that show what number to add up to
    int addTo; //int that holds the number to add up to
    int myTotalCardValue; //int that holds the total card value of selected cards in hand
    Button btnSubmit; //Button to submit answer
    TextView cardsLeftInDeck; //TextView used to show the number of cards left in deck
    ImageButton mainCardImage; //ImageButton that shows the image of the mainCard
    ImageButton[] imageCard; //Array of ImageButtons that shows the images of the hand
    Random randomGenerator; //used to generate random numbers

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //keeps app in portrait mode

        //initializing variables
        randomGenerator = new Random();
        cardsLeftInDeck = (TextView) findViewById(R.id.Deck);
        imageCard = new ImageButton[8];
        imageCard[0] = (ImageButton) findViewById(R.id.imageButton1);
        imageCard[1] = (ImageButton) findViewById(R.id.imageButton2);
        imageCard[2] = (ImageButton) findViewById(R.id.imageButton3);
        imageCard[3] = (ImageButton) findViewById(R.id.imageButton4);
        imageCard[4] = (ImageButton) findViewById(R.id.imageButton5);
        imageCard[5] = (ImageButton) findViewById(R.id.imageButton6);
        imageCard[6] = (ImageButton) findViewById(R.id.imageButton7);
        imageCard[7] = (ImageButton) findViewById(R.id.imageButton8);
        btnSubmit = (Button) findViewById(R.id.button9);
        mainCardImage = (ImageButton) findViewById(R.id.imageButtonMainCard);
        addUpTo = (TextView) findViewById(R.id.AddNumber);
        deck = new Deck();
        mainCard = deck.drawCard();
        //end initializing

        setCardImage(mainCardImage, mainCard.getRank(), mainCard.getSuit());
        drawHand();
        addUpTo.setText("Add up to:" + randomNumberGenerator(mainCard.getRank() + 1, 30, randomGenerator));
        cardsLeftInDeck.setText(deck.getCardsRemaining() + "");

        //assigning listeners to buttons
        /*
            Clicking on any of the imageCard buttons will alternate
            between adding or subtracting the cards value to myTotalCardValue
            depending on whether the card is selected or not.
        */
        imageCard[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hand[0].getSelected()) {
                    myTotalCardValue -= hand[0].getRank();
                    imageCard[0].getBackground().setAlpha(255);
                    hand[0].setSelected(false);
                } else {
                    myTotalCardValue += hand[0].getRank();
                    imageCard[0].getBackground().setAlpha(100);
                    hand[0].setSelected(true);
                }
                btnSubmit.setText("Submit: " + myTotalCardValue);
            }
        });

        imageCard[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hand[1].getSelected()) {
                    myTotalCardValue -= hand[1].getRank();
                    imageCard[1].getBackground().setAlpha(255);
                    hand[1].setSelected(false);
                } else {
                    myTotalCardValue += hand[1].getRank();
                    imageCard[1].getBackground().setAlpha(100);
                    hand[1].setSelected(true);
                }
                btnSubmit.setText("Submit: " + myTotalCardValue);
            }
        });
        imageCard[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hand[2].getSelected()) {
                    myTotalCardValue -= hand[2].getRank();
                    imageCard[2].getBackground().setAlpha(255);
                    hand[2].setSelected(false);
                } else {
                    myTotalCardValue += hand[2].getRank();
                    imageCard[2].getBackground().setAlpha(100);
                    hand[2].setSelected(true);
                }
                btnSubmit.setText("Submit: " + myTotalCardValue);
            }
        });
        imageCard[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hand[3].getSelected()) {
                    myTotalCardValue -= hand[3].getRank();
                    imageCard[3].getBackground().setAlpha(255);
                    hand[3].setSelected(false);
                } else {
                    myTotalCardValue += hand[3].getRank();
                    imageCard[3].getBackground().setAlpha(100);
                    hand[3].setSelected(true);
                }
                btnSubmit.setText("Submit: " + myTotalCardValue);
            }
        });
        imageCard[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hand[4].getSelected()) {
                    myTotalCardValue -= hand[4].getRank();
                    imageCard[4].getBackground().setAlpha(255);
                    hand[4].setSelected(false);
                } else {
                    myTotalCardValue += hand[4].getRank();
                    imageCard[4].getBackground().setAlpha(100);
                    hand[4].setSelected(true);
                }
                btnSubmit.setText("Submit: " + myTotalCardValue);
            }
        });
        imageCard[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hand[5].getSelected()) {
                    myTotalCardValue -= hand[5].getRank();
                    imageCard[5].getBackground().setAlpha(255);
                    hand[5].setSelected(false);
                } else {
                    myTotalCardValue += hand[5].getRank();
                    imageCard[5].getBackground().setAlpha(100);
                    hand[5].setSelected(true);
                }
                btnSubmit.setText("Submit: " + myTotalCardValue);
            }
        });
        imageCard[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hand[6].getSelected()) {
                    myTotalCardValue -= hand[6].getRank();
                    imageCard[6].getBackground().setAlpha(255);
                    hand[6].setSelected(false);
                } else {
                    myTotalCardValue += hand[6].getRank();
                    imageCard[6].getBackground().setAlpha(100);
                    hand[6].setSelected(true);
                }
                btnSubmit.setText("Submit: " + myTotalCardValue);
            }
        });
        imageCard[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hand[7].getSelected()) {
                    myTotalCardValue -= hand[7].getRank();
                    imageCard[7].getBackground().setAlpha(255);
                    hand[7].setSelected(false);
                } else {
                    myTotalCardValue += hand[7].getRank();
                    imageCard[7].getBackground().setAlpha(100);
                    hand[7].setSelected(true);
                }
                btnSubmit.setText("Submit: " + myTotalCardValue);
            }
        });
        /*
            Clicking on submit will check whether the player's selection produces a correct solution.
            If it does then draw a new card from the deck that becomes the new mainCard, set the image
            of the mainCard, get a new random number to add up to (addUpTo), reset myTotalCardValue back to 0,
            disable the cards in the hand used to produce the correct solution, update the number of cards left in the deck,
            and set btnSubmit's text.
         */
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (myTotalCardValue + mainCard.getRank() == addTo) {
                    Toast.makeText(getApplicationContext(), "TRUE", Toast.LENGTH_SHORT).show();
                    mainCard = deck.drawCard();
                    setCardImage(mainCardImage, mainCard.getRank(), mainCard.getSuit());
                    addUpTo.setText("Add up to:" + randomNumberGenerator(mainCard.getRank() + 1, 30, randomGenerator));
                    myTotalCardValue = 0;
                    for (int i = 0; i < 8; i++) {
                        if (hand[i].getSelected()) {
                            hand[i].setSelected(false);
                            imageCard[i].setEnabled(false);
                            imageCard[i].setBackgroundResource(R.drawable.zzback_of_card);
                        }
                    }
                    cardsLeftInDeck.setText(deck.getCardsRemaining()+"");
                    btnSubmit.setText("Submit: " + myTotalCardValue);
                } else {
                    Toast.makeText(getApplicationContext(), "FALSE", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    /**
     * Gets a random number between start and end that is used to get the
     * number to add up to
     *
     * @param start minimum number to return
     * @param end maximum number to return
     * @param rGen the randomGenerator
     * @return a random number between start and end
     */
    private int randomNumberGenerator(int start, int end, Random rGen) {
        if (start < 2) {
            start = 2;
        }
        int range = (end - start + 1);
        double fraction = range * rGen.nextDouble();
        addTo = (int) (fraction + start);
        return addTo;
    }

    /**
     * instantiates hand to 8 cards.
     * sets each card to a random card from the deck using drawCard() method.
     * sets the image of each card using setCardImage().
     */
    private void drawHand() {
        hand = new Card[8];
        for (int i = 0; i < 8; i++) {
            hand[i] = deck.drawCard();
            setCardImage(imageCard[i], hand[i].getRank(), hand[i].getSuit());
        }

    }

    /**
     * uses the cards rank and suit to assign the ImageButton card
     * the correct image from drawable
     *
     * @param card the card to set the image of.
     * @param rank the rank of the card
     * @param suit the suit of the card (0 == "banana", 1 == "cat", 2 == "philosoraptor", 3 == "cursor")
     */
    private void setCardImage(ImageButton card, int rank, int suit){
        if(suit == 0){
            switch (rank){
                case 1:
                    card.setBackgroundResource(R.drawable.banana_0001);
                    break;
                case 2:
                    card.setBackgroundResource(R.drawable.banana_0010);
                    break;
                case 3:
                    card.setBackgroundResource(R.drawable.banana_0011);
                    break;
                case 4:
                    card.setBackgroundResource(R.drawable.banana_0100);
                    break;
                case 5:
                    card.setBackgroundResource(R.drawable.banana_0101);
                    break;
                case 6:
                    card.setBackgroundResource(R.drawable.banana_0110);
                    break;
                case 7:
                    card.setBackgroundResource(R.drawable.banana_0111);
                    break;
                case 8:
                    card.setBackgroundResource(R.drawable.banana_1000);
                    break;
                case 9:
                    card.setBackgroundResource(R.drawable.banana_1001);
                    break;
                case 10:
                    card.setBackgroundResource(R.drawable.banana_a);
                    break;
                case 11:
                    card.setBackgroundResource(R.drawable.banana_b);
                    break;
                case 12:
                    card.setBackgroundResource(R.drawable.banana_c);
                    break;
                case 13:
                    card.setBackgroundResource(R.drawable.banana_d);
                    break;
                case 14:
                    card.setBackgroundResource(R.drawable.banana_e);
                    break;
                case 15:
                    card.setBackgroundResource(R.drawable.banana_f);
                    break;
            }
        }

        else if(suit == 1){
            switch (rank){
                case 1:
                    card.setBackgroundResource(R.drawable.cat_0001);
                    break;
                case 2:
                    card.setBackgroundResource(R.drawable.cat_0010);
                    break;
                case 3:
                    card.setBackgroundResource(R.drawable.cat_0011);
                    break;
                case 4:
                    card.setBackgroundResource(R.drawable.cat_0100);
                    break;
                case 5:
                    card.setBackgroundResource(R.drawable.cat_0101);
                    break;
                case 6:
                    card.setBackgroundResource(R.drawable.cat_0110);
                    break;
                case 7:
                    card.setBackgroundResource(R.drawable.cat_0111);
                    break;
                case 8:
                    card.setBackgroundResource(R.drawable.cat_1000);
                    break;
                case 9:
                    card.setBackgroundResource(R.drawable.cat_1001);
                    break;
                case 10:
                    card.setBackgroundResource(R.drawable.cat_a);
                    break;
                case 11:
                    card.setBackgroundResource(R.drawable.cat_b);
                    break;
                case 12:
                    card.setBackgroundResource(R.drawable.cat_c);
                    break;
                case 13:
                    card.setBackgroundResource(R.drawable.cat_d);
                    break;
                case 14:
                    card.setBackgroundResource(R.drawable.cat_e);
                    break;
                case 15:
                    card.setBackgroundResource(R.drawable.cat_f);
                    break;
            }
        }
        else if(suit == 2){
            switch (rank){
                case 1:
                    card.setBackgroundResource(R.drawable.philosoraptor_0001);
                    break;
                case 2:
                    card.setBackgroundResource(R.drawable.philosoraptor_0010);
                    break;
                case 3:
                    card.setBackgroundResource(R.drawable.philosoraptor_0011);
                    break;
                case 4:
                    card.setBackgroundResource(R.drawable.philosoraptor_0100);
                    break;
                case 5:
                    card.setBackgroundResource(R.drawable.philosoraptor_0101);
                    break;
                case 6:
                    card.setBackgroundResource(R.drawable.philosoraptor_0110);
                    break;
                case 7:
                    card.setBackgroundResource(R.drawable.philosoraptor_0111);
                    break;
                case 8:
                    card.setBackgroundResource(R.drawable.philosoraptor_1000);
                    break;
                case 9:
                    card.setBackgroundResource(R.drawable.philosoraptor_1001);
                    break;
                case 10:
                    card.setBackgroundResource(R.drawable.philosoraptor_a);
                    break;
                case 11:
                    card.setBackgroundResource(R.drawable.philosoraptor_b);
                    break;
                case 12:
                    card.setBackgroundResource(R.drawable.philosoraptor_c);
                    break;
                case 13:
                    card.setBackgroundResource(R.drawable.philosoraptor_d);
                    break;
                case 14:
                    card.setBackgroundResource(R.drawable.philosoraptor_e);
                    break;
                case 15:
                    card.setBackgroundResource(R.drawable.philosoraptor_f);
                    break;
            }
        }
        else if(suit == 3){
            switch (rank){
                case 1:
                    card.setBackgroundResource(R.drawable.cursor_0001);
                    break;
                case 2:
                    card.setBackgroundResource(R.drawable.cursor_0010);
                    break;
                case 3:
                    card.setBackgroundResource(R.drawable.cursor_0011);
                    break;
                case 4:
                    card.setBackgroundResource(R.drawable.cursor_0100);
                    break;
                case 5:
                    card.setBackgroundResource(R.drawable.cursor_0101);
                    break;
                case 6:
                    card.setBackgroundResource(R.drawable.cursor_0110);
                    break;
                case 7:
                    card.setBackgroundResource(R.drawable.cursor_0111);
                    break;
                case 8:
                    card.setBackgroundResource(R.drawable.cursor_1000);
                    break;
                case 9:
                    card.setBackgroundResource(R.drawable.cursor_1001);
                    break;
                case 10:
                    card.setBackgroundResource(R.drawable.cursor_a);
                    break;
                case 11:
                    card.setBackgroundResource(R.drawable.cursor_b);
                    break;
                case 12:
                    card.setBackgroundResource(R.drawable.cursor_c);
                    break;
                case 13:
                    card.setBackgroundResource(R.drawable.cursor_d);
                    break;
                case 14:
                    card.setBackgroundResource(R.drawable.cursor_e);
                    break;
                case 15:
                    card.setBackgroundResource(R.drawable.cursor_f);
                    break;
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
