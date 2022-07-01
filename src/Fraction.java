package com.android.controls.prac;

public class Fraction {

    private int real,imaginary;

    public Fraction(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public long gcm(long a, long b) {
        return b == 0 ? a : gcm(b, a % b);
    }
    public String toString() {
        long gcm = gcm(real, imaginary);
        return real/gcm+"/"+imaginary/gcm;
    }
}
