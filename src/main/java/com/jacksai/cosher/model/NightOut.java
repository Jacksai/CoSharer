package com.jacksai.cosher.model;


import org.joda.time.LocalDate;

import java.util.HashSet;
import java.util.Set;

public class NightOut {

    private LocalDate date;
    private Set<Person> participants;
    private Set<Receipt> receipts = new HashSet<>();

    public NightOut(LocalDate date, Set<Person> participants) {
        this.date = date;
        this.participants = participants;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Set<Person> getParticipants() {
        return participants;
    }

    public void setParticipants(Set<Person> participants) {
        this.participants = participants;
    }

    public Set<Receipt> getReceipts() {
        return receipts;
    }

    public void setReceipts(Set<Receipt> receipts) {
        this.receipts = receipts;
    }

    public void addReceipt(Receipt receipt) {
        receipts.add(receipt);
    }
}
