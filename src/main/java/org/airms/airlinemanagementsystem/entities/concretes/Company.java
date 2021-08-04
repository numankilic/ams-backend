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
@Table(name = "company")
public class Company {
    @Id
    @Column(name = "company_id")
    private String companyId;
    @Column(name = "company_name")
    private String companyName;


}
