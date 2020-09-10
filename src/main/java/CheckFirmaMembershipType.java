public class CheckFirmaMembershipType {
    public static void checkFirmaMembershipType(Firma firma) throws MembershipTypeException {
        if (!(firma.getMembershipTypeSms().toString().contains("Sms"))) {
            switch (firma.getLanguage()) {
                case "TR":
                    throw new MembershipTypeException("Sms paketi seçmelisiniz.");
                case "ENG":
                    throw new MembershipTypeException("Please select sms subscription");
                case "FR":
                    throw new MembershipTypeException("Veuillez sélectionner un abonnement SMS");
                default:
                    throw new MembershipTypeException("Seçilen dil desteklenmemektedir.");
            }
        }
        if (!(firma.getMembershipTypeEmail().toString().contains("Email"))) {
            switch (firma.getLanguage()) {
                case "TR":
                    throw new MembershipTypeException("Email paketi seçmelisiniz.");
                case "ENG":
                    throw new MembershipTypeException("Please select Email subscription");
                case "FR":
                    throw new MembershipTypeException("Veuillez sélectionner un abonnement Email");
                default:
                    throw new MembershipTypeException("Seçilen dil desteklenmemktedir.");
            }

        }
    }
}

