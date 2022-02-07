package hu.Igen;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fish {
    private EventBus eventbus;

    @Autowired
    public void setEventBus(EventBus eventbus){
        this.eventbus=eventbus;
    }

    public void kifogtak(){
        this.eventbus.post(new CatchFishEvent());
    }

}
