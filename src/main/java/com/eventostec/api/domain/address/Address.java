package com.eventostec.api.domain.address;

import java.util.UUID;

import com.eventostec.api.domain.event.Event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "address")
@Entity

public class Address {
  @Id
  @GeneratedValue
  private UUID id;

  private String city;
  private String uf;

  @ManyToOne
  @JoinColumn(name = "event_list")
  private Event event;
  
}
