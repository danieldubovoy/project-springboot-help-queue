package com.dubovoy.helpqueue.webapp.projectspringboothelpqueue.serv;

import com.dubovoy.helpqueue.webapp.projectspringboothelpqueue.model.HelpTicket;
import com.dubovoy.helpqueue.webapp.projectspringboothelpqueue.repo.HelpTicketRepository;
import com.dubovoy.helpqueue.webapp.projectspringboothelpqueue.utilities.BeanUtilities;
import org.springframework.stereotype.Component;



import java.util.List;

//@Service
@Component
public class HelpTicketServ {
    private HelpTicketRepository repo;

    public HelpTicketServ(HelpTicketRepository repo) {
        super();
        this.repo = repo;
    }

    public HelpTicket createTicket(HelpTicket helpticket) {
        return this.repo.save(helpticket);
    }

    public List<HelpTicket> getTicket() {
        return this.repo.findAll();
    }

    public HelpTicket getSingleTicket(Long id) {
        return this.repo.findById(id).get();
    }

    public boolean deleteTicket(long id) {
        this.repo.deleteById(id);
        return !this.repo.existsById(id);
    }

    public HelpTicket updateTicket(HelpTicket ticket, long id) {
        HelpTicket oldTicket = this.repo.findById(id).get();
        BeanUtilities.mergeNotNull(ticket, oldTicket);
        return this.repo.save(oldTicket);
    }

}