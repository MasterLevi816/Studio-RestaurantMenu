package org.example.restaurant;

import java.util.Date;
import java.util.ArrayList;

public class Menu {
// put array list and date last updated

    private ArrayList <MenuItem> items;
    private Date dateUpdated;

//constructor here:
    public Menu(ArrayList<MenuItem> items, Date dateUpdated) {
        this.items = items;
        this.dateUpdated = dateUpdated;
    }

// setters:
    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    // getters:
    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public Date getDateUpdated() {
        return dateUpdated;
    }

}






















    /*
    private HashMap<Integer, MenuItem> items;

    public Menu(HashMap<Integer, MenuItem> items) {
        this.items = items;
    }
    public void printMenu() {
        // method to print
        System.out.println(Menu);
        System.out.println(MenuItem);
    }
     */

