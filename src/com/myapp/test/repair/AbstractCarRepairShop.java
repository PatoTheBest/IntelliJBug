package com.myapp.test.repair;

import com.myapp.test.car.Car;

public abstract class AbstractCarRepairShop<C extends Car> implements ICarRepairShop<C> {

    @Override
    public void repair(Car car) {
        System.out.println("Repairing car");
    }
}
