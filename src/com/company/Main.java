package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int f, s, w, result;
        System.out.println("That's how many apples I've found today: ");
        f = num.nextInt();
        System.out.println("That's how many apples I've stolen today: ");
        s = num.nextInt();
        System.out.println("That's how many apples I've wasted today: ");
        w = num.nextInt();
        result = f + s - w;
        System.out.println("That's how many apples I have right now: " + result);
        if (result <= 0)
            System.out.println("\nOops, I'm all out of apples!");
        else
            System.out.println("\nGreat! I still have some apples left!");

    }
}
