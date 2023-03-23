package com.kogul.service;

import com.kogul.model.Speaker;
import com.kogul.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
//@Profile("dev")
@Scope(value= BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {
    // Comment/uncomment the @Autowired methods in this class and see how the flow changes
    private SpeakerRepository repo;

    public SpeakerServiceImpl() {
        System.out.println("In the SpeakerServiceImpl no args constructor");
    }
//    @Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("In the SpeakerServiceImpl repository constructor");
        repo = repository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("We're called after the constructor");
    }
    @Override
    public List<Speaker> findAll() {
        return repo.findAll();
    }

    @Autowired
    public void setRepo(SpeakerRepository repo) {
        System.out.println("In the SpeakerServiceImpl setter");
        this.repo = repo;
    }
}
