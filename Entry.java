package caseStudyV1_1;

public class Entry extends Entries_Exits
{
    Entry(int id, boolean IsEmpty)
    {
        super(id, IsEmpty);
    }
    void CheckPayment(Vehicle v,int cost)
    {
        if(v.IsFeePayed)
        {
            v.IsFeePayed=false;
        }
        else
        {
            return;
        }
    }
    void prePaymentOptions()
    {
        System.out.println(" 1 To Card ");
        System.out.println(" 2 To attendant ");
        System.out.println(" 3 To Portal ");
        System.out.println(" -1 at exit ");
    }
    void PrePayment(long Advance,Vehicle V)
    {
        V.BillPayed=Advance;
    }
    void AssignInTime(Vehicle v)
    {
        v.InTime = System.currentTimeMillis();
    }
}