package com.example.calculatorlab1_kcook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CalculatorBrain calcObj = new CalculatorBrain();
    TextView answer_display;
    String text = "";
    double result = 0;



    Button one_btn;
    Button two_btn;
    Button three_btn;
    Button four_btn;
    Button five_btn;
    Button six_btn;
    Button seven_btn;
    Button eight_btn;
    Button nine_btn;
    Button zero_btn;
    Button clear_btn;
    Button equals_btn;
    Button divide_btn;
    Button multiply_btn;
    Button minus_btn;
    Button plus_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one_btn = (Button) findViewById(R.id.one_btn);
        two_btn = (Button) findViewById(R.id.two_btn);
        three_btn = (Button) findViewById(R.id.three_btn);
        four_btn = (Button) findViewById(R.id.four_btn);
        five_btn = (Button) findViewById(R.id.five_btn);
        six_btn = (Button) findViewById(R.id.six_btn);
        seven_btn = (Button) findViewById(R.id.seven_btn);
        eight_btn = (Button) findViewById(R.id.eight_btn);
        nine_btn = (Button) findViewById(R.id.nine_btn);
        zero_btn = (Button) findViewById(R.id.zero_btn);
        clear_btn = (Button) findViewById(R.id.clear_btn);
        equals_btn = (Button) findViewById(R.id.equals_btn);
        divide_btn = (Button) findViewById(R.id.divide_btn);
        multiply_btn = (Button) findViewById(R.id.multiply_btn);
        plus_btn = (Button) findViewById(R.id.plus_btn);
        minus_btn = (Button) findViewById(R.id.minus_btn);

        answer_display = (TextView) findViewById(R.id.answer_display);

        one_btn.setOnClickListener(this);
        two_btn.setOnClickListener(this);
        three_btn.setOnClickListener(this);
        four_btn.setOnClickListener(this);
        five_btn.setOnClickListener(this);
        six_btn.setOnClickListener(this);
        seven_btn.setOnClickListener(this);
        eight_btn.setOnClickListener(this);
        nine_btn.setOnClickListener(this);
        zero_btn.setOnClickListener(this);
        divide_btn.setOnClickListener(this);
        multiply_btn.setOnClickListener(this);
        plus_btn.setOnClickListener(this);
        minus_btn.setOnClickListener(this);
        equals_btn.setOnClickListener(this);
        clear_btn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Button button = (Button) v;
        String buttonTitle = button.getText().toString();

        if (v == equals_btn) {
            text = text + "=" + calcObj.calculate();
            answer_display.setText(text);
            Log.d("my result is ", "" + result + "");
            Toast.makeText(this, "button is clicked", Toast.LENGTH_SHORT).show();
        } else if (v == clear_btn) {
            calcObj.clearArray();
            answer_display.setText("");
            Log.d("my calObj", "items in calcObj" + calcObj);

            Toast.makeText(this, "clear is clicked", Toast.LENGTH_SHORT).show();

        } else {

            text = text + buttonTitle;
            answer_display.setText(text);
            calcObj.pushToArray(buttonTitle);
//            calcObj.printarray();
        }
    }
}