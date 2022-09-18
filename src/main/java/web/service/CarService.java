package web.service;

import web.entity.CarEntity;

import java.util.List;

public interface CarService {
    List<CarEntity> getSpecifiedQuantityCars(int quan);
}
