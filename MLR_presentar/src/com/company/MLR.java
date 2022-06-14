//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

import java.io.PrintStream;

public class MLR extends Sumatorias {
    Sumatorias s = new Sumatorias();
    public int Beta0;
    public int Beta1;
    public int Beta2;
    public int Resultado;
    public int Yhat;
    public int DetSistem;

    public MLR() {
    }

    public void setDetSistem(int DetSistem) {
        this.DetSistem = DetSistem;
    }

    double getDetSistem() {
        return this.DS();
    }

    public void setBeta0(int Beta0) {
        this.Beta0 = Beta0;
    }

    double getBeta0() {
        return this.s.DB0() / this.s.DS();
    }

    public void setBeta1(int Beta1) {
        this.Beta1 = Beta1;
    }

    double getBeta1() {
        return this.DB1() / this.DS();
    }

    public void setBeta2(int Beta2) {
        this.Beta2 = Beta2;
    }

    double getBeta2() {
        return this.DB2() / this.DS();
    }

    public void setYhat(int Yhat) {
        this.Yhat = Yhat;
    }

    double getYhat(double x1, double x2) {
        PrintStream var10000 = System.out;
        double var10001 = this.getBeta0();
        var10000.println("Beta0: " + var10001 + "\nBeta1: " + this.getBeta1() + "\nBeta2: " + this.getBeta2());
        return this.getBeta0() + this.getBeta1() * x1 + this.getBeta2() * x2;
    }
}
