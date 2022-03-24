package com.shippingcompany.delivery;

public class TruckDelivery extends Delivery{
    public static final double TRUCK_TOP_SPEED = 60;

    @Override
    public int getDuration() {
        double decimalHours = super.getDistance() / TRUCK_TOP_SPEED;
        return convertHoursToMinutes(decimalHours);
    }
}
