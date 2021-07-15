package com.example.a14julywepart;

public class ReceiverModel extends BaseModel{

    private String receivermessage;

    public ReceiverModel(String receivermessage) {
        this.receivermessage = receivermessage;
    }

    public String getReceivermessage() {
        return receivermessage;
    }

    @Override
    int getViewType() {
        return 1;
    }
}
