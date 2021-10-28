package ru.netology.domain;

public class Ticket implements Comparable<Ticket> {
    private int id;
    private int price;
    private String departureAirport;
    private String arrivalAirport;
    private int timeDistance;

    public Ticket(int id, int price, String departureAirport, String arrivalAirport, int timeDistance) {
        this.id = id;
        this.price = price;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.timeDistance = timeDistance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(String arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public int getTimeDistance() {
        return timeDistance;
    }

    public void setTimeDistance(int timeDistance) {
        this.timeDistance = timeDistance;
    }

    @Override
    public int compareTo(Ticket o) {
        /* Если билет у которого вызвали метод compareTo дешевле чем тот которого передали через параметр,
        то возвращалось бы число меньше нуля, если же билет наоборот дороже, то число больше нуля, а если стоимость
        одинакова, то 0
         */
        if (this.price < o.getPrice()) return -1;
        if (this.price > o.getPrice()) return 1;
        return 0;
    }
}
