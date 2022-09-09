import java.util.Scanner;

class factorial {
    int fact(int num){
        if(num == 0){
            return 1;
        }
        else {
            return(num*fact(--num));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        int num = sc.nextInt();
        factorial ob = new factorial();
        System.out.println(ob.fact(num));
    }
}