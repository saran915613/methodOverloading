package org.example;

import java.util.ArrayList;
import java.util.List;

class MutableList {
    //private List<Integer> values;
    private List<String> values;
    public MutableList(List<String> values) {
        System.out.println("1st Print List values"+values);
        this.values = new ArrayList<>(values); // Copying the values to ensure encapsulation
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> newValues) {
        this.values = new ArrayList<>(newValues); // Copying the new values to ensure encapsulation
    }
}

public class Main {
    public static void main(String[] args) {
       // List<Integer> initialValues = new ArrayList<>();
        List<String> initialValues = new ArrayList<>();
        initialValues.add("1");
        initialValues.add("2");
        initialValues.add("3");

        MutableList mutableList = new MutableList(initialValues);
        System.out.println("Initial values: " + mutableList.getValues());  // Output: Initial values: [1, 2, 3]

        List<String> newValues = new ArrayList<>();
        newValues.add("4");
        newValues.add("5");

        mutableList.setValues(newValues);
        System.out.println("Updated values: " + mutableList.getValues());  // Output: Updated values: [4, 5]
    }
}