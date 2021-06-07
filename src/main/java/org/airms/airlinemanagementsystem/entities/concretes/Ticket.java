package org.airms.airlinemanagementsystem.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.airms.airlinemanagementsystem.entities.compositeKey.TicketId;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(TicketId.class)
public class Ticket {

    @Id
    private String passportNumber;
    @Id
    private String flightNumber;
    @Id
    private String fareCode;
    @Id
    private LocalDate date;
    private int usedMilePoints;
    private int ticketPrice;
}
