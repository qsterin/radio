
public class Radio {
    private int maxCurrentVolume = 10;
    private int maxCurrentStation = 9;
    private int minCurrentVolume = 0;
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
            this.currentStation = minCurrentVolume;
            return;
        } else if (currentStation > 9) {
            this.currentStation = maxCurrentStation;
            return;
        } else {
            this.currentStation = currentStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            this.currentVolume = minCurrentVolume;
            return;
        } else if (currentVolume > 10) {
            this.currentVolume = maxCurrentVolume;
            return;
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