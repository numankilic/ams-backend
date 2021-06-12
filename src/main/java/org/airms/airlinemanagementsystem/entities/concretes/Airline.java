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
@Table(name = "airline")
public class Airline {
    @Column(name = "company_id")
    private String companyId;
    @Column(name = "airline_name")
    private String airlineName;
    @Id
    @Column(name = "airlineId")
    private String airlineId;

    @OneToMany(mappedBy = "airline")
    private List<Flight> flights;
}
