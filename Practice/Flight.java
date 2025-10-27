public class Flight {
    private String airlineName;
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;

    public Flight(String airlineName, String flightNumber, String departureCity, String arrivalCity) {
        this.airlineName = airlineName;
        this.flightNumber = flightNumber;
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
    }

    public String setAirlineName(String airlineName) {
        this.airlineName = airlineName;
        return airlineName;
    }

    public String setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
        return flightNumber;
    }

    public String setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
        return departureCity;
    }

    public String setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
        return arrivalCity;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public String toString() {
        return "Airline Name: " + getAirlineName() + "\nFlight Number: " + getFlightNumber() + 
               "\nDeparture City: " + getDepartureCity() + "\nArrival City: " + getArrivalCity();
    }
}