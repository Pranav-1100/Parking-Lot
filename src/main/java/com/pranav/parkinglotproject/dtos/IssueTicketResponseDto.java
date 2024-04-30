package com.pranav.parkinglotproject.dtos;

import com.pranav.parkinglotproject.Models.Ticket;

public class IssueTicketResponseDto {
    private Ticket Ticket;
    private ResponseStatus ResponseStatus;

    public Ticket getTicket() {
        return Ticket;
    }

    public void setTicket(Ticket ticket) {
        this.Ticket = ticket;
    }


    public ResponseStatus getResponseStatus() {
        return ResponseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.ResponseStatus = responseStatus;
    }
}
