public class EmailSabitKotaliMembershipType implements MembershipType {
    private final int emailHakki = 1000;
    private final int baseBill = 10;

    @Override
    public double calculateBill(Firma firma) {
        double doubleBillCount = ((firma.getGonderilenEmailSayisi()/emailHakki) + 1);
        int billCount = (int)doubleBillCount;
        return this.baseBill * billCount;
    }

    public int getEmailHakki() {
        return emailHakki;
    }

    public int getBaseBil() {
        return baseBill;
    }
}
