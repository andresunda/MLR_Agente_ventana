//
// 
//
//

package com.company;

public class Sumatorias extends DataSet {
    double OpDs = 0.0D;
    double OpB0 = 0.0D;
    double OpB1 = 0.0D;
    double OpB2 = 0.0D;
    double SumX1 = 0.0D;
    double SumX2 = 0.0D;
    double SumY = 0.0D;
    double SumX1Cuad = 0.0D;
    double SumX2Cuad = 0.0D;
    double SumX1X2 = 0.0D;
    double SumX1Y = 0.0D;
    double SumX2Y = 0.0D;

    public Sumatorias() {
    }

    double SumatoriaX1() {
        this.SumX1 = 0.0D;

        for(this.i = 0; this.i < this.n; ++this.i) {
            this.SumX1 += this.X1[this.i];
        }

        return this.SumX1;
    }

    double SumatoriaX2() {
        this.SumX2 = 0.0D;

        for(this.i = 0; this.i < this.n; ++this.i) {
            this.SumX2 += this.X2[this.i];
        }

        return this.SumX2;
    }

    double SumatoriaY() {
        this.SumY = 0.0D;

        for(this.i = 0; this.i < this.n; ++this.i) {
            this.SumY += this.Y[this.i];
        }

        return this.SumY;
    }

    double SumatoriaX1Cuad() {
        this.SumX1Cuad = 0.0D;

        for(this.i = 0; this.i < this.n; ++this.i) {
            this.SumX1Cuad += this.X1[this.i] * this.X1[this.i];
        }

        return this.SumX1Cuad;
    }

    double SumatoriaX2Cuad() {
        this.SumX2Cuad = 0.0D;

        for(this.i = 0; this.i < this.n; ++this.i) {
            this.SumX2Cuad += this.X2[this.i] * this.X2[this.i];
        }

        return this.SumX2Cuad;
    }

    double SumatoriaX1X2Cuad() {
        this.SumX1X2 = 0.0D;

        for(this.i = 0; this.i < this.n; ++this.i) {
            this.SumX1X2 += this.X1[this.i] * this.X2[this.i];
        }

        return this.SumX1X2;
    }

    double SumatoriaX1Y() {
        this.SumX1Y = 0.0D;

        for(this.i = 0; this.i < this.n; ++this.i) {
            this.SumX1Y += this.X1[this.i] * this.Y[this.i];
        }

        return this.SumX1Y;
    }

    double SumatoriaX2Y() {
        this.SumX2Y = 0.0D;

        for(this.i = 0; this.i < this.n; ++this.i) {
            this.SumX2Y += this.X2[this.i] * this.Y[this.i];
        }

        return this.SumX2Y;
    }

    public double DS() {
        double OpDs = 0.0D;
        double Multiplicacion1 = (double)this.n * this.SumatoriaX1Cuad() * this.SumatoriaX2Cuad();
        double Multiplicacion2 = this.SumatoriaX1() * this.SumatoriaX1X2Cuad() * this.SumatoriaX2();
        double Multiplicacion3 = this.SumatoriaX2() * this.SumatoriaX1() * this.SumatoriaX1X2Cuad();
        double Multiplicacion4 = this.SumatoriaX2() * this.SumatoriaX1Cuad() * this.SumatoriaX2();
        double Multiplicacion5 = (double)this.n * this.SumatoriaX1X2Cuad() * this.SumatoriaX1X2Cuad();
        double Multiplicacion6 = this.SumatoriaX2Cuad() * this.SumatoriaX1() * this.SumatoriaX1();
        OpDs = Multiplicacion1 + Multiplicacion2 + Multiplicacion3 - Multiplicacion4 - Multiplicacion5 - Multiplicacion6;
        return OpDs;
    }

    public double DB0() {
        double DtB0 = 0.0D;
        double Multiplicacion1 = this.SumatoriaY() * this.SumatoriaX1Cuad() * this.SumatoriaX2Cuad();
        double Multiplicacion2 = this.SumatoriaX1() * this.SumatoriaX1X2Cuad() * this.SumatoriaX2Y();
        double Multiplicacion3 = this.SumatoriaX2() * this.SumatoriaX1Y() * this.SumatoriaX1X2Cuad();
        double Multiplicacion4 = this.SumatoriaX2Y() * this.SumatoriaX1Cuad() * this.SumatoriaX2();
        double Multiplicacion5 = this.SumatoriaX1X2Cuad() * this.SumatoriaX1X2Cuad() * this.SumatoriaY();
        double Multiplicacion6 = this.SumatoriaX2Cuad() * this.SumatoriaX1Y() * this.SumatoriaX1();
        DtB0 = Multiplicacion1 + Multiplicacion2 + Multiplicacion3 - Multiplicacion4 - Multiplicacion5 - Multiplicacion6;
        return DtB0;
    }

    public double DB1() {
        double DtB1 = 0.0D;
        double Multiplicacion1 = (double)this.n * this.SumatoriaX1Y() * this.SumatoriaX2Cuad();
        double Multiplicacion2 = this.SumatoriaY() * this.SumatoriaX1X2Cuad() * this.SumatoriaX2();
        double Multiplicacion3 = this.SumatoriaX2() * this.SumatoriaX1() * this.SumatoriaX2Y();
        double Multiplicacion4 = this.SumatoriaX2() * this.SumatoriaX1Y() * this.SumatoriaX2();
        double Multiplicacion5 = this.SumatoriaX2Y() * this.SumatoriaX1X2Cuad() * (double)this.n;
        double Multiplicacion6 = this.SumatoriaX2Cuad() * this.SumatoriaX1() * this.SumatoriaY();
        DtB1 = Multiplicacion1 + Multiplicacion2 + Multiplicacion3 - Multiplicacion4 - Multiplicacion5 - Multiplicacion6;
        return DtB1;
    }

    public double DB2() {
        double DtB2 = 0.0D;
        double Multiplicacion1 = (double)this.n * this.SumatoriaX1Cuad() * this.SumatoriaX2Y();
        double Multiplicacion2 = this.SumatoriaX1() * this.SumatoriaX1Y() * this.SumatoriaX2();
        double Multiplicacion3 = this.SumatoriaY() * this.SumatoriaX1() * this.SumatoriaX1X2Cuad();
        double Multiplicacion4 = this.SumatoriaX2() * this.SumatoriaX1Cuad() * this.SumatoriaY();
        double Multiplicacion5 = this.SumatoriaX1X2Cuad() * this.SumatoriaX1Y() * (double)this.n;
        double Multiplicacion6 = this.SumatoriaX2Y() * this.SumatoriaX1() * this.SumatoriaX1();
        DtB2 = Multiplicacion1 + Multiplicacion2 + Multiplicacion3 - Multiplicacion4 - Multiplicacion5 - Multiplicacion6;
        return DtB2;
    }
}
