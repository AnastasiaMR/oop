package ru.netology.constructor;

public class Radio {
    private int maxStation = 10;
    private int minStation = 0;
    private int currentStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume;


    public Radio(
            int maxStation,
            int minStation,
            int currentStation,
            int maxVolume,
            int minVolume,
            int currentVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
    }

    public int getMaxStation( ) {

        return maxStation;
    }

    public void setMaxStation(int maxStation) {

        this.maxStation = maxStation;
    }

    public int getMinStation( ) {

        return minStation;
    }

    public void setMinStation(int minStation) {

        this.minStation = minStation;
    }

    public int getCurrentStation( ) {

        return currentStation;
    }

    public void  setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            currentStation = 0;
        }
        if (currentStation < minStation) {
            currentStation = 10;
        }
        this.currentStation = currentStation;
    }

    public int getMaxVolume( ) {

        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {

        this.maxVolume = maxVolume;
    }

    public int getMinVolume( ) {

        return minVolume;
    }

    public void setMinVolume(int minVolume) {

        this.minVolume = minVolume;
    }

    public int getCurrentVolume( ) {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void PrevStation() {
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
        }
        else
            this.currentStation--;
    }

    public void NextStation() {
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
        }
        else
            this.currentStation++;
    }

    public void increaseCurrentVolume() {
        if (currentVolume >= maxVolume) {
            return;
        }
        this.currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume <= minVolume) {
            return;
        }
        this.currentVolume--;
    }
}
