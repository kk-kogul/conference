package com.kogul.repository;

import com.kogul.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    public HibernateSpeakerRepositoryImpl() {
        System.out.println("In the SpeakerRepoImpl class cons");
    }

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Kogul");
        speaker.setLastName("Krish");

        System.out.println("Cal " + cal.getTime());
        speakers.add(speaker);
        return speakers;
    }

}
