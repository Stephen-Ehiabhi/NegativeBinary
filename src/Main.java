import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //get the value from user
        System.out.println(" ");
        System.out.println("________________________________________________");
        System.out.println("This is a program to find the sign modulus, U1, and U3 of a value: ");
        System.out.println("Formula to check SM -1^n-1");
        System.out.println("Formula to check U1 -2^(n-1)+1");
        System.out.println("Formula to check U2 -2^n-1");
        System.out.println("________________________________________________");
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the value: ");
        String val = sc.next();

        //check if the number is negative or positive integer
        if(Integer.parseInt(val) < 0){
            //remove the negative sign from value
            String newVal = val.replace("-","");

            System.out.println("The SM is: 1 + " + "elements in " + ToBinary(newVal));
            System.out.println("The U1 is: 1 + " + "elements in " +  FindU1(ToBinary(newVal)));
        }else{
            //adding the digits to the array and returning an output
            System.out.println("The SM is: 0 " + "elements in " + ToBinary(val));
            System.out.println("The U1 is: 0 + " + "elements in " +  FindU1(ToBinary(val)));
        }
    }

    static List<Integer> ToBinary (String val){
        int n = Integer.parseInt(val), values;

        List<Character> value = new ArrayList<>();
        List<Integer> remainder = new ArrayList<>();
        List<Integer> binaryDigits = new ArrayList<>();

        //loop through the value to get all the ints
       for(int i = 0; i < val.length(); i++){
           //store digits in array
           value.add(val.charAt(i));
       }

       //main loop to divide the value until it can no longer be divided
       for(int i =0; n > 0; i++){
           //find the remainder
           values = n % 2;
           //store each the remainder in the binaryDigits array
           remainder.add(values);
           //divide the current number by 2
           n = n / 2;
       }

       //reverse the remainder array
        for(int i = remainder.size()-1; n < remainder.size(); i--){
            //stops the loop if the index is a negative number
            if(i<0) break;
            //stores the value in the binary class
           binaryDigits.add(remainder.get(i));
        }

        return binaryDigits;
    }


    //method to negate the binary values
    static List<Integer> FindU1 (List<Integer> val) {
        List<Integer> negateBinary = new ArrayList<>();

        for(int i =0; i < val.size(); i++){
            if(val.get(i) == 0)  negateBinary.add(1);
            else negateBinary.add(0);
        }

        return negateBinary;

    }

}
