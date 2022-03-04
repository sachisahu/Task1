package com.sachi.task1.fragements;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sachi.task1.Controller.BMIController;
import com.sachi.task1.Controller.IBMIController;
import com.sachi.task1.R;
import com.sachi.task1.View.IBMIView;

public class BMIFragment extends Fragment implements IBMIView {


    EditText height,weight;
    Button calcBtn;
    IBMIController ibmiController;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ibmiController = new BMIController(this);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b_m_i, container, false);
        height = view.findViewById(R.id.txtHeight);
        weight = view.findViewById(R.id.txtWeight);
        calcBtn = view.findViewById(R.id.btnSubmit);

        calcBtn.setOnClickListener(view1 -> {
            int heig = Integer.parseInt(height.getText().toString());
            int weg = Integer.parseInt(weight.getText().toString());
            ibmiController.calcData(heig,weg);
        });

        return view;
    }



    @Override
    public void calcBmi(float bmi) {
            calcBtn.setText(bmi+"");
            Toast.makeText(getActivity(), bmi+"", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void validData(String validData) {
        Toast.makeText(getActivity(), validData+"", Toast.LENGTH_SHORT).show();

    }
}