package com.example.calculatorlab1_kcook;

import android.util.Log;

import java.util.ArrayList;

public class CalculatorBrain {
    ArrayList<String> calcArray = new ArrayList<>();

//    private String operator;
    private Double finalResult;
    private Double getResult;

    void pushToArray(String val) {
        calcArray.add(val);
    }

    void clearArray(){
        calcArray.clear();
        Log.d("my calcArray", "Cal" + calcArray.toString() + "");
    }

    
    double calculate() {


        while (calcArray.size() >= 3) {
            double firstNum = (Double.parseDouble(calcArray.get(0)));
            double secondNum = (Double.parseDouble(calcArray.get(2)));
            String operator = calcArray.get(1);
            finalResult = getResult(firstNum, secondNum, operator);
            calcArray.remove(0);
            calcArray.remove(0);
            calcArray.remove(0);
            calcArray.add(0, (Double.toString(finalResult)));

        }

        return finalResult;
    }


    double getResult ( double firstNum, double secondNum, String operator){
        switch (operator) {
            case "+":
                return firstNum + secondNum;
            case "-":
                return firstNum - secondNum;
            case "*":
                return firstNum * secondNum;
            case "/":
                return firstNum / secondNum;
            default:
                Log.d("my calc deg", "wrong input");
                return 0;
        }

        //I want to take the answer from calculate and put that in position 0 in the calcArray then go through the array again until only one thing is left inside

    }

//    void printarray () {
//        Log.d("my array is", "Cal" + calcArray.toString() + "");
//    }

}
