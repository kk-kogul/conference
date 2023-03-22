package com.kogul.repository;

import com.kogul.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Kogul");
        speaker.setLastName("Krish");

        speakers.add(speaker);
        return speakers;
    }

}
