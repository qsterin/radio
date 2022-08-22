public class Radio {

    public int currentStation;
    public int currentVolume;


    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0 || newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0 || newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void next() {
        if (currentStation == 9) {
            currentStation = 0;
        } else currentStation++;
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = 9;
        } else currentStation--;
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


