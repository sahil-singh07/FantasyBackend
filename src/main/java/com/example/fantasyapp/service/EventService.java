package com.example.fantasyapp.service;

import com.example.fantasyapp.model.Event;
import com.example.fantasyapp.model.Team;
import com.example.fantasyapp.repository.EventRepository;
import com.example.fantasyapp.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private TeamRepository teamRepository;

    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    public String submitTeam(List<Long> selectedEventIds) {
        if (selectedEventIds.size() != 11) {
            return "You must select exactly 11 events.";
        }

        List<Event> events = eventRepository.findAllById(selectedEventIds);
        if (events.size() != 11) {
            return "One or more selected events not found.";
        }

        Team team = new Team();
        team.setSelectedEvents(events);
        teamRepository.save(team);

        return "Team submitted successfully!";
    }
}