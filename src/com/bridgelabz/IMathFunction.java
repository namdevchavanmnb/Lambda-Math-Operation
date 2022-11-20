package com.bridgelabz;
@FunctionalInterface
 interface IMathFunction {
    int calculate(int a,int b);
    static void printResult(int a,int b,String function,IMathFunction ref){
        System.out.println("Result of "+function+" is "+ref.calculate(a,b));
    }
}


class Demo{
    public static void main(String[] args) {
        IMathFunction sum=(x,y) ->(x+y);
        IMathFunction multiply=(x,y) ->(x*y);
        IMathFunction divide=(x,y) ->(x/y);

        System.out.println(sum.calculate(4,5));
        System.out.println(multiply.calculate(6,6));
        System.out.println(divide.calculate(7,7));
        IMathFunction.printResult(8,6,"Sum >",sum);
        IMathFunction.printResult(8,6,"Multiply >",multiply);
        IMathFunction.printResult(8,8,"Divide >",divide);

    }
}


