package com.github.franciscobandeira.countries.repositories;

import com.github.franciscobandeira.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
