package org.airms.airlinemanagementsystem.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "flight")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {
    @Id
    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "airline")
    private String airline;
    @Column(name = "weekdays")
    private String weekDays;





}
