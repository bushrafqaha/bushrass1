package com.example.myapplication;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class TestActivity extends AppCompatActivity {

    private Spinner spinnerTopics;
    private RadioGroup radioGroupOptions;
    private Button btnSubmit;
    private EditText editTextField1, editTextField2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);

        spinnerTopics = findViewById(R.id.spinner);
        radioGroupOptions = findViewById(R.id.radio);
        btnSubmit = findViewById(R.id.btnSubmit);
        editTextField2 = findViewById(R.id.edit1);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSubmission();
            }
        });
    }

    private void handleSubmission() {
        String selectedTopic = spinnerTopics.getSelectedItem().toString();
        int selectedOptionId = radioGroupOptions.getCheckedRadioButtonId();
        String userAnswer = editTextField1.getText().toString();
        String additionalComment = editTextField2.getText().toString();

        if (selectedOptionId == -1) {
            Toast.makeText(this, "Please select an answer!", Toast.LENGTH_SHORT).show();
        } else
        {
            RadioButton selectedOption = findViewById(selectedOptionId);
            String answer = selectedOption.getText().toString();
            String resultMessage = "Topic: " + selectedTopic + "\nYour Answer: " + answer +
                    "\nUser Answer: " + userAnswer + "\nAdditional Comment: " + additionalComment;
            Toast.makeText(this, resultMessage, Toast.LENGTH_LONG).show();
        }
    }
}