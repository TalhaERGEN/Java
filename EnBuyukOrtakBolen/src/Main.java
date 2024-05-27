

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Birinci Sayiyi Giriniz: ");
        int num1=input.nextInt();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        int num2=input.nextInt();

        int sonuc=EBOB.ebob(num1,num2);

        System.out.println("en buyuk ortak bolen : "+sonuc );


    }
}