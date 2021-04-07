package com.company;

public class QuadraticEquation {

    private double a; //a can never be zero
    private double b = 0.0;
    private double c = 0.0;

    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation(double a,double b){
        this.a = a;
        this.b = b;
    }

    public QuadraticEquation(double a){
        this.a = a;
    }

    private class Discriminant{

        private double d;

        private void calculatethed(double a, double b, double c){
            this.d = b*b - 4*a*c;
        }

    }

    public String findroots(){

        Discriminant disc = new Discriminant();
        disc.calculatethed(this.a,this.b,this.c);

        if (disc.d<0.0){
            return "No roots found";
        }
        else if (disc.d==0.0){
            double x = -this.b/2*this.a;
            return "One root found: "+x;
        }
        else {
            double x1 = (-this.b+Math.pow(disc.d, 0.5))/2*this.a;
            double x2 = (-this.b-Math.pow(disc.d, 0.5))/2*this.a;
            return "Two roots found: "+x1+", "+x2;
        }
    }

}
