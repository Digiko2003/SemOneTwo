package lISTA;

public class Recursion {
    public static void main(String[] args) {
        for(int i=0; i<=6;i++) {
            System.out.println(i+"!:" + factorial(i));
        }

    }

    public static int factorial(int n) {
        System.out.println("n:" + n);
        if (n == 1 || n == 0) {
            return 1;

        }
        System.out.println(n+"*factorial(" + (n-1) + ")");
        return n * factorial(n - 1);

    }
}