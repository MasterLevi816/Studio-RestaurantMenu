package org.example.restaurant;

import java.util.ArrayList;
public class MenuItem {
// all private= put name, description, category, price, is new

    private String category;
    private String name;
    private String description;
    private Double price;
    private Boolean NewItem;

    //constructor:
    public MenuItem(String category, String name, String description, Double price, Boolean newItem) {
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
        this.NewItem = newItem;
    }

    //setters:
    public void setNewItem(Boolean newItem) {
        NewItem = newItem;
    }
    public void setPrice (Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}

//MenuItem ("food", "pizza", "cheesy goodness", 50, true);



