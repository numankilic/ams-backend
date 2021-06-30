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
@Table(name = "airplane")
public class Airplane {
    @Id
    @Column(name = "airplane_id")
    private String airplaneId;
    @Column(name = "total_number_of_seats")
    private int numTotalSeats;
    @Column(name = "airplane_type")
    private String airplaneTypeName;
    @Column(name = "company_id")
    private String companyId;








}
