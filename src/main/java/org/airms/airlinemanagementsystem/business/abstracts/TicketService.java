package org.airms.airlinemanagementsystem.business.abstracts;

import org.airms.airlinemanagementsystem.core.utilities.results.DataResult;
import org.airms.airlinemanagementsystem.entities.concretes.Ticket;

import java.util.List;

public interface TicketService {
    DataResult<List<Ticket>> getAll();
}
