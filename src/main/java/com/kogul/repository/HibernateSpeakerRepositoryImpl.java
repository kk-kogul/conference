package com.kogul.repository;

import com.kogul.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public HibernateSpeakerRepositoryImpl() {
        System.out.println("In the SpeakerRepoImpl class cons");
    }
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Kogul");
        speaker.setLastName("Krish");

        speakers.add(speaker);
        return speakers;
    }

}
