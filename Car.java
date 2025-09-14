package Assignment;
// Product Car
public class Car {
    private String brand;
    private String color;
    private int seats;
    private int wheels;
    private boolean hasGPS;

    private Car(Builder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.seats = builder.seats;
        this.wheels = builder.wheels;
        this.hasGPS = builder.hasGPS;
    }

    public String toString(){
        return "Brand: " + brand +
                " | Color: " + color +
                " | Seats: " + seats +
                " | Wheels: " + wheels +
                " | hasGPS: " + hasGPS;
    }
    //Builder
    public static class Builder{
        private String brand;
        private String color;
        private int seats;
        private int wheels;
        private boolean hasGPS;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }
        public Builder setSeats(int seats) {
            this.seats = seats;
            return this;
        }
        public Builder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }
        public Builder setHasGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }
        public Car build() {
            return new Car(this);
        }
    }
}
