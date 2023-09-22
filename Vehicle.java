package caseStudyV1_1;

abstract public class Vehicle
{
    int VehicleSpace;
    int AllocatedParkingLot;
    long InTime;
    long OutTime;
    long BillPayed;
    boolean IsFeePayed;
    String OwnerName;
    String PaymentMethod;
    void PayFee()
    {
        IsFeePayed = true;
    }
    int getVehicleSpace()
    {
        return VehicleSpace;
    }
}
// what about payment options?