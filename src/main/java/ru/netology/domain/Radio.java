package ru.netology.domain;

public class Radio {
    private int numberCurrentRadio;
    private int minNumberCurrentRadio;
    private int maxNumberCurrentRadio;
    private int soundVolume;
    private int minSoundVolume;
    private int maxSoundVolume;

    public int getMinNumberCurrentRadio() {
        return minNumberCurrentRadio;
    }

    public void setMinNumberCurrentRadio(int minNumberCurrentRadio) {
        this.minNumberCurrentRadio = minNumberCurrentRadio;
    }

    public int getMaxNumberCurrentRadio() {
        return maxNumberCurrentRadio;
    }

    public void setMaxNumberCurrentRadio(int maxNumberCurrentRadio) {
        this.maxNumberCurrentRadio = maxNumberCurrentRadio;
    }

    public int getMinSoundVolume() {
        return minSoundVolume;
    }

    public void setMinSoundVolume(int minSoundVolume) {
        this.minSoundVolume = minSoundVolume;
    }

    public int getMaxSoundVolume() {
        return maxSoundVolume;
    }

    public void setMaxSoundVolume(int maxSoundVolume) {
        this.maxSoundVolume = maxSoundVolume;
    }

    public int getNumberCurrentRadio() {
        return numberCurrentRadio;
    }

    public void setNumberCurrentRadio(int numberCurrentRadio) {
        this.numberCurrentRadio = numberCurrentRadio;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public void nextNumberCurrentRadio() {
        if (numberCurrentRadio < maxNumberCurrentRadio) {
            this.numberCurrentRadio++;
        } else this.numberCurrentRadio = minNumberCurrentRadio;
    }

    public void prevNumberCurrentRadio() {
        if (numberCurrentRadio > minNumberCurrentRadio){
            this.numberCurrentRadio--;
        } else this.numberCurrentRadio = maxNumberCurrentRadio;
    }

    public void increaseSoundVolume(){
        if (soundVolume < maxSoundVolume){
            this.soundVolume++;
        } else this.soundVolume = maxSoundVolume;
    }

    public void decreaseSoundVolume() {
        if (soundVolume > minSoundVolume) {
            this.soundVolume--;
        } else this.soundVolume = minSoundVolume;
    }
}
