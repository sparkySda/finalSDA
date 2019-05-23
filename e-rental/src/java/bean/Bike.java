/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;
import java.io.Serializable;
/**
 *
 * @author Plutonianaus
 */
public class Bike {
    private int bikeID;
    private double bikePrice;
    private String bikeType;
    private String bikeStatus;

    /**
     * @return the bikeID
     */
    public int getBikeID() {
        return bikeID;
    }

    /**
     * @param bikeID the bikeID to set
     */
    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }
    
        public String getBikeStatus() {
        return bikeStatus;
    }

    /**
     * @param bikeStatus
     */
    public void setBikeStatus(String bikeStatus) {
        this.bikeStatus = bikeStatus;
    }

    /**
     * @return the bikePrice
     */
    public double getBikePrice() {
        return bikePrice;
    }

    /**
     * @param bikePrice the bikePrice to set
     */
    public void setBikePrice(double bikePrice) {
        this.bikePrice = bikePrice;
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
    
    
}
