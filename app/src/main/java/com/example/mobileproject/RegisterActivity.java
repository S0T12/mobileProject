package com.example.mobileproject;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class RegisterActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private EditText phoneEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameEditText = findViewById(R.id.edittext_register_name);
        emailEditText = findViewById(R.id.edittext_register_email);
        passwordEditText = findViewById(R.id.edittext_register_password);
        phoneEditText = findViewById(R.id.edittext_register_phone);

        // Resize and set the drawable for the name EditText
        Drawable nameIcon = ContextCompat.getDrawable(this, R.drawable.ic_name);
        if (nameIcon != null) {
            // Set desired width and height in pixels (hardcoded value, e.g., 48px)
            int iconSize = 48;
            nameIcon.setBounds(0, 0, iconSize, iconSize);
            nameEditText.setCompoundDrawables(nameIcon, null, null, null);
        }

        findViewById(R.id.button_register_submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String phone = phoneEditText.getText().toString();

                if (name.isEmpty() || email.isEmpty() || password.isEmpty() || phone.isEmpty()) {
                    Toast.makeText(RegisterActivity.this, "لطفاً تمام اطلاعات را وارد کنید", Toast.LENGTH_SHORT).show();
                } else {
                    // Register user (this is just a mockup)
                    Toast.makeText(RegisterActivity.this, "حساب با موفقیت ایجاد شد", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
    }
}
