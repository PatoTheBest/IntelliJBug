package com.myapp.test.repair;

import com.myapp.test.car.Ferrari;

public class FerrariRepairShop extends AbstractCarRepairShop<Ferrari> {

    @Override
    public void repair(Ferrari car) {
        System.out.println("Repairing ferrari");
    }
}
