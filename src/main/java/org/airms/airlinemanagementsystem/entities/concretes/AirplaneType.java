package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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



}
