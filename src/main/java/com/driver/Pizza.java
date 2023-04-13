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
        this.isExtraCheeseAdded=true;
    }

    public void addExtraToppings(){
        // your code goes here
        this.isExtraToppingsAdded = true;
    }

    public void addTakeaway(){
        // your code goes here
        this.isPaperBagRequired = true;
    }

    public String getBill(){
        // your code goes here

        if(isVeg){
            bill += "Base Price Of The Pizza: 300\n";
            if(this.isExtraCheeseAdded){
                bill += "Extra Cheese Added: 80\n";
                this.price += 80;
            }
            if(this.isExtraToppingsAdded){
                bill += "Extra Toppings Added: 70\n";
                this.price += 70;
            }
            if(this.isPaperBagRequired){
                bill += "Paperbag Added: 20\n";
                this.price += 20;
            }
            bill += "Total Price: "+this.price;
        }
        else{
            bill += "Base Price Of The Pizza: 400\n";
            if(this.isExtraCheeseAdded){
                bill += "Extra Cheese Added: 80\n";
                this.price += 80;
            }
            if(this.isExtraToppingsAdded){
                bill += "Extra Toppings Added: 120\n";
                this.price += 120;
            }
            if(this.isPaperBagRequired){
                bill += "Paperbag Added: 20\n";
                this.price += 20;
            }
            bill += "Total Price: "+this.price+"\n";
        }
        return this.bill;
    }
}
