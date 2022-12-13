package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
    }

    public int getPrice(){
        if(isVeg==true){
            this.price=300;
        }else {
            this.price=400;
        }

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isVeg==true) {
            price = price + 80;
        }
        else{
            price=price+120;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        price=price+70;
    }

    public void addTakeaway(){
        // your code goes here
        price=price+20;
    }

    public String getBill(){
        // your code goes here
      int  bill=price;
        return this.bill;
    }
}
