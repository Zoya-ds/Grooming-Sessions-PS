package com.example.secondSetOfQuestions.immutablity;

import java.util.ArrayList;

public class immutableClassImpl {

    public static void main(String[] args) {

        // immutableClass immutableClass1= new immutableClass(); //errors because no
        // parameters are given

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);

        immutableClass immutableClass2 = new immutableClass("Zoya", "Shams", arrayList1);

        System.out.println(immutableClass2.getFirstName());
        System.out.println(immutableClass2.getSecondName());
        System.out.println(immutableClass2.getArrayList());

        // immutableClass2.firstName="Publicis"; //private
        // immutableClass2.setFirstName(); //not defined because it is declared as final

        immutableClass2.getArrayList().add(6);
        System.out.println(immutableClass2.getArrayList()); // unchanged

    }
}
