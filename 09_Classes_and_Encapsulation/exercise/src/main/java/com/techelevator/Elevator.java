package com.techelevator;

public class Elevator {
    private int currentFloor = 1;
    private int numberOfFloors;
    private boolean doorOpen;

    // methods
    public void openDoor(){
        doorOpen = true;
    }

    public void closeDoor() {
        doorOpen = false;
    }

    public void goUp(int desiredFloor){
        if (!doorOpen) {
            if(desiredFloor <= numberOfFloors){
                if (desiredFloor > currentFloor) {
                    currentFloor = desiredFloor;
                }
            }

        }

    }

    public void goDown(int desiredFloor) {
        if (!doorOpen) {
            if (desiredFloor >= 1) {
                if (desiredFloor < currentFloor) {
                    currentFloor = desiredFloor;
                }
            }
        }

    }

    // getters
    public Elevator(int totalNumberOfFloors){
        numberOfFloors = totalNumberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }
}

