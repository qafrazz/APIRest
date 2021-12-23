package com.github.franciscobandeira.staties.repositories;

import com.github.franciscobandeira.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
