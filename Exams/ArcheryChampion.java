package SoftUniExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArcheryChampion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> archery = Arrays.stream(scanner.nextLine().split("\\|")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        int hitPoints = 0;
        while (!input.equals("Game over")) {
            String inputLine[] = input.split("@");
            String command = inputLine[0];

            switch (command) {
                case "Shoot Left":
                    int startIndex = Integer.parseInt(inputLine[1]);
                    int endIndex = (startIndex + archery.size()) - Integer.parseInt(inputLine[2]);
                    if (startIndex >=0 && startIndex<=archery.size()) {
                        int currentIndex = archery.get(endIndex);
                        currentIndex -= 5;
                        archery.set(endIndex, currentIndex);
                        hitPoints += 5;
                    }
                    break;
                case "Shoot Right":
                    int startIn = Integer.parseInt(inputLine[1]);
                    int end = (startIn + archery.size()) - Integer.parseInt(inputLine[2]);
                    if (archery.size() < startIn || archery.size() < end){
                        break;
                    }
                    int currentInd = archery.get(end);
                    currentInd -= 5;
                    archery.set(end, currentInd);
                    hitPoints += 5;



                    break;
                case "Reverse":
                    Collections.reverse(archery);

                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i <archery.size() ; i++) {
            int currentNum =archery.get(i);
            if (i == archery.size()-1){
                System.out.println(currentNum);
            }else {
                System.out.print(currentNum+" - ");
            }
        }
        System.out.printf("John finished the archery tournament with %d points!", hitPoints);

    }
}
