package com.example.calculator;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculate extends AppCompatActivity {

    EditText firstnum, secondnum;
    TextView equaltext;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate);
    }

    public boolean getNumbers() {

        firstnum = (EditText) findViewById(R.id.num1);

        secondnum = (EditText) findViewById(R.id.num2);

        equaltext = (TextView) findViewById(R.id.equal);

        String s1 = firstnum.getText().toString();

        String s2 = secondnum.getText().toString();

        if (s1.equals("") && s2.equals("")) {

            String result = "Empty Field";
            equaltext.setText(result);

            return false;
        } else {
            num1 = Integer.parseInt(s1);

            num2 = Integer.parseInt(s2);
        }

        return true;
    }

    public void add(View v) {

        if (getNumbers()) {
            int sum = num1 + num2;
            equaltext.setText(Integer.toString(sum));
        }
    }

    public void Sub(View v) {

        if (getNumbers()) {
            int sum = num1 - num2;
            equaltext.setText(Integer.toString(sum));
        }
    }

    public void Mul(View v) {

        if (getNumbers()) {
            int sum = num1 * num2;
            equaltext.setText(Integer.toString(sum));
        }
    }

    public void Div(View v) {

        if (getNumbers()) {

            double sum = num1 / (num2 * 1.0);
            equaltext.setText(Double.toString(sum));
        }
    }

}