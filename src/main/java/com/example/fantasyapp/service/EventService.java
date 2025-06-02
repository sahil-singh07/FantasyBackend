package com.example.fantasyapp.service;

import com.example.fantasyapp.model.Event;
import com.example.fantasyapp.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public String submitTeam(List<Long> selectedEventIds) {
        List<Event> selectedEvents = eventRepository.findAllById(selectedEventIds);
        int totalCredits = selectedEvents.stream().mapToInt(Event::getCreditPoints).sum();
        if (selectedEvents.size() != 11) return "You must select exactly 11 events.";
        if (totalCredits > 100) return "Total credits exceed limit.";
        return "Team submitted successfully!";
    }
}