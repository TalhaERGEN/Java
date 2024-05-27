import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("metin giriniz : ");
        String metin = input.nextLine();
        int sayiSayaci = 0;
        int harfSayaci = 0;
        for (int i = 0; i <metin.length(); i++) {
            char c = metin.charAt(i);
            if (Character.isDigit(c)) {
                sayiSayaci++;
            }
            if (Character.isAlphabetic(c)) {
                harfSayaci++;
            }

        }

        System.out.println("metinde"+ " " +sayiSayaci + " tane sayi"  + " " +harfSayaci +  " " + "tane harf bulnmakta");

        /*System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int digitCount = 0;
        int letterCount = 0;
        for(int i = 0; i<word.length(); i++){
            char c = word.charAt(i);
            if(Character.isAlphabetic(c))
                letterCount++;
            if(Character.isDigit(c))
                digitCount++;
        }
        System.out.println(" has " + letterCount + " letters " + digitCount + " digits." );*/
    }
}