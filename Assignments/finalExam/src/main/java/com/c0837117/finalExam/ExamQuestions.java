package com.c0837117.finalExam;

public class ExamQuestions {
	
	//ref: https://www.geeksforgeeks.org/recursive-program-prime-number/
	public static boolean isPrime(int n, int i){
        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        return isPrime(n, i + 1);
    }
	
	
	//ref: https://www.geeksforgeeks.org/print-given-pattern-recursively/
	static void printPatternRowRecur(int n)
    {
        if (n < 1)
            return;
        System.out.print( "* ");
        printPatternRowRecur(n - 1);
    }
     
    static void printPatternRecur(int n)
    {
        if (n < 1)
            return;
        printPatternRowRecur(n);
        System.out.println ();
        printPatternRecur(n - 1);
    }
}
