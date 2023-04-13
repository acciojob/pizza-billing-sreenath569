package com.driver;


public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";

    public Boolean isExtraCheeseAdded = false;
    public Boolean isExtraToppingsAdded = false;
    public Boolean isPaperBagRequired = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
        }
        else{
            this.price = 400;
        }
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!this.isExtraCheeseAdded){
            this.isExtraCheeseAdded = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!this.isExtraToppingsAdded){
            this.isExtraToppingsAdded = true;
            if(this.isVeg){
                this.price += 70;
            }
            else{
                this.price += 120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!this.isPaperBagRequired){
            this.isPaperBagRequired = true;
            this.price += 20;
        }
    }

    public String getBill(){
        // your code goes here

        if(isVeg) {
            this.bill = "Base Price Of The Pizza: 300";
        }
        else {
            this.bill = "Base Price Of The Pizza: 400";
        }

        if(this.isExtraCheeseAdded) {
            this.bill += "\n"+"Extra Cheese Added: 80";
        }

        if(this.isExtraToppingsAdded) {
            if(this.isVeg) {
                this.bill += "\n"+"Extra Toppings Added: 70";
            }
            else {
                this.bill += "\n"+"Extra Toppings Added: 120";
            }
        }

        if(this.isPaperBagRequired) {
            this.bill += "\n"+"Paperbag Added: 20";
        }

        this.bill += "\n"+"Total Price: "+this.price+"\n";

        return this.bill;
    }
}
