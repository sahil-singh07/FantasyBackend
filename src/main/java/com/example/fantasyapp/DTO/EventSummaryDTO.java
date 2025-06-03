package com.example.fantasyapp.DTO;

public class EventSummaryDTO {
    private String name;
    private boolean isCompleted;
    private int points;

    public EventSummaryDTO(String name, boolean isCompleted, int points) {
        this.name = name;
        this.isCompleted = isCompleted;
        this.points = points;
    }

    // Getters
    public String getName() { return name; }
    public boolean isCompleted() { return isCompleted; }
    public int getPoints() { return points; }
}
