package com.example.a14julywepart;

public class SenderModel extends BaseModel{
    private final String sendermessage;

    public SenderModel(String sendermessage) {
        this.sendermessage = sendermessage;
    }

    public String getSendermessage() {
        return sendermessage;
    }

    @Override
    int getViewType() {
        return 0;
    }
}
