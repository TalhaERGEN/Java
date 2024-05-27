import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Yil Giriniz : ");
        int yil=input.nextInt();

        if((yil % 4 ==0 && yil % 100 != 0) || (yil % 400==0)){

            System.out.println(yil + " " + "Leap Year");

        }
        else
        {
            System.out.println(yil + " " + "Leap Year Degil");
        }


    }
}
