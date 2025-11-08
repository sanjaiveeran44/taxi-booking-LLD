public class Customer{
    private int customerId;
    private char PickUpPoint;
    private char DropPoint;
    private int PickupTime;

    public Customer(int customerId, char pickUpPoint, char dropPoint, int pickupTime) {
        this.customerId = customerId;
        PickUpPoint = pickUpPoint;
        DropPoint = dropPoint;
        PickupTime = pickupTime;
    }

    public int getCustomerId(){
        return customerId;
    }
    public char getPickUpPoint(){
        return PickUpPoint;
    }
    public char getDropPoint(){
        return DropPoint;
    }
    public int getPickupTime(){ 
        return PickupTime;
    }
    
    public void setPickUpPoint(char pickUpPoint){
        PickUpPoint = pickUpPoint;
    }
    public void setDropPoint(char dropPoint){
        DropPoint = dropPoint;
    }
    public void setPickupTime(int pickupTime){
        PickupTime = pickupTime;
    }

}