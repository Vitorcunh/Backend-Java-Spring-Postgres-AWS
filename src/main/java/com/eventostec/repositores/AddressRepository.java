package com.eventostec.repositores;



import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventostec.api.domain.address.Address;

public interface AddressRepository extends JpaRepository <Address, UUID> {
    public Optional<Address> findByEventId(UUID eventId);
}
