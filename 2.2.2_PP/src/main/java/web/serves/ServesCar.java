package web.serves;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServesCar {




    public List<Car> list_cars(int value) {
        List<Car> listCars = new ArrayList<>();
        listCars.add(new Car("BMW", "black", 1995));
        listCars.add(new Car("Vesta", "red", 2005));
        listCars.add(new Car("Nissan", "blue", 2016));
        listCars.add(new Car("Mazda", "white", 2022));
        listCars.add(new Car("KIA", "silver", 1999));

        if (value == 0) {
            return listCars;
        }
        return listCars.stream().limit(value).collect(Collectors.toList());
    }


}
