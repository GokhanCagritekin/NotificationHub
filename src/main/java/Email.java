import java.util.List;

public class Email {

    // Do one thing!!
    public void sendEmail(Firma firma,List<Customer> customers) {
        for (Customer customer : customers) {
                System.out.printf("Send email to %s  \n", customer.getName());
                firma.setGonderilenEmailSayisi(firma.getGonderilenEmailSayisi() + 1 );
            }
        }
}