package ObjectsandClasses.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Vehicle> vehicleList=new ArrayList<>();
         String input= scanner.nextLine();
         while(!input.equals("End")){
             String type=input.split(" ")[0];
             String model=input.split(" ")[1];
             String color=input.split(" ")[2];
             int hp=Integer.parseInt(input.split(" ")[3]);
             Vehicle vehicle=new Vehicle(type,model,color,hp);
             vehicleList.add(vehicle);

             input= scanner.nextLine();
         }
         String enteredModel= scanner.nextLine();
         while(!enteredModel.equals("Close the Catalogue")){
             for (Vehicle vehicle: vehicleList ) {
                 if(enteredModel.equals(vehicle.getModel())){
                     System.out.println(vehicle);
                     break;
                 }
             }

             enteredModel=scanner.nextLine();
         }
        System.out.printf("Cars have average horsepower of: %.2f.%n",getAverageHP(vehicleList,"cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.",getAverageHP(vehicleList,"trucks"));
    }

    private static double getAverageHP(List<Vehicle> vehicleList,String type){
        double sum=0;
        int count=0;
        if(type.equals("cars")){
            for (Vehicle vehicle: vehicleList) {
             if(vehicle.getType().equals("car")){
                 sum+=vehicle.getHp();
                 count++;
             }
            }

        } else if (type.equals("trucks")) {
            for (Vehicle vehicle: vehicleList) {
                if(vehicle.getType().equals("truck")){
                    sum+=vehicle.getHp();
                    count++;
                }
            }

        }
        if(sum==0){
            return sum=0;
        }
        return sum/count;
    }
}
