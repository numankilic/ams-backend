package org.airms.airlinemanagementsystem.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "airline")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Airline {
    @Column(name = "company_id")
    private String companyId;
    @Column(name = "airline_name")
    private String airlineName;
    @Id
    @Column(name = "airlineId")
    private String airlineId;


}
