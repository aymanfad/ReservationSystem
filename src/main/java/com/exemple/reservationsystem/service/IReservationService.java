package com.exemple.reservationsystem.service;

import com.exemple.reservationsystem.entities.Reservation;
import com.exemple.reservationsystem.entities.User;

import java.util.Date;

public interface IReservationService {
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Reservation reservation);
    Reservation createReservation(User user, Date date);

}
