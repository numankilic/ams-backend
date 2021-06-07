package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.airms.airlinemanagementsystem.entities.compositeKey.CheckinId;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "check_in")
@IdClass(CheckinId.class)
public class Checkin {
    @Id
    @Column(name = "passport_number")
    private String passportNumber;
    @Id
    @Column(name = "flight_number")
    private String flightNumber;
    @Id
    @Column(name = "leg_number")
    private String legNumber;
    @Id
    @Column(name = "date")
    private LocalDate date;
}
