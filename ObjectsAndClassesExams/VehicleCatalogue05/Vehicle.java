package VehicleCatalogue05;

public class Vehicle {

    private String type;
    private String model;
    private String color;
    private int horsepower;

    Vehicle (String type, String model, String color, int horsepower){
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }
    public String getType() {
        return this.type;
    }
    public String getModel() { // използваме десен клавиш, за да направим метода
        return this.model;
    }
    public int getHorsepower() {
        return this.horsepower;
    }
    @Override
    public String toString (){ // използваме десен клавиш, за да направим метода
    String formattedType = "";
    if (this.type.equals("car")){
        formattedType = "Car";
    } else if (this.type.equals("truck")) {
        formattedType = "Truck";
    }
    return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d"
            , formattedType, this.model, this.color, this.horsepower);
    }
}
