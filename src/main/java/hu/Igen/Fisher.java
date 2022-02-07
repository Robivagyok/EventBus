package hu.Igen;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Fisher {
    private EventBus eventbus;

    @Autowired
    public void setEventBus(EventBus eventbus){
        this.eventbus = eventbus;
    }

    @PostConstruct
    public void catchfishevent(){
        this.eventbus.register(this);
    }
}
