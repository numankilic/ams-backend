package org.airms.airlinemanagementsystem.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.airms.airlinemanagementsystem.entities.compositeKey.FlightLegId;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "flight_leg")
@IdClass(FlightLegId.class)
public class FlightLeg {


    @Id
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
