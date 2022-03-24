package com.shippingcompany.delivery;

public class DroneDelivery extends Delivery{
    public static final double DRONE_TOP_SPEED = 100;

    @Override
    public int getDuration() {
        int weight = getShipment().getWeight();
        double topSpeedWithWeight = DRONE_TOP_SPEED/ weight;
        double decimalHours = (double) getDistance() / topSpeedWithWeight;
        return convertHoursToMinutes(decimalHours);
    }
}
