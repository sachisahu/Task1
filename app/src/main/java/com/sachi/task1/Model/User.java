package com.sachi.task1.Model;

public class User implements IUser{
    private int weight,height;

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
    public float calc() {
        float sum = (float) (weight/(Math.pow(height,2)));
        return sum;
    }
}
