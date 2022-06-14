//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int valorIngresado1 = false;
        //int valorIngresado2 = false;
        System.out.println("\nIngresa el valor:  ");
        //int valorIngresado1 = in.nextInt();
        //int valorIngresado2 = in.nextInt();
        MLR GetSet = new MLR();
        new Sumatorias();
        System.out.println("\n");
        System.out.println("Beta0 = " + GetSet.getBeta0());
        System.out.println("Beta1 = " + GetSet.getBeta1());
        System.out.println("Beta2 = " + GetSet.getBeta2());
        System.out.println("\nFormula");
        System.out.println("Yhat = B0 + B1 * x1 + B2 * X2");
    }
}
