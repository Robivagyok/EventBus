package hu.Igen;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

public class HorgaszVerseny {
    private @Getter Fish fish;

    @Autowired
    public void setFish(Fish fish) {
        this.fish = fish;
    }
}
