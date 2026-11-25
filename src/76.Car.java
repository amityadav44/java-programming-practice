
class Car {
    final String model;
    final int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Car[] cars = {
                new Car("BMW", 2020),
                new Car("Audi", 2021),
                new Car("Tesla", 2022)
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Model: " + cars[i].model + ", Year: " + cars[i].year);
        }
    }
}
