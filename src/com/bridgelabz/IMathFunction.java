package com.bridgelabz;
@FunctionalInterface
 interface IMathFunction {
    int calculate(int a,int b);
}


class Demo{
    public static void main(String[] args) {
        IMathFunction sum=(x,y) ->(x+y);
        IMathFunction multiply=(x,y) ->(x*y);
        IMathFunction divide=(x,y) ->(x/y);

    }
}


