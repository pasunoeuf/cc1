
class TicketBooking {
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    public TicketBooking(String movieTitle, String seatNumber, String snackCombo) {
        this.movieTitle = movieTitle;
        this.seatNumber = seatNumber;
        this.snackCombo = snackCombo;
    }

    @Override
    public String toString() {
        return "Ticket for " + movieTitle + " at seat " + seatNumber + " with " + snackCombo;
    }
}


class TicketBookingBuilder {
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    public TicketBookingBuilder setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
        return this;
    }

    public TicketBookingBuilder setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
        return this;
    }

    public TicketBookingBuilder setSnackCombo(String snackCombo) {
        this.snackCombo = snackCombo;
        return this;
    }

    public TicketBooking build() {
        return new TicketBooking(movieTitle, seatNumber, snackCombo);
    }
}
