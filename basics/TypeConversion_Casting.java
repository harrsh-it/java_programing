public class TypeConversion_Casting {
    public static void main(String[] args) {


        //Implicit conversion
        float myFloat = 5;
        System.out.println(myFloat);


        //Explicit conversion
        int myInt = (int) 5.0f;
        System.out.println(myInt); //5

        

    }
}



//AUTOMATIC TYPE CONVERSION (WIDENING- IMPLICIT)
// byte --can_fit_in--> short --> int --> long --> float --> double

//NARROWING (EXPLICIT)
//byte  <--need_to_casting--  short <-- int <-- long <-- float <-- double


