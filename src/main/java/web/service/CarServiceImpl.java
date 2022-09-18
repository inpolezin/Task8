package web.service;

import org.springframework.stereotype.Service;
import web.entity.CarEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    List<CarEntity> carEntityList;

    {
        CarEntity car1 = new CarEntity(1L, "BMW", 1995);
        CarEntity car2 = new CarEntity(2L, "Mercedes", 2001);
        CarEntity car3 = new CarEntity(3L, "Lamba", 1990);
        CarEntity car4 = new CarEntity(4L, "Kia", 2005);
        CarEntity car5 = new CarEntity(5L, "Tesla", 2012);

        carEntityList = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5));
    }

    @Override
    public List<CarEntity> getSpecifiedQuantityCars(int quan) {
        if (quan < 5) {
            return carEntityList.subList(0, quan);
        } else {
            return carEntityList;
        }
    }

    @Override
    public List<CarEntity> getAllCars() {
        return carEntityList;
    }
}
