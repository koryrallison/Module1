package com.techelevator;

public class Television {
    private boolean isOn;
    private int currentChannel = 3;
    private int currentVolume = 2;


    // Turns TV off
    public void turnOff() {
        isOn = false;
    }
// Turns TV on - IF TV is already on resets to channel 3 and sets volume to 2
    public void turnOn() {
        if(isOn){
            currentChannel = 3;
            currentVolume = 2;
        }
        else {
            isOn = true;
        }
    }
// IF the TV is on this will set the new channel to a value of 3-18
    public void changeChannel(int newChannel) {
        if(isOn){
            if(newChannel >= 3 && newChannel <= 18){
                currentChannel = newChannel;
            }
        }
    }
// turns the channel up by 1 if the channel is less than 18
    // once it hits that threshold it will reset to 3
    public void channelUp(){
        if(isOn){
            currentChannel++;
            if(currentChannel > 18){
                currentChannel = 3;
            }
        }
    }

    public void channelDown() {
        if(isOn){
            currentChannel--;
            if(currentChannel < 3){
                currentChannel = 18;
            }
        }
    }

    public void raiseVolume() {
        if (isOn) {
            if (currentVolume < 10) {
                currentVolume++;
            }
        }
    }

    public void lowerVolume() {
        if(isOn){
            if(currentVolume > 0){
                currentVolume--;
            }
        }
    }

    // getters

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public boolean isOn() {
        return isOn;
    }
}
