package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    
    private int toppingsPrice;
    private int cheesePrice;
    private int takeawayPrice;
    public boolean extraChessAdded=false;
    public boolean isExtraToppingAdded=false;
    public  boolean takeAwayAdded=false;
    public boolean billGenerated=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.takeawayPrice=20;
        // your code goes here
        if(isVeg==true){
            this.price=300;
            this.toppingsPrice=70;
        }else {
            this.price=400;
            this.toppingsPrice=120;
        }
        this.extraChessAdded=false;
        this.isExtraToppingAdded=false;
        this.takeAwayAdded=false;
        this.billGenerated=false;
        this.bill="Veg pizza base price: "+this.price +"/n";
    }

    public int getPrice(){
        


        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraChessAdded==false){
            this.price+=this.cheesePrice;
            extraChessAdded=true;
        }
        
    }

    public void addExtraToppings(){
        // your code goes here
       if(isExtraToppingAdded==false){
           this.price+=this.toppingsPrice;
           extraChessAdded=true;
       }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAwayAdded==false){
            this.price+=takeawayPrice;
            takeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
      if(billGenerated==false){
          if(extraChessAdded==true){
              this.bill+="Extra Cheese Added: "+this.cheesePrice+"/n";
          }
          if(isExtraToppingAdded==true){
              this.bill+="Extra Toppings Added: "+this.toppingsPrice+"/n";
          }
          if(takeAwayAdded==true){
              this.bill+="Paperbag Added: "+this.takeawayPrice+"/n";
          }
          this.bill+="Total Price: "+this.price;
          billGenerated=true;
      }
        return this.bill;
    }
}
