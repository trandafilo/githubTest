package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //OVO JE VEZBA SABIRANJE BROJEVA UZ POJEDINACNI UNOS
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite 1. br: ");
        int firstNum = sc.nextInt();

        System.out.println("Unesite 2. br: ");
        int secNum = sc.nextInt();

        int total = firstNum+secNum;
        System.out.println("Ukupno: "+total );

    }
}

