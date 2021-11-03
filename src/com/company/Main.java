package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int n, aux, inverso = 0, cifra;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero >=10: ");
            n = sc.nextInt();
        } while (n<10);
        aux = n;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }

        if (n == inverso){
            System.out.println("Es capicua: " + n);
        }else{
            System.out.println("No es capicua: " + n);
        }

    }
}
