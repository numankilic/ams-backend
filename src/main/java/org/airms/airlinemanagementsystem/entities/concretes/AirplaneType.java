package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "airplane_type")
public class AirplaneType {
    @Id
    @Column(name = "airplane_type_name")
    private String airplaneTypeName;
    @Column(name = "max_seats")
    private int maxSeats;
    @Column(name = "company")
    private String company;


    @OneToMany(mappedBy = "airplaneTypeName")
    private List<Airplane> airplanes;
}
