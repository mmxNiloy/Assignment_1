package com.mmx.assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;

public class MainActivity extends AppCompatActivity {
    // Comps
    private EditText etInputA;

    private EditText etInputB;
    private TextView tvOutput;
    private Button btnAdd;
    private Button btnSub;
    private long a, b;
    private String strA, strB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ref to correct component
        etInputA = this.findViewById(R.id.et_input_a);
        etInputB = this.findViewById(R.id.et_input_b);
        btnAdd = this.findViewById(R.id.btn_add);
        btnSub = this.findViewById(R.id.btn_sub);
        tvOutput = this.findViewById(R.id.tv_result);
        
        // Reset
        etInputA.setText("");
        etInputB.setText("");

        btnAdd.setOnClickListener((v) -> {
            // Get text from the edit text
            strA = etInputA.getText().toString().trim();
            strB = etInputB.getText().toString().trim();

            // Try to convert these input to integers.
            try {
                a = Long.parseLong(strA);
                b = Long.parseLong(strB);

                tvOutput.setText(String.format("%d", a + b));
            } catch(NumberFormatException ignored) {
                Toast t = Toast.makeText(this.getApplicationContext(), "Cannot add the given numbers", Toast.LENGTH_LONG);
                t.show();
            }
        });

        btnSub.setOnClickListener((v) -> {
            // Get text from the edit text
            strA = etInputA.getText().toString().trim();
            strB = etInputB.getText().toString().trim();

            // Try to convert these input to integers.
            try {
                a = Long.parseLong(strA);
                b = Long.parseLong(strB);

                tvOutput.setText(String.format("%d", a - b));
            } catch(NumberFormatException ignored) {
                Toast t = Toast.makeText(this.getApplicationContext(), "Cannot subtract the given numbers", Toast.LENGTH_LONG);
                t.show();
            }
        });
    }
}
