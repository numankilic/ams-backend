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
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "company_id")
    private String companyId;
    @Column(name = "company_name")
    private String companyName;

    @OneToMany(mappedBy = "company")
    private List<AirplaneType> airplaneTypes;
}
