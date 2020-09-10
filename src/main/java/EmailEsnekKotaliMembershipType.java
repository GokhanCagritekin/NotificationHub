public class EmailEsnekKotaliMembershipType implements MembershipType{
    private final int emailHakki = 2000;
    private final double baseBill = 7.5;
    private final double asimSonrasiUcret = 0.03;

    @Override
    public double calculateBill(Firma firma) {
        if(firma.getGonderilenEmailSayisi()>emailHakki){
            int asilanEmailSayisi = firma.getGonderilenEmailSayisi() - emailHakki;
            double ekUcret = asilanEmailSayisi * asimSonrasiUcret;
            return this.baseBill + ekUcret;
        }
        else{
            return baseBill;
        }
    }

    public int getEmailHakki() {
        return emailHakki;
    }

    public double getBaseBill() {
        return baseBill;
    }

    public double getAsimSonrasiUcret() {
        return asimSonrasiUcret;
    }
}
