package com.myapp.test.repair;

import com.myapp.test.car.Car;

public interface ICarRepairShop<C extends Car> {

    void repair(C car);

}
