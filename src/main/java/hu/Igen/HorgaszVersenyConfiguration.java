package hu.Igen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HorgaszVersenyConfiguration {

    @Bean
    public HorgaszVerseny horgaszVerseny(){
        return new HorgaszVerseny();
    }
}
