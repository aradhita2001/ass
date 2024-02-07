package com.example.flight.entity;

public class Flight {
    private long flightNo;
    private String departure;
    private String arival;
    private String date;
    private int setsAvailable;

    public Flight() {
    }

    public Flight(long flightNo, String departure, String arival, String date, int setsAvailable) {
        this.flightNo = flightNo;
        this.departure = departure;
        this.arival = arival;
        this.date = date;
        this.setsAvailable = setsAvailable;
    }

    public long getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(long flightNo) {
        this.flightNo = flightNo;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArival() {
        return arival;
    }

    public void setArival(String arival) {
        this.arival = arival;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSetsAvailable() {
        return setsAvailable;
    }

    public void setSetsAvailable(int setsAvailable) {
        this.setsAvailable = setsAvailable;
    }
}
