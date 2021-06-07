package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.entities.concretes.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAll();
}
