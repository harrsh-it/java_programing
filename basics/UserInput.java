import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        

        //This line is must for taking input
        Scanner input = new Scanner(System.in); //input is a reference of Scanner class(input is a identifier it can be change or rename )


        System.out.print("Please Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);


        
        System.out.print(name + ", Enter your age: ");
        int age = input.nextInt();
        System.out.println("Your age is : " +age);


        //nextInt(); nextLine(); nextDouble(); nextFloat(); nextLong(); nextSort();
        
        

        





        
    }
}
