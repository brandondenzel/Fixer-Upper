package com.example1.brandon.testing;
//testing
import android.content.res.Resources;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

import java.util.logging.Handler;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);

        //ActionBar actionBar = getSupportActionBar();
        //actionBar.setDisplayHomeAsUpEnabled(true);

        TextView myText = (TextView) findViewById(R.id.click );
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(300);
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        myText.startAnimation(anim);
    }

    @Override
    public void onBackPressed() {
        if(findViewById(R.id.main) != null)
        {
            setContentView(R.layout.title);
        }
        else if(findViewById(R.id.button) != null)
        {
            setContentView(R.layout.activity_main);

            String[] buttonList = {"first button", "second button", "third button", "fourth button", "fifth button", "sixth button", "seventh button", "eigth button"};
            ListAdapter theAdapter = new ArrayAdapter<String>(this, R.layout.row_layout, R.id.textView1, buttonList);
            ListView theListView = (ListView) findViewById(R.id.theListView);
            theListView.setAdapter(theAdapter);
            theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String button = String.valueOf(parent.getItemAtPosition(position));
                    if (button == "first button") {
                        setContentView(R.layout.first_button_main);
                        Resources res = getResources();
                        String[] quotes = res.getStringArray(R.array.quoteArray);
                        int num = quotes.length;
                        Random randomGenerator = new Random();
                        int randomInt = randomGenerator.nextInt(num);
                        final TextView quote = (TextView) findViewById(R.id.firstButtonQuote);
                        String quote1 = quotes[randomInt];
                        quote.setText(quote1);
                    } else if (button == "second button") {
                        setContentView(R.layout.second_button_main);
                    } else if (button == "third button") {
                        setContentView(R.layout.third_button_main);
                    } else if (button == "fourth button") {
                        setContentView(R.layout.fourth_button_main);
                    }

                }
            });
        }
        else
        {
            System.exit(1);
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

    public void mainMenu(View view) {
        setContentView(R.layout.title);

        TextView myText = (TextView) findViewById(R.id.click );
        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(300);
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        myText.startAnimation(anim);
    }


    public void createList(View view)
    {
        setContentView(R.layout.activity_main);

        String[] buttonList = {"first button", "second button", "third button", "fourth button", "fifth button", "sixth button", "seventh button", "eigth button"};
        ListAdapter theAdapter = new ArrayAdapter<String>(this, R.layout.row_layout, R.id.textView1, buttonList);
        ListView theListView = (ListView) findViewById(R.id.theListView);
        theListView.setAdapter(theAdapter);
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String button = String.valueOf(parent.getItemAtPosition(position));
                if (button == "first button")
                {
                    setContentView(R.layout.first_button_main);
                    Resources res = getResources();
                    String[] quotes = res.getStringArray(R.array.quoteArray);
                    int num = quotes.length;
                    Random randomGenerator = new Random();
                    int randomInt = randomGenerator.nextInt(num);
                    final TextView quote = (TextView) findViewById(R.id.firstButtonQuote);
                    String quote1 = quotes[randomInt];
                    quote.setText(quote1);
                }
                else if (button == "second button")
                {
                    setContentView(R.layout.second_button_main);
                }
                else if (button == "third button")
                {
                    setContentView(R.layout.third_button_main);
                }
                else if (button == "fourth button")
                {
                    setContentView(R.layout.fourth_button_main);
                }

            }
        });
    }
}
