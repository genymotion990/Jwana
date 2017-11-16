package com.example.hp1.project;

/**
 * Created by Hp1 on 07/11/2017.
 */

public class Photo {
    private String describtion;
    private String filePath;
    private int id;

    public Photo(String describtion, String filePath) {
        this.describtion = describtion;
        this.filePath = filePath;
        this.id = -1;

    }
    public Photo(String describtion, int id) {
        this.describtion = describtion;
        this.id = id;
        this.filePath=null;
    }

    public String getDescribtion() {
        return describtion;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public int getId() {
        return id;
    }
}
