public class SmsEsnekKotaliMembershipType implements MembershipType{
    private boolean smsMi = true;
    private final int smsHakki = 2000;
    private final int baseBill = 30;
    private final double asimSonrasiUcret = 0.1;

    @Override
    public double calculateBill(Firma firma) {
        if(firma.getGonderilenSmsSayisi()>smsHakki){
            int asilanSmsSayisi = firma.getGonderilenSmsSayisi() - smsHakki;
            double ekUcret = asilanSmsSayisi * asimSonrasiUcret;
            return this.baseBill + ekUcret;
        }
        else{
            return this.baseBill;
        }
    }

    public int getBaseBill(){
        return baseBill;
    }

    public int getSmsHakki() {
        return smsHakki;
    }

    public double getAsimSonrasiUcret() {
        return asimSonrasiUcret;
    }

    public boolean isSmsMi() {
        return smsMi;
    }

    public void setSmsMi(boolean smsMi) {
        this.smsMi = smsMi;
    }
}
