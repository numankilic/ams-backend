package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "airport")
public class Airport {
    @Id
    @Column(name = "airport_code")
    private String airportCode;
    @Column(name = "name")
    private String name;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;




}
