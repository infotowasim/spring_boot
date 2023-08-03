package com.wasim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
