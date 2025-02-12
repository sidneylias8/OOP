import java.util.Scanner;

public class Main{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int a = input.nextInt();
        double b = input.nextDouble();
        input.nextLine();
        String kata = input.nextLine();

        System.out.println("Hello World!");
        System.out.println("variabel a : " + a);
        System.out.printf("%s %.5f%n", "angka desimal yang ingin dicetak : ", b);
        System.out.print("Kata yang ingin dicetak : " + kata);

    }
}