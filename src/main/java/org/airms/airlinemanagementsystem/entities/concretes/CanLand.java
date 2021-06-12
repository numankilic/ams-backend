package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.airms.airlinemanagementsystem.entities.compositeKey.CanLandId;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "can_land")
@IdClass(CanLandId.class)
public class CanLand {
    @Id
    @Column(name = "airplane_type_name")
    private String airplaneTypeName;
    @Id
    @Column(name = "airport_code")
    private String airportCode;







}
