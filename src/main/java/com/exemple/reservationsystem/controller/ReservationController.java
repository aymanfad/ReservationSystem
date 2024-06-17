package com.exemple.reservationsystem.controller;

import com.exemple.reservationsystem.entities.Reservation;
import com.exemple.reservationsystem.repositories.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ReservationController {
    private ReservationRepository reservationRepository;

    @GetMapping("/index")
    public String reservation(Model model){
        List<Reservation> reservations = reservationRepository.findAll();
        model.addAttribute("listReservations",reservations);
        return "reservations";
    }
}
