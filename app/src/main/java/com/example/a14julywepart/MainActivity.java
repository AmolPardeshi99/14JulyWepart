package com.example.a14julywepart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private  RecyclerView recyclerView;
    private  EditText mETOption,mEtSendMessage;
    private  ImageView mIvSend;
    private  ArrayList <BaseModel> modelArrayList = new ArrayList<>();
    private ChatAdapter chatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setRecyclerView();


    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        chatAdapter = new ChatAdapter(modelArrayList);
        recyclerView.setAdapter(chatAdapter);

    }

    private void buildList() {
        //Integer.parseInt(mETOption.getText().toString());
        if(mETOption.getText().toString().equals("1")){
            modelArrayList.add(new SenderModel(mEtSendMessage.getText().toString()));
        }else if(mETOption.getText().toString().equals("0")){
            modelArrayList.add(new ReceiverModel(mEtSendMessage.getText().toString()));
        }
        chatAdapter.notifyDataSetChanged();
    }

    private void initViews() {
        mETOption = findViewById(R.id.etChoice);
        mEtSendMessage = findViewById(R.id.etSendMessage);
        recyclerView = findViewById(R.id.recyclerView);
        mIvSend = findViewById(R.id.ivSend);
        mIvSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildList();
            }
        });
    }
}