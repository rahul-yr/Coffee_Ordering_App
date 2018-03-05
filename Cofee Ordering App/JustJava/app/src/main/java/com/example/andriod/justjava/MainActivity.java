package com.example.andriod.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        int quan = Integer.parseInt(String.valueOf(quantityTextView.getText()));
        display(quan);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        displayPrice(number);


    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        number = number * 10;
        priceTextView.setText("Total : "+NumberFormat.getCurrencyInstance().format(number));


    }

    public void increment(View view) {

        TextView incrementByone = (TextView) findViewById(R.id.quantity_text_view);
        int number = Integer.parseInt(String.valueOf(incrementByone.getText()));
        number++;
        incrementByone.setText("" + number);
        displayPrice(number);
    }

    public void decrement(View view) {
        TextView decrementBy0ne = (TextView) findViewById(R.id.quantity_text_view);
        int number = Integer.parseInt(String.valueOf(decrementBy0ne.getText()));
        if (number > 0) {
            number--;
        } else {
            number = 0;
        }

        decrementBy0ne.setText("" + number);
        displayPrice(number);
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}