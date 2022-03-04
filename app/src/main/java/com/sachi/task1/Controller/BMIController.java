package com.sachi.task1.Controller;

import com.sachi.task1.Model.User;
import com.sachi.task1.View.IBMIView;

public class BMIController implements IBMIController{

    IBMIView ibmiView;

    public BMIController(IBMIView ibmiView) {
        this.ibmiView = ibmiView;
    }

    @Override
    public void calcData(int weight, int height) {
        User user = new User(height,weight);
        float calc = user.calc();

        ibmiView.calcBmi(calc);
    }
}
