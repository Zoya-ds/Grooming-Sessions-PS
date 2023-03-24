package com.example.secondSetOfQuestions.strings;

//non-synchronized
public class strBuilder {

    public static void main(String[] args) {

        String st = "Publicis";
        System.out.println("Original: " + st);

        st.concat(" Sapient");
        System.out.println("Changed: " + st); // Immutable

        StringBuilder str1 = new StringBuilder();

        display(str1);

        str1.append("abc");
        display(str1);

        display(str1.append("abcdefghijklmno")); // increased capacity

        StringBuilder str2 = new StringBuilder("abcdefghi");
        display(str2); // capacity= length + 16

        StringBuilder str3 = new StringBuilder(10);
        display(str3);

        display(str3.append("abcdef")); // length<10

        display(str3.append("abcdefghijkl")); // length >10

        // int n = 9;
        // String st = String.valueOf(n);
        str3.append(5); // can also add integers directly

        // String a = "abcd";
        // a = a.substring(0, 2) + "z" + a.substring(2);

        display(str3.insert(3, 'z'));
        display(str3.reverse());

    }

    static void display(StringBuilder s) {
        System.out.println("String:" + s);
        System.out.println("Length: " + s.length());
        System.out.println("Capacity: " + s.capacity());
        System.out.println("------------------");

    }

}
