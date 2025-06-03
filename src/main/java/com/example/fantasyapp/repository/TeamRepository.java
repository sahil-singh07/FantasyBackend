package com.example.fantasyapp.repository;

import com.example.fantasyapp.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}