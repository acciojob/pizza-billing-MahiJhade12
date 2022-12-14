package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    
    private int toppingsPrice;
    private int cheesePrice;
    private int takeawayPrice;
     boolean extraChessAdded=false;
    boolean ExtraToppingAdded=false;
      boolean takeAwayAdded=false;
     boolean billGenerated=false;

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
        this.ExtraToppingAdded=false;
        this.takeAwayAdded=false;
        this.billGenerated=false;
        this.bill="Base Price Of The Pizza: "+this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(extraChessAdded==false){
            this.price=this.price+this.cheesePrice;
            this.extraChessAdded=true;
        }
        
    }

    public void addExtraToppings(){
        // your code goes here
       if(ExtraToppingAdded==false){

           this.price=this.price+this.toppingsPrice;
           this.ExtraToppingAdded=true;
       }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAwayAdded==false){
            this.price=this.price+takeawayPrice;
            this.takeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
      if(billGenerated==false){
          if(extraChessAdded==true){
              this.bill= this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
          }
          if(ExtraToppingAdded==true){
              this.bill= this.bill+"Extra Toppings Added: "+this.toppingsPrice+"\n";
          }
          if(takeAwayAdded==true){
              this.bill= this.bill+"Paperbag Added: "+this.takeawayPrice+"\n";
          }
          this.bill=this.bill+"Total Price: "+this.price+"\n";
          this.billGenerated=true;
      }
        return this.bill;
    }
}
