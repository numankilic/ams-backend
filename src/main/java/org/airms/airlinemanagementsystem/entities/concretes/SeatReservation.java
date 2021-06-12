package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.airms.airlinemanagementsystem.entities.compositeKey.SeatReservationId;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "seat_reservation")
@IdClass(SeatReservationId.class)
public class SeatReservation {
    @Id
    private String flightNumber;
    @Id
    private String legNumber;

    @Id
    private LocalDate date;
    @Id
    private int seatNumber;
    private String passportNumber;




}
