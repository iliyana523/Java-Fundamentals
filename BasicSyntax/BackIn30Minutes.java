package BasicSyntaxLab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int initHours=Integer.parseInt(scanner.nextLine());
        int initMinutes=Integer.parseInt(scanner.nextLine());

        int allMinutes=(initHours*60)+initMinutes+30;
        int hour=allMinutes/60;
        int minutes=allMinutes%60;
        if(hour>23){
            hour=0;
        }
        System.out.printf("%2d:%02d",hour,minutes);


    }
}
