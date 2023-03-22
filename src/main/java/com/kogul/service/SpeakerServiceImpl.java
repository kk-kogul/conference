package com.kogul.service;

import com.kogul.model.Speaker;
import com.kogul.repository.HibernateSpeakerRepositoryImpl;
import com.kogul.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repo;

    public SpeakerServiceImpl(SpeakerRepository repository) {
        repo = repository;
    }
    @Override
    public List<Speaker> findAll() {
        return repo.findAll();
    }

    public void setRepo(SpeakerRepository repo) {
        this.repo = repo;
    }
}
