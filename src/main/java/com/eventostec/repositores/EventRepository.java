package com.eventostec.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  EventRepository extends JpaRepository<Event, UUID> {
  
}
