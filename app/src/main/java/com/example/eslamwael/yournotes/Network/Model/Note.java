package com.example.eslamwael.yournotes.Network.Model;

/**
 * Created by eslamwael74 on 6/27/2018.
 * Email: eslamwael74@outlook.com.
 */
public class Note extends BaseResponse {
    int id;
    String note;
    String timestamp;

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
