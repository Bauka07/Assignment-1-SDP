package Assignment;

//Client
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        Car familyCar = director.constructFamilyCar();
        Car sportCar = director.constructSportCar();
        Car formulaOneCar = director.consteuctFormulaOneCar();

        System.out.println(familyCar);
        System.out.println(sportCar);
        System.out.println(formulaOneCar);
    }
}
