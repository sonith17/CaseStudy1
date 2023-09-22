package caseStudyV1_1;

public class Slot
{
    boolean IsSlotEmpty;
    private int SlotIdX;
    int SlotSpace;
    int RemainingSpace;
    Slot(int SlotIdX, boolean IsSlotEmpty, int SlotSpace)
    {
        this.IsSlotEmpty = IsSlotEmpty;
        this.SlotIdX = SlotIdX;
        this.SlotSpace = SlotSpace;
        this.RemainingSpace=SlotSpace;
    }
    int getSlotId()
    {
        return SlotIdX;
    }
    void MakeSlotFree(int VehicleSpace)
    {
        this.RemainingSpace+=VehicleSpace;
        this.IsSlotEmpty=true;
    }
}
