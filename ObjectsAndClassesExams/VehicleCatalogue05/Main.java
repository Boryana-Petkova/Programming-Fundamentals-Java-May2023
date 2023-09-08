package VehicleCatalogue05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Vehicle> vehiclesList = new ArrayList<>();
        while (!input.equals("End")){

            String [] commandsArr = input.split(" ");
            String type = commandsArr[0];
            String model = commandsArr[1];
            String color = commandsArr[2];
            int horsepower = Integer.parseInt(commandsArr[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            vehiclesList.add(vehicle);


            input = scanner.nextLine();
        }

            String enteredModel = scanner.nextLine();
        while (!enteredModel.equals("Close the Catalogue")){
            for (Vehicle vehicle: vehiclesList ) {
                if (enteredModel.equals(vehicle.getModel())){
                    System.out.println(vehicle);
                    break; // спри да търсиш други с даденото име,
                    // мини на прочитане на следващо име на модел
                }
            }

            enteredModel = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHP(vehiclesList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHP(vehiclesList, "trucks"));
        // с десен клавиш върху getAverageHP и създаваме долу метод, оформяме го в Double и т.н
    }

    private static Double getAverageHP(List<Vehicle> vehiclesList, String typeVehicle) {
        double sum = 0;
        int count = 0;
        if (typeVehicle.equals("cars")) {
            for (Vehicle vehicle : vehiclesList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHorsepower();
                    count++;
                }
            }
        } else if (typeVehicle.equals("trucks")) {
            for (Vehicle vehicle : vehiclesList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHorsepower();
                    count++;
                }
            }
        }
        if (sum == 0){
            return 0.0;
        }
        return sum / count;
    }
}
