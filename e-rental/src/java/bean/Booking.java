/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Plutonianaus
 */
public class Booking {

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the pickUpTime
     */
    public String getPickUpTime() {
        return pickUpTime;
    }

    /**
     * @param pickUpTime the pickUpTime to set
     */
    public void setPickUpTime(String pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    /**
     * @return the returnTime
     */
    public String getReturnTime() {
        return returnTime;
    }

    /**
     * @param returnTime the returnTime to set
     */
    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    /**
     * @return the bikeID
     */
    public String getBikeID() {
        return bikeID;
    }

    /**
     * @param bikeID the bikeID to set
     */
    public void setBikeID(String bikeID) {
        this.bikeID = bikeID;
    }

    /**
     * @return the bikeType
     */
    public String getBikeType() {
        return bikeType;
    }

    /**
     * @param bikeType the bikeType to set
     */
    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    /**
     * @return the duration
     */
    public String getDuration() {
        return duration;
    }

    /**
     * @param duration the duration to set
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }
    private String custName;
    private String pickUpTime;
    private String returnTime;
    private String bikeID;
    private String bikeType;
    private String duration;
    


    
    
}
