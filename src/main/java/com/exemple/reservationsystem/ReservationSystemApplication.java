package com.exemple.reservationsystem;

import com.exemple.reservationsystem.entities.Reservation;
import com.exemple.reservationsystem.entities.Role;
import com.exemple.reservationsystem.entities.User;
import com.exemple.reservationsystem.repositories.ReservationRepository;
import com.exemple.reservationsystem.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

import static com.exemple.reservationsystem.entities.Role.CUSTOMER;
import static com.exemple.reservationsystem.entities.Role.PROVIDER;

@SpringBootApplication
public class ReservationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationSystemApplication.class, args);
    }

    @Bean
    CommandLineRunner start(UserRepository userRepository, ReservationRepository reservationRepository){
        return args -> {
            Stream.of("joe", "joey", "joanne")
                    .forEach(name -> {
                        User user = new User();
                        user.setUsername(name);
                        user.setRole(CUSTOMER);
                        userRepository.save(user);
                    });

            Stream.of("amine", "majda", "ayman")
                    .forEach(name -> {
                        User user = new User();
                        user.setUsername(name);
                        user.setRole(PROVIDER);
                        userRepository.save(user);
                    });

            User user1 = userRepository.findById(1L).get();

            Reservation reservation = new Reservation();
            reservation.setUser(user1);
            reservation.setDate(new Date());
            reservationRepository.save(reservation);

        };
    }

}
