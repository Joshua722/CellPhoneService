package com.pluralsight;

public class CellPhone {

    //declare private data
    private int serialNumber;
    private String phoneModel;
    private String phoneCarrier;
    private String phoneNumber;
    private String phoneOwner;

    public CellPhone(){
      serialNumber = 0;
      phoneModel = " ";
      phoneCarrier = " ";
      phoneNumber = " ";
      phoneOwner = " ";
    }
    public CellPhone(int serialNumber, String phoneModel, String phoneCarrier, String phoneNumber, String phoneOwner){
        this.serialNumber = serialNumber;
        this.phoneModel = phoneModel;
        this.phoneCarrier = phoneCarrier;
        this.phoneNumber = phoneNumber;
        this.phoneOwner = phoneOwner;
    }
    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setPhoneModel(String phoneModel){
        this.phoneModel = phoneModel;
    }
    public void setPhoneCarrier(String phoneCarrier){
        this.phoneCarrier = phoneCarrier;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setPhoneOwner(String phoneOwner){
        this.phoneOwner = phoneOwner;
    }
    public int getSerialNumber(){
        return serialNumber;
    }
    public String getPhoneModel(){
        return phoneModel;
    }
    public String getPhoneCarrier(){
        return phoneCarrier;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getPhoneOwner(){
        return phoneOwner;
    }
    public void dial(String phoneNumber){
        this.phoneNumber = phoneNumber;

    }










}
