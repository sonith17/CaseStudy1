package caseStudyV1_1;

abstract public class Vehicle
{
    protected int VehicleSpace;
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
    void ChargeVehicle(int z1,int c)
    {
        this.BillPayed -= (long)z1*c;
    }
}
// what about payment options?
