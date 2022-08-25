package com.pdacademy.eventboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pdacademy.eventboard.models.Event;

public interface EventRepository extends JpaRepository<Event, Long>{

}
