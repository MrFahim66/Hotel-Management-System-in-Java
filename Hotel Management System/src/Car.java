public class Car {
    protected String carName, carType;
    protected double carPrice;

    public Car() {
    }

    public Car(String carName, String carType, double carPrice) {
        this.carName = carName;
        this.carType = carType;
        this.carPrice = carPrice;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public void displayAvailableCar(){
        System.out.println("\nCar Name : "+this.getCarName());
        System.out.println("Car Type   : "+this.getCarType());
        System.out.println("Car Price  : "+this.getCarPrice());
    }
}
