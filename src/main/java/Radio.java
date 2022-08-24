
public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStations;

    public Radio() {
        numberOfStations = 10;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            this.currentStation = 0;
        } else if (currentStation > numberOfStations - 1) {
            this.currentStation = numberOfStations;
        } else {
            this.currentStation = currentStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            this.currentVolume = 0;
            return;
        } else if (currentVolume > 100) {
            this.currentVolume = 100;
            return;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void next() {
        if (currentStation == numberOfStations) {
            currentStation = numberOfStations;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = (numberOfStations - 1);
        } else {
            currentStation--;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            this.currentVolume = 100;
        }
    }

}