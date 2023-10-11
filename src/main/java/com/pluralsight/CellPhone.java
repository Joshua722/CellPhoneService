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
        return this.serialNumber;
    }
    public String getPhoneModel(){
        return this.getPhoneModel();
    }
    public String getPhoneCarrier(){
        return this.getPhoneCarrier();
    }
    public String getPhoneNumber(){
        return this.getPhoneNumber();
    }
    public String getPhoneOwner(){
        return this.getPhoneOwner();
    }










}
