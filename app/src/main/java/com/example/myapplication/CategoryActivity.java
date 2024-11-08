package com.example.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        ArrayAdapter<Category> listAdapter = new ArrayAdapter<Category>(this,
                android.R.layout.simple_list_item_1,
                Category.category);

        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent,
                                    View view,
                                    int position,
                                    long id) {
                Intent intent = new Intent(CategoryActivity.this,
                        CategoryDetails.class);
                intent.putExtra("category_id", (int)id);
                startActivity(intent);

            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}
