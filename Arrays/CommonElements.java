package ArraysExercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String[] firstArray= scanner.nextLine().split(" ");
        
        String[]secondArray= scanner.nextLine().split(" ");
        for (String elementSecondArray: secondArray) {

            for (String elementFirstArray : firstArray) {
                if (elementSecondArray.equals(elementFirstArray)){
                    System.out.print(elementFirstArray+ " ");
                }
            }
        }
    }

}
