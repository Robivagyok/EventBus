package hu.Igen;

import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventbusConfiguration {

    public EventbusConfiguration() {
        System.out.println("Létrejött!");
    }

    @Bean
    public EventBus eventbus(){
        return new EventBus();
    }

}
