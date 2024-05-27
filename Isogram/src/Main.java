import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Text");
        String text = scanner.nextLine();
       // boolean result = isIsogram(text);
        if(isIsogram(text))
            System.out.println("is Isogram");
        else
            System.out.println("is not Isogram");

        /*System.out.println(isIsogram("Visual"));            //true
        System.out.println(isIsogram("Programming"));       //false
        System.out.println(isIsogram("JavA"));              //false
        System.out.println(isIsogram("uncopyrightable"));   //true*/
    }

     private static boolean isIsogram(String text){
        return text.length() == text.toLowerCase().chars().distinct().count();


    }


}




