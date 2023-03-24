package com.example.secondSetOfQuestions.immutablity;

import java.util.ArrayList;

public final class immutableClass {

    private final String firstName;
    private final String secondName;
    private final ArrayList<Integer> arrayList;

    public immutableClass(String firstName, String secondName, ArrayList<Integer> arrayList) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.arrayList = arrayList;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public ArrayList<Integer> getArrayList() {

        ArrayList<Integer> temp = new ArrayList<>();
        for (Integer i : arrayList) {
            temp.add(i);
        }
        return temp; // returning a copy

        // return arrayList; //returning the instance variable
    }
}
