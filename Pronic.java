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
