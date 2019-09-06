import java.util.Scanner;

class soda_sodasurpler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.print("Input");
        int e= scan.nextInt() + scan.nextInt();
        //System.out.print("Input");
        int b = 0;
        //System.out.print("Input");
        int req = scan.nextInt();
        int total = 0;
        while(e>=req) {
            b = e%req;
            e = e/req;
            total = total + e;
            e = e + b;


        }
        System.out.println(total);


    }

}