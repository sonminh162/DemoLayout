package com.lifetime.title;

import android.content.Intent;

public class Item {
    private String name;
    private String description;
    private Intent intent;

    public Item(String name, String description, Intent intent) {
        this.name = name;
        this.description = description;
        this.intent = intent;
    }

    public Intent getIntent() {
        return intent;
    }

    public void setIntent(Intent intent) {
        this.intent = intent;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item(String name) {
        this.name = name;
    }
}
