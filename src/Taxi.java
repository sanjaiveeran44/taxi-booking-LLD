import java.util.List;


public class Taxi{
    private int taxiId;
    private char currentLocation;
    private int earning;
    private boolean isAvailable;
    private int freeTime;
    private List<Booking> booking;

    public Taxi(int taxiId, char currentLocation, int earning, boolean isAvailable, int freeTime, List<Booking> booking){
        this.taxiId = taxiId;
        this.currentLocation = currentLocation;
        this.earning = earnin;
        this.isAvailable = isAvailable;
        this.freeTime = freeTime;
        this.booking = booking;
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
    public boolean getIsAvailable(){
        return isAvailable;
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
    public void setIsAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
    public void setFreeTime(int setFreeTime){
        this.freeTime = freeTime;
    }
    public void setBooking(List<Booking> booking){
        this.booking = booking;
    }


}