public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4),
        };

        Truck[] trucks = {
                new Truck("track1", 6),
                new Truck("truck2", 8),
        };

        Bicycle[] bicycle = {
                new Bicycle("bicyvle1", 2),
                new Bicycle("bicycle2", 2),
        };
        check serviceStation = new ServiceStation();



        printReport(serviceStation, cars);
        printReport(serviceStation, bicycle);
        printReport(serviceStation, trucks);




    }

    private static void printReport(check serviceStation, Car[] cars) {
        serviceStation.check(cars[0]);
        serviceStation.check(cars[1]);
    }
    private static void printReport(check servisStation, Bicycle[]bicycles) {
        servisStation.check(bicycles[0]);
        servisStation.check(bicycles[1]);
    }
    private static void printReport(check servisStation, Truck[]trucks){
        servisStation.check(trucks[0]);
        servisStation.check(trucks[1]);
    }

}

//serviceStation.check(cars[0], bicycle[0], trucks[0]);
//        serviceStation.check(cars[1], bicycle[1], trucks[1]);
//        serviceStation.check(null, bicycle[0], null);
//        serviceStation.check(null, bicycle[1], null);
//        serviceStation.check(null, null, trucks[0]);
//        serviceStation.check(null, null, trucks[1]);



//Transport[] transport = new Transport[cars.length + updateTures.length + bicycle.length];
//        for (int i = 0; i < cars.length; i++) {
//            transport[i] = cars[i];
//        }
//        for (int i = 0; i < updateTures.length; i++) {
//            transport[i + cars.length] = updateTures[i];
//        }
//        for (int i = 0; i < bicycle.length; i++) {
//            transport[i + cars.length + updateTures.length] = bicycle[i];
//        }