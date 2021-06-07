package org.airms.airlinemanagementsystem.business.concretes;

import org.airms.airlinemanagementsystem.business.abstracts.TicketService;
import org.airms.airlinemanagementsystem.dataAccess.TicketDao;
import org.airms.airlinemanagementsystem.entities.concretes.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketManager implements TicketService {
    TicketDao ticketDao;

    @Autowired
    public TicketManager(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    @Override
    public List<Ticket> getAll() {
        return ticketDao.findAll();
    }
}
