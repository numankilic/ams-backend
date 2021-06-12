package org.airms.airlinemanagementsystem.entities.concretes;

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
    private String flightNumber;
    @Id
    private String fareCode;
    private int amount;
    private String restrictions;

}
