package Ch3AssignmentB;

public class Seats {
    int nrSeats;

    public Seats(int nrSeats) {
        this.nrSeats = nrSeats;
    }

    public int getNrSeats() {
        return nrSeats;
    }

    public void setNrSeats(int nrSeats) {
        this.nrSeats = nrSeats;
    }

    public void carType(){
        String carT;
        if(nrSeats==4){
            carT = "sedan";
        }
        else if(nrSeats > 4){
            carT ="truck";
        }

    }
}
