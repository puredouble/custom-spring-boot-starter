package me.puredouble;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(AnimalProperties.class)
public class AnimalConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Animal animal(AnimalProperties animalProperties) {
        Animal animal = new Animal();
        animal.setName(animalProperties.getName());
        animal.setAge(animalProperties.getAge());
        return animal;
    }

}
