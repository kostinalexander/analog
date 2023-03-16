public class ServiceStation implements UpdateTure, CheckEngine, CheckTrailer, check {
    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void check(Car car) {
        if(car!= null){
            System.out.println("Обслуживаем"+ car.getModelName());
            for (int i = 0; i <car.getWheelsCount() ; i++) {
                car.updateTyre();
            }
        }
    }
    public void check(Bicycle bicycle){
        if(bicycle!= null){
            System.out.println("Обслуживаем"+ bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount() ; i++) {
                bicycle.updateTyre();

            }
        }
    }
    public void check(Truck truck){
        if(truck!= null){
            System.out.println("Обслуживаем"+ truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount() ; i++) {
                truck.updateTyre();

            }
        }
    }

}


//if (car != null) {
//            System.out.println("Обслуживаем " + car.getModelName());
//            for (int i = 0; i < car.getWheelsCount(); i++) {
//                car.updateTyre();
//            }
//            car.checkEngine();
//        } else if (truck != null) {
//            System.out.println("Обслуживаем " + truck.getModelName());
//            for (int i = 0; i < truck.getWheelsCount(); i++) {
//                truck.updateTyre();
//            }
//            truck.checkEngine();
//            truck.checkTrailer();
//        } else if (bicycle != null) {
//            System.out.println("Обслуживаем " + bicycle.getModelName());
//            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
//                bicycle.updateTyre();
//            }
//        }
//    }