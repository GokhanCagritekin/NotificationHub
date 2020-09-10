import java.util.List;

public class Sms {

    // Do one thing!!
    public void sendSms(Firma firma , List<Customer> customers) {
        for (Customer customer : customers) {
                // send email process
                System.out.printf("Send sms to %s  \n", customer.getName());
                firma.setGonderilenSmsSayisi(firma.getGonderilenSmsSayisi()+1);
        }
    }

}