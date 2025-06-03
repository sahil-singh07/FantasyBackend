package com.example.fantasyapp.controller;


import com.example.fantasyapp.DTO.EventSummaryDTO;
import com.example.fantasyapp.model.Event;
import com.example.fantasyapp.model.Team;
import com.example.fantasyapp.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    @Autowired
    private TeamRepository teamRepository;

    // Get all teams with their selected events
    @GetMapping
    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    @GetMapping("/{teamId}/summary")
    public ResponseEntity<?> getTeamEventSummary(@PathVariable Long teamId) {
        Optional<Team> teamOpt = teamRepository.findById(teamId);

        if (teamOpt.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Team not found");
        }

        Team team = teamOpt.get();
        List<EventSummaryDTO> eventSummaries = new ArrayList<>();
        int totalPoints = 0;

        for (Event event : team.getSelectedEvents()) {
            eventSummaries.add(new EventSummaryDTO(event.getName(), event.isCompleted(), event.getPoints()));
            if (event.isCompleted()) {
                totalPoints += event.getPoints(); // ✅ Only add points for completed events
            }
        }

        Map<String, Object> response = new HashMap<>();
        response.put("teamId", team.getId());
        response.put("events", eventSummaries);
        response.put("totalPoints", totalPoints);

        return ResponseEntity.ok(response);
    }



}