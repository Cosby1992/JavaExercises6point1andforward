package com.company;

public class Main {

// 6.1 Pentagonal numbers (public = can be called from everywhere), (static = can be created without creating a new object)
// (int = returns an integer(the method "is" an integer)), (getPentagonalNumber = name of method)
    public static int getPentagonalNumber(int n){

        int penNum = (n*((3*n)-1))/2;
        return penNum;
    }

    public static int sumDigits(long n){
        long sum = 0;

        while(true){

            if(n < 10){

                sum += n;
                break;

            }else
            {
                sum += n % 10;
                n /= 10;
            }

        }

        return (int)sum;
    }



    public static void main(String[] args) {

// 6.1 Pentagonal numbers print
        System.out.println("First  pentagonal number: "+getPentagonalNumber(1));
        System.out.println("Second pentagonal number: "+getPentagonalNumber(2));
        System.out.println("Third  pentagonal number: "+getPentagonalNumber(3));
        System.out.println("Fourth pentagonal number: "+getPentagonalNumber(4));
        System.out.println("Fifth  pentagonal number: "+getPentagonalNumber(5));

// 6.2 Sum of digits print

        System.out.println("The sum of the digits are " + sumDigits(2846));




    }
}
