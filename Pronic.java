/**
 * Design a class Pronic to check if a given number is a pronic number or not. [ A number is
 * said to be pronic if the product of two consecutive numbers is equal to the number]
 * Example: 0 = 0 × 1
 *          2=1×2
 *          6=2×3
 *          12 = 3 × 4
 * thus, 0, 2, 6, 12... are pronic numbers.
 *
 * Some of the members of the class are given below:
 * Class name               : Pronic
 * Data members/instance variables:
 * num                       :to store a positive integer number
 *
 * Methods / Member functions:
 * Pronic( )                :default constructor to initialize the data member with legal initial value
 * void acceptnum( ):       :to accept a positive integer number
 * boolean ispronic(int v)  :returns true if the number ‘num’ is a pronic number, otherwise returns false using
 *                           recursive technique
 * void check( )             :checks whether the given number is a pronic
 *                            number by invoking the function ispronic()
 *                            and displays the result with an appropriate message
 *
 * Specify the class Pronic giving details of the constructor( ), void acceptnum( ),
 * boolean ispronic(int) and void check( ). Define a main( ) function to create an object and
 * call the functions accordingly to enable the task.
 * ------------------------------------------------------------------------------------------
 */

import java.util.Scanner;

class Pronic{
    int num;
    Pronic(){
        num = 0;
    }
    void acceptnum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        num = sc.nextInt();
    }
    void check(){
        if(ispronic(num)){
            System.out.println(num+ " is a pronic number");
        }
        else {
            System.out.println(num+ " is not a pronic number");
        }
    }
    boolean ispronic(int v){
        if(v * (v-1) == num){
            System.out.println(v +" * "+(v-1));
            return true;
        }
        else if (v==0) {
            return false;
        }
        else {
            return (ispronic(v-1));
        }
    }

    public static void main(String[] args) {
        Pronic ob = new Pronic();
        ob.acceptnum();
        ob.check();
    }
}
