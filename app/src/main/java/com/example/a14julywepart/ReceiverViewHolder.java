package com.example.a14julywepart;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ReceiverViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvReceiverSendMessage;
    public ReceiverViewHolder(@NonNull  View itemView) {
        super(itemView);
        initView(itemView);

    }

    private void initView(View itemView) {
        mTvReceiverSendMessage = itemView.findViewById(R.id.tvReceiverMessage);
    }

    public void setData(ReceiverModel receiverModel){
        mTvReceiverSendMessage.setText(receiverModel.getReceivermessage());

    }
}
