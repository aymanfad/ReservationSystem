package com.exemple.reservationsystem.repositories;

import com.exemple.reservationsystem.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
