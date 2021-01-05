package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int numberCurrentRadio;
    private int minNumberCurrentRadio;
    private int maxNumberCurrentRadio;
    private int soundVolume;
    private int minSoundVolume;
    private int maxSoundVolume;

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
