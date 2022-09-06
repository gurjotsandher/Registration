package org.meicode.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        EditText firstName = findViewById(R.id.firstName);
        txtFirstName.setText("First Name: " + firstName.getText().toString());

        TextView txtLastName = findViewById(R.id.txtLastName);
        EditText lastName = findViewById(R.id.lastName);
        txtLastName.setText("Last Name: " + lastName.getText().toString());

        TextView txtEmail = findViewById(R.id.txtEmail);
        EditText email = findViewById(R.id.email);
        txtEmail.setText("Email: " + email.getText().toString());
    }
}