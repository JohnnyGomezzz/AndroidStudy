package ru.johnnygomezzz.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textOutput;
    private TextView textIteration1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textOutput = findViewById(R.id.text_output);
        textIteration1 = findViewById(R.id.text_iteration_1);

        initButton1OnClickListener();
        initButton2OnClickListener();
        initButton3OnClickListener();
        initButton4OnClickListener();
        initButton5OnClickListener();
        initButton6OnClickListener();
        initButton7OnClickListener();
        initButton8OnClickListener();
        initButton9OnClickListener();
        initButton0OnClickListener();
        initButtonAddOnClickListener();
        initButtonSubOnClickListener();
        initButtonClearOnClickListener();
    }

    private void initButtonAddOnClickListener() {
        Button buttonAdd = findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "+");
            textIteration1.setText(textOutput.getText());
            textOutput.setText("");
        });
    }

    private void initButtonSubOnClickListener() {
        Button buttonSub = findViewById(R.id.button_sub);
        buttonSub.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "-");
            if (textIteration1.getText().equals("")) {
                textIteration1.setText(textOutput.getText());
                textOutput.setText("");
            } else {

            }
        });
    }

    private void initButtonClearOnClickListener() {
        Button buttonClear = findViewById(R.id.button_clear);
        buttonClear.setOnClickListener(view -> {
            textOutput.setText("");
        });
    }

    private void initButton1OnClickListener() {
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "1");
        });
    }

    private void initButton2OnClickListener() {
        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "2");
        });
    }

    private void initButton3OnClickListener() {
        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "3");
        });
    }

    private void initButton4OnClickListener() {
        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "4");
        });
    }

    private void initButton5OnClickListener() {
        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "5");
        });
    }

    private void initButton6OnClickListener() {
        Button button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "6");
        });
    }

    private void initButton7OnClickListener() {
        Button button7 = findViewById(R.id.button_7);
        button7.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "7");
        });
    }

    private void initButton8OnClickListener() {
        Button button8 = findViewById(R.id.button_8);
        button8.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "8");
        });
    }

    private void initButton9OnClickListener() {
        Button button9 = findViewById(R.id.button_9);
        button9.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "9");
        });
    }

    private void initButton0OnClickListener() {
        Button button0 = findViewById(R.id.button_0);
        button0.setOnClickListener(view -> {
            textOutput.setText(textOutput.getText() + "0");
        });
    }
}