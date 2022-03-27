import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        //get the value from user
        System.out.println("Program to find the sign modulus of a value: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the value: ");
        String val = sc.next();

        //check if the number is negative or positive integer
        if(Integer.parseInt(val) < 0){
            //remove the negative sign from value
            String newVal = val.replace("-","");
            ToBinary(newVal);
        }else{
            //adding the digits to the array
            ToBinary(val);
        }
    }

    static void ToBinary (String val){
        int n = Integer.parseInt(val), values;
        List<Character> value = new ArrayList<Character>();
        List<Integer> remainder = new ArrayList<Integer>();
        List<Integer> binaryDigits = new ArrayList<Integer>();

        //loop through the value to get all the ints
       for(int i = 0; i < val.length(); i++){
           //store digits in array
           value.add(val.charAt(i));
       }

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
            if(i<0) break;
           binaryDigits.add(remainder.get(i));
        }

        System.out.println(binaryDigits);

    }
}
