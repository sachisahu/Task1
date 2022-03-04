package com.sachi.task1.Model;

public class User implements IUser{
    private int weight,height;
    private String validData;

    public User(String validData) {
        this.validData = validData;
    }

    public User(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public String datachk() {
        if(weight<=0 && height<=0) {
            validData = "Not A valid Data";
        }
        return validData;
    }

    @Override
    public float calc() {
        float sum = 0;
        if(weight>0 && height>0){
            sum = (float) (weight/(Math.pow(height,2)));
        }
        return sum;
    }
}
