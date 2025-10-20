package org.example;
import java.util.ArrayList;

public class TriangularNumberCalculator {

    public int value(int num) {
        if (num == 0) {
            return num;
        } else {
            return num + value(num - 1);
        }
    }

    public int add(int num1, int num2) {
        return value(num1) + value(num2);
    }

    public int subtract(int num1, int num2) {
        return value(num1) - value(num2);
    }

    public int multiply(int num1, int num2) {
        return value(num1) * value(num2);
    }

    public int divide(int num1, int num2) {
        return value(num1) / value(num2);
    }

    public ArrayList<Integer> sequence(int num) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i < num + 1; i++) {
            nums.add(i);
        }
        return nums;
    }
}
