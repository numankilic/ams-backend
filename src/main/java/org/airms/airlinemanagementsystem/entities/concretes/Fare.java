package org.airms.airlinemanagementsystem.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.airms.airlinemanagementsystem.entities.compositeKey.FareId;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fare")
@IdClass(FareId.class)
public class Fare {


    @Id
    private String fareCode;
    @Id
    private String flightNumber;
    private int amount;
    private String restrictions;



}
