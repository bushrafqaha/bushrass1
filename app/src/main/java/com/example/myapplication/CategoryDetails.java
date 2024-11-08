package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryDetails extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_category);
        Intent intent = getIntent();
        int id = intent.getIntExtra("category_id", -1);
        if (id >= 0 && id < Category.category.length) {
            Category category = Category.category[id];
            ImageView image = findViewById(R.id.brain_image);
            image.setImageResource(category.getImageID());
            TextView txtName = findViewById(R.id.txtName);
            TextView txtDesc = findViewById(R.id.txtDesc);
            txtName.setText(category.getName());
            txtDesc.setText(category.getDescription());
        } else {

            finish();
        }
    }
}
