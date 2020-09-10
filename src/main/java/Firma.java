public class Firma {
    private String sender;
    private String email;
    private String phone;
    private String message;
    private MembershipType membershipTypeSms;
    private MembershipType membershipTypeEmail;
    private int gonderilenSmsSayisi;
    private int gonderilenEmailSayisi;
    private double billSum;
    private String language;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender.replaceAll("[+=*^% ]", ".");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message.replaceAll("[+=*^%]", "-");
    }

    public int getGonderilenSmsSayisi() {
        return gonderilenSmsSayisi;
    }

    public void setGonderilenSmsSayisi(int gonderilenSmsSayisi) {
        this.gonderilenSmsSayisi = gonderilenSmsSayisi;
    }

    public int getGonderilenEmailSayisi() {
        return gonderilenEmailSayisi;
    }

    public void setGonderilenEmailSayisi(int gonderilenEmailSayisi) {
        this.gonderilenEmailSayisi = gonderilenEmailSayisi;
    }

    public double getBillSum() {
        return billSum;
    }

    public void setBillSum(double billSum) {
        this.billSum = billSum;
    }


    public MembershipType getMembershipTypeSms() {
        return membershipTypeSms;
    }

    public void setMembershipTypeSms(MembershipType membershipTypeSms) {
        this.membershipTypeSms = membershipTypeSms;
    }

    public MembershipType getMembershipTypeEmail() {
        return membershipTypeEmail;
    }

    public void setMembershipTypeEmail(MembershipType membershipTypeEmail) {
        this.membershipTypeEmail = membershipTypeEmail;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
