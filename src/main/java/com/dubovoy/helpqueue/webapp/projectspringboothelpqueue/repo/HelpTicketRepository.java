package com.dubovoy.helpqueue.webapp.projectspringboothelpqueue.repo;

import com.dubovoy.helpqueue.webapp.projectspringboothelpqueue.model.HelpTicket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HelpTicketRepository extends JpaRepository<HelpTicket, Long> {

}