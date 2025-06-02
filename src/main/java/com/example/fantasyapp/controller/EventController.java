package com.example.fantasyapp.controller;

import com.example.fantasyapp.model.Event;
import com.example.fantasyapp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping("/submit")
    public String submitTeam(@RequestBody List<Long> selectedEventIds) {
        return eventService.submitTeam(selectedEventIds);
    }
}