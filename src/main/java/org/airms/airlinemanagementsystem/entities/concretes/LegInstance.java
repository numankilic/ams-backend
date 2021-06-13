package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.airms.airlinemanagementsystem.entities.compositeKey.LegInstanceId;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "leg_instance")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(LegInstanceId.class)
public class LegInstance {

    @Id
    private String legNumber;
    @Id
    private String flightNumber;
    @Id
    @Column(name = "date")
    private LocalDate date;
    @Column(name = "number_of_available_seats")
    private int numAvailableSeats;

    @Column(name = "airplane_id")
    private String airplane;

    @Column(name = "departure_airport_code")
    private String depAirportCode;
    @Column(name = "arrival_airport_code")
    private String arrAirportCode;
    @Column(name = "departure_time")
    private LocalTime depTime;
    @Column(name = "arrival_time")
    private LocalTime arrTime;






}
