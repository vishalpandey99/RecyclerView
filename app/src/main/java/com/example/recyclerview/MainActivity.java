package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclercontact;
ArrayList<ContactModel> arrContacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclercontact = findViewById(R.id.recyclercontact);

        recyclercontact.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.girl,"A","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"B","84165566321"));
        arrContacts.add(new ContactModel(R.drawable.girl,"C","85212365466"));
        arrContacts.add(new ContactModel(R.drawable.girl,"D","95432112333"));
        arrContacts.add(new ContactModel(R.drawable.girl,"E","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"F","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"G","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"H","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"I","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"J","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"K","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"L","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"M","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"N","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"O","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"P","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"Q","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"R","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"S","9519280154"));
        arrContacts.add(new ContactModel(R.drawable.girl,"T","9519280154"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclercontact.setAdapter(adapter);

    }
}