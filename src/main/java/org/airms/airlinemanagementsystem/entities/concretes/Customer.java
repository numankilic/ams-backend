package org.airms.airlinemanagementsystem.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "customer_phone")
    private String customerPhone;
    @Column(name = "adress")
    private String address;
    @Column(name = "country")
    private String country;
    @Column(name = "e_mail")
    private String eMail;

    @Column(name = "passport_number")
    @Id
    private String passportNumber;



}
