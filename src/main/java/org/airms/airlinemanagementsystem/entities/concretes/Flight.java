package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
