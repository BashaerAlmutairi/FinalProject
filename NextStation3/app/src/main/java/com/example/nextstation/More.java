package com.example.nextstation;

public class More {
    private String itemName;
    private String itembutton;

    public More ( String itemName, String itembutton ) {
        this.itemName = itemName;
        this.itembutton = itembutton;
    }

    public String getItemName () {
        return itemName;
    }

    public void setItemName ( String itemName ) {
        this.itemName = itemName;
    }

    public String getItembutton () {
        return itembutton;
    }

    public void setItembutton ( String itembutton ) {
        this.itembutton = itembutton;
    }

    public static class HBAdapter {

    }
}