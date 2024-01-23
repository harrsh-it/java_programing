import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Number for a: ");
        int Num1 = input.nextInt();

        System.out.print("Enter any number for b: ");
        int Num2 = input.nextInt();

        System.out.println("The value of a is "+Num1+" and value of b is "+Num2);
        
        System.out.println("Values after Swapping!");

        int temp=Num1;
        Num1=Num2;
        Num2=temp;

        System.out.println("The value of a is "+Num1+" and value of b is "+Num2);

    }
}
