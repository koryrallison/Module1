package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int bookedFirstClassSeats;
    private int availableFirstClassSeats;
    private int totalFirstClassSeats;
    private int bookedCoachSeats;
    private int availableCoachSeats;
    private int totalCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if (forFirstClass) {
            if (totalFirstClassSeats - bookedFirstClassSeats >= totalNumberOfSeats) {
                bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            }
            return false;
        }
        if (!forFirstClass) {
            if (totalCoachSeats - bookedCoachSeats >= totalNumberOfSeats) {
                bookedCoachSeats += totalNumberOfSeats;
                return true;
            }
            return false;
        }
        return forFirstClass;
    }

    public String getPlaneNumber() {
        this.planeNumber = planeNumber;
        return planeNumber;
    }

    public int getBookedFirstClassSeats() {
        this.bookedFirstClassSeats =bookedFirstClassSeats;
        return bookedFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
        return availableFirstClassSeats;
    }

    public int getTotalFirstClassSeats() {
        this.totalFirstClassSeats = totalFirstClassSeats;
        return totalFirstClassSeats;
    }

    public int getBookedCoachSeats() {
        this.bookedCoachSeats = bookedCoachSeats;
        return bookedCoachSeats;
    }

    public int getAvailableCoachSeats() {
        availableCoachSeats = totalCoachSeats - bookedCoachSeats;
        return availableCoachSeats;
    }

    public int getTotalCoachSeats() {
        this.totalCoachSeats = totalCoachSeats;
        return totalCoachSeats;
    }
}
