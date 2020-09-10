import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws MembershipTypeException {
        Sms sms = new Sms();

        Firma firma = new Firma();

        firma.setSender("Trendyol");
        firma.setEmail("bootcamp@trendyol.com");
        firma.setPhone("01234567890");
        firma.setMessage("Hello!");
        firma.setLanguage(Language.ENG.toString());
        firma.setMembershipTypeSms(new SmsSabitKotaliMembershipType());
        firma.setMembershipTypeEmail(new EmailSabitKotaliMembershipType());
        CheckFirmaMembershipType.checkFirmaMembershipType(firma);


        Email email = new Email();
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer1 = new Customer(7547574363L, "customer", "customer@email.com", "01234567892",true);
        Customer customer2 = new Customer(2434324244L, "customer2", "customer2@email.com", "01234567891",true);
        customers.add(customer1);
        customers.add(customer2);
        for(int i= 0;i<3002; i++) {
            email.sendEmail(firma, customers);
            sms.sendSms(firma, customers);
        }
        ApplyBill.applyBill(firma);

    }
}