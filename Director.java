package Assignment;
//Director
public class Director {
    public Car constructFamilyCar() {
        return new Car.Builder()
                .setBrand("Alphard")
                .setColor("White")
                .setSeats(6)
                .setWheels(6)
                .setHasGPS(true)
                .build();
    }
    public Car constructSportCar() {
        return new Car.Builder()
                .setBrand("Bugatti")
                .setColor("Blue")
                .setSeats(2)
                .setWheels(4)
                .setHasGPS(false)
                .build();
    }
    public Car consteuctFormulaOneCar() {
        return new Car.Builder()
                .setBrand("Ferrari F1")
                .setColor("Red")
                .setSeats(1)
                .setWheels(4)
                .setHasGPS(false)
                .build();
    }
}
