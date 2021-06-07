package org.airms.airlinemanagementsystem.dataAccess;

import org.airms.airlinemanagementsystem.entities.compositeKey.TicketId;
import org.airms.airlinemanagementsystem.entities.concretes.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDao extends JpaRepository<Ticket, TicketId> {
}
