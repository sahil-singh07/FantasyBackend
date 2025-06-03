package com.example.fantasyapp.controller;

import com.example.fantasyapp.model.Event;
import com.example.fantasyapp.repository.EventRepository;
import com.example.fantasyapp.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private EventRepository eventRepository;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @PostMapping("/submit")
    public String submitTeam(@RequestBody List<Long> selectedEventIds) {
        return eventService.submitTeam(selectedEventIds);
    }

    @PutMapping("/{eventId}/complete")
    public ResponseEntity<?> markEventCompleted(
            @PathVariable Long eventId,
            @RequestBody Map<String, Boolean> payload
    ) {
        Optional<Event> eventOpt = eventRepository.findById(eventId);
        if (eventOpt.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Event not found");
        }

        boolean isCompleted = payload.getOrDefault("isCompleted", false);

        Event event = eventOpt.get();
        event.setCompleted(isCompleted);
        eventRepository.save(event);

        return ResponseEntity.ok("Event completion status updated successfully");
    }

}