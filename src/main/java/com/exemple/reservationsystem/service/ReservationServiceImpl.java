package com.exemple.reservationsystem.service;

import com.exemple.reservationsystem.entities.Reservation;
import com.exemple.reservationsystem.entities.User;
import com.exemple.reservationsystem.repositories.ReservationRepository;
import com.exemple.reservationsystem.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class ReservationServiceImpl implements IReservationService {
    private ReservationRepository reservationRepository;
    private UserRepository userRepository;

    public ReservationServiceImpl(ReservationRepository reservationRepository, UserRepository userRepository) {
        this.reservationRepository = reservationRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        reservationRepository.delete(reservation);
    }

    @Override
    public Reservation createReservation(User user, Date date) {
        Reservation reservation = new Reservation();
        reservation.setUser(user);
        reservation.setDate(date);
        return reservation;
    }


}
