
public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            this.currentStation = currentStation;
            return;
        } else if (currentStation > 9) {
            this.currentStation = 9;
            return;
        } else {
            this.currentStation = currentStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            this.currentVolume = 0;
        } else if (currentVolume > 10) {
            this.currentVolume = 10;
        } else {
            this.currentVolume = currentVolume;
        }
    }



    public void next() {
        if (currentStation == 9) {
            currentStation = 0;

        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        }
        else {
            currentStation--;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

}