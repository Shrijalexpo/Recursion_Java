/**
 * Find HCF of two numbers using Recursive Technique
 */

import java.util.Scanner;

class RecursiveHCF {
    // a small b large
    public static void main(String[] args) {
        RecursiveHCF ob = new RecursiveHCF();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number small: ");
        int a = sc.nextInt();
        System.out.println("Enter second number large: ");
        int b = sc.nextInt();
        System.out.println("HCF of: "+a+ " & "+ b+ " is "+ob.GCD(a,b));
    }
    public int GCD(int a, int b){
        if(a == 0){
            return b;
        }
        else{
            return GCD((b % a),a);
        }
    }
}