package com.example.a14julywepart;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SenderViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvSenderMessage;

    public SenderViewHolder(@NonNull  View itemView) {
        super(itemView);
        initVIews(itemView);
    }

    private void initVIews(View itemView) {
        mTvSenderMessage = itemView.findViewById(R.id.tvSenderMessage);
    }
    public void setData(SenderModel senderModel){
        mTvSenderMessage.setText(senderModel.getSendermessage());


    }
}
