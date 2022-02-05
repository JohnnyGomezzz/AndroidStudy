package ru.johnnygomezzz.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener {

    private TextView helloWorldTv;
    private Button pressMeButton;
    private Button cancelButton;
    private CheckBox checkMeCb;
    private Switch switchButton;

    private EditText operand1;
    private EditText operand2;
    private Button sumButton;
    private CalendarView calendarView;
    private ToggleButton toggleButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        helloWorldTv = findViewById(R.id.hello_world_text);
        pressMeButton = findViewById(R.id.press_me_button);
        cancelButton = findViewById(R.id.cancel_button);
        checkMeCb = findViewById(R.id.check_me_cb);
        switchButton = findViewById(R.id.switch_button);

        operand1 = findViewById(R.id.operand1);
        operand2 = findViewById(R.id.operand2);
        sumButton = findViewById(R.id.calc_button_sum);
        calendarView = findViewById(R.id.calendar_view);
        toggleButton = findViewById(R.id.toggle_button);


//        pressMeButton.setOnClickListener(view -> helloWorldTv.setText("My name is Johnny"));
//        cancelButton.setOnClickListener(view -> helloWorldTv.setText("Hello World!"));

        pressMeButton.setOnClickListener(this);
        checkMeCb.setOnClickListener(this);
        cancelButton.setOnClickListener(this);
        switchButton.setOnClickListener(this);

        sumButton.setOnClickListener(view -> sum(
                Integer.parseInt(operand1.getText().toString()),
                Integer.parseInt(operand2.getText().toString())
        ));

        toggleButton.setOnCheckedChangeListener(this);
    }

    private void sum(int op1, int op2) {
        Toast.makeText(this, "Сумма: " + (op1 + op2), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.check_me_cb:
                Toast.makeText(this, "Checkbox pressed!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.press_me_button:
                helloWorldTv.setText("My name is Johnny");
                Toast.makeText(this, "Text changed!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cancel_button:
                helloWorldTv.setText("Hello World!");
                Toast.makeText(this, "Text changed back!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.switch_button:
                calendarView.setVisibility(View.INVISIBLE);
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            Toast.makeText(this, "Включено!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Выключено!", Toast.LENGTH_SHORT).show();
        }
    }
}