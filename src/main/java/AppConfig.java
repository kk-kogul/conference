import com.kogul.repository.HibernateSpeakerRepositoryImpl;
import com.kogul.repository.SpeakerRepository;
import com.kogul.service.SpeakerService;
import com.kogul.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="speakerService")
    public SpeakerServiceImpl getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());

        // Added above through the constructor
//        service.setRepo(getSpeakerRepository());
        return service;
    }

    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }
}
