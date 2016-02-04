package com.jacksai.cosher.model;


import org.joda.time.LocalDate;

import java.util.Set;

public class NightOut {

    private LocalDate date;
    private Set<Person> participants;

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
}
