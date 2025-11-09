import java.util.List;


public class Taxi{
    private int taxiId;
    private char currentLocation;
    private int earning;
    private int freeTime;
    private List<Booking> booking;

    public Taxi(int taxiId){
        this.taxiId = taxiId;
        this.currentLocation = 'A';
        this.earning = 0;
        this.freeTime = 0;
        this.booking = new ArrayList<>();
    }

    public boolean isAvailableNow(char pickupPoint, char pickupTime){
        int timeDiff = Math.abs(pickupPoint - currentLocation);
        return freeTime + timeDiff <= pickupTime;
    }

    public assignBooking(Booking booking){
        this.booking.add(booking);
    }
        

    public int getTaxiId(){
        return taxiId;
    }
    public char getCurrentLocation(){
        return currentLocation;
    }
    public int getEarning(){
        return earning;
    }
    public int getFreeTime(){
        return freeTime;
    }
    public List<Booking> getBooking(){
        return booking;
    }

    public void setCurrentLocation(char currentLocation){
        this.currentLocation = currentLocation;
    }
    public void setEarning(int earning){
        this.earning = earning;
    }
    public void setFreeTime(int setFreeTime){
        this.freeTime = freeTime;
    }
    public void setBooking(List<Booking> booking){
        this.booking = booking;
    }


}