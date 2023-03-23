import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.kogul"})
public class AppConfig {
/**
    @Bean(name="speakerService")
    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
    public SpeakerServiceImpl getSpeakerService() {
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        // Added above through the constructor
//        service.setRepo(getSpeakerRepository());
        return service;
    }

    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
    */
}
