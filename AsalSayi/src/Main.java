import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Bir Deger Giriniz : ");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();


        int sayac=0;
        int number=2;

        while(sayac<sayi){

            boolean asal=true;

            for(int i=2; i<number/2; i++){

                if(number%i==0)
                {
                    asal=false;
                    i=number;
                }

            }

            if(asal)
            {
                System.out.println(number);
                sayac++;
            }

            number++;



        }
    }
}