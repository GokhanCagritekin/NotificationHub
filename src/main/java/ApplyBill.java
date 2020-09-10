public class ApplyBill {
    public static double applyBill(Firma firma){
        System.out.println("Gönderilen sms sayisi: " + firma.getGonderilenSmsSayisi());
        System.out.println("Sms ücreti: " + firma.getMembershipTypeSms().calculateBill(firma));
        System.out.println("Gönderilen email sayisi: " + firma.getGonderilenEmailSayisi());
        System.out.println("Email ücreti: " + firma.getMembershipTypeEmail().calculateBill(firma));
        firma.setBillSum(firma.getBillSum() + firma.getMembershipTypeSms().calculateBill(firma) + firma.getMembershipTypeEmail().calculateBill(firma));

        System.out.println("Toplam ücret: " + firma.getBillSum());
       return firma.getBillSum();
    }
}
