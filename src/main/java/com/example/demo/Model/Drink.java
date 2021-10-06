package com.example.demo.Model;



public class Drink {

    private String drinkName;
    private float drinkPrice;

    public Drink() {

    }


    public Drink(String drinkName, float drinkPrice) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public float getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(float drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "drinkName='" + drinkName + '\'' +
                ", drinkPrice=" + drinkPrice +
                '}';
    }
}
