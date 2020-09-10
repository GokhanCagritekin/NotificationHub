public class SmsSabitKotaliMembershipType implements MembershipType{
    private final int smsHakki = 1000;
    private final int baseBill = 20;

    @Override
    public double calculateBill(Firma firma) {
        double doubleBillCount = ((firma.getGonderilenSmsSayisi()/smsHakki) + 1);
        int billCount = (int)doubleBillCount;
        return this.baseBill * billCount;
    }

    public int getSmsHakki() {
        return smsHakki;
    }

    public int getBaseBill() {
        return baseBill;
    }
}
