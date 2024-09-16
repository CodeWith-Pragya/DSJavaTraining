package oops;

public class MyInheritance extends Calc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(4, 2));
        System.out.println(calc.subtract(4, 2));
        System.out.println(calc.multiply(4, 2));
        System.out.println(calc.divide(4, 2));
    }
}
class Calc{
    int add (int a, int b){
        return a+b;
    }
    int subtract (int a, int b){
        return a-b;
    }
    int multiply (int a, int b){
        return a*b;
    }
    int divide (int a, int b){
        return a/b;
    }
}

