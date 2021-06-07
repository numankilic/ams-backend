package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "flight_leg" )
public class FlightLeg {

    @Column(name = "flight_number")
    private String flightNumber;
    @Id
    @Column(name = "leg_number")
    private String legNumber;
    @Column(name = "departure_airport_code")
    private String depAirportCode;
    @Column(name = "arrival_airport_code")
    private String arrAirportCode;
    @Column(name = "scheduled_departure_time")
    private LocalTime scheduledDepTime;
    @Column(name = "scheduled_arrival_time")
    private LocalTime scheduledArrTime;
    @Column(name = "miles")
    private int miles;

}
