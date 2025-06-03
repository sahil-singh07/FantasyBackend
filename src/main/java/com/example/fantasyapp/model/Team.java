package com.example.fantasyapp.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "team_events",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "event_id")
    )
    private List<Event> selectedEvents;

    public Team() {
    }

    public Team(Long id, List<Event> selectedEvents) {
        this.id = id;
        this.selectedEvents = selectedEvents;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Event> getSelectedEvents() {
        return selectedEvents;
    }

    public void setSelectedEvents(List<Event> selectedEvents) {
        this.selectedEvents = selectedEvents;
    }
}