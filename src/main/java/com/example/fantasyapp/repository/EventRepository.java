package com.example.fantasyapp.repository;

import com.example.fantasyapp.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}