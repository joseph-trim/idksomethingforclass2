import java.util.Scanner;

public class idksomethingforclass2 {

    public static void main (String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter quantity");
        int quantity = sc.nextInt();

        if (quantity < 100){
            System.out.println("no dicount");
        } else if(quantity >= 100 && quantity <=120){
            System.out.println("You get 15%");
        }
    }
}
