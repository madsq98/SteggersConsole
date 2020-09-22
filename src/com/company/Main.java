package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Scanner data = new Scanner(System.in);
        Scanner filter = new Scanner(System.in);

        System.out.println("Data: ");
        String d = data.nextLine();

        System.out.println("Filter: ");
        String f = filter.nextLine();

        System.out.println(StringUtils.exc10(d,f));
        */


        Scanner in = new Scanner(System.in);
        System.out.println("Input:");

        String s = in.nextLine();
        System.out.println("Opgave 1: " + StringUtils.exc1(s));
        System.out.println("Opgave 2: " + StringUtils.exc2(s));
        System.out.println("Opgave 3: " + StringUtils.exc3(s));
        System.out.println("Opgave 4: " + StringUtils.exc4(s));
        System.out.println("Opgave 5: " + StringUtils.exc5(s));
        System.out.println("Opgave 6: " + StringUtils.exc6(s));
        System.out.println("Opgave 7: " + StringUtils.exc7(s));
        System.out.println("Opgave 8: " + StringUtils.exc8(s));
        System.out.println("Opgave 9: " + StringUtils.exc9(s));
        System.out.println("Opgave 11: " + StringUtils.exc11(s));
    }
}
