package java8sample;

import java.util.function.IntBinaryOperator;

@FunctionalInterface
interface MyFunctionalInterface {

    public int addMethod(int a, int b);
}
public class BeginnersBookClass {

   public static void main(String args[]) {
        // lambda expression
    	MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: "+sum.addMethod(12, 100));
        System.out.println("Result: "+sum.addMethod(124, 100));
        
        IntBinaryOperator sume = (a, b) -> a + b;
        System.out.println("Result2: " + sume.applyAsInt(12, 100));

    }
}