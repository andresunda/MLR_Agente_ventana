//
//
//
//

package com.company;

public class DataSet {
    public int n = 17;
    public int i;
    public double[] X1 = new double[]{41.9D, 43.4D, 43.9D, 44.5D, 47.3D, 47.5D, 47.9D, 50.2D, 52.8D, 53.2D, 56.7D, 57.0D, 63.5D, 65.3D, 71.1D, 77.0D, 77.8D};
    public double[] X2 = new double[]{29.1D, 29.3D, 29.5D, 29.7D, 29.9D, 30.3D, 30.5D, 30.7D, 30.8D, 30.9D, 31.5D, 31.7D, 31.9D, 32.0D, 32.1D, 32.5D, 32.9D};
    public double[] Y = new double[]{251.3D, 251.3D, 248.3D, 267.5D, 273.0D, 276.5D, 270.3D, 274.9D, 285.0D, 290.0D, 297.0D, 302.5D, 304.5D, 309.3D, 321.7D, 330.7D, 349.0D};

    public DataSet() {
    }

    public void Datos() {
        for(this.i = 0; this.i < this.n; ++this.i) {
            System.out.printf("\t %d\t %.2f \t %.2f\t %.2f \n", this.i + 1, this.X1[this.i], this.X2[this.i], this.Y[this.i]);
        }

    }
}
