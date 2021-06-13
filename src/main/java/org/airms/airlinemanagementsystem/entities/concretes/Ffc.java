package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ffc")
public class Ffc{
    private String passportNumber;
    @Id
    private String ffcId;
    private int totalMiles;
    private int milePoints;
    private String category;
}
