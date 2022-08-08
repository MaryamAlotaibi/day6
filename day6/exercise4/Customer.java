import java.util.Date;

public class Customer {
    private String name;
    private boolean member= false;
    private String memberType;
 public Customer(String name) {

 }

    public String getName() {
        return name;
    }
    public boolean isMember(){

        return false;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }
}

public class Visit extends Customer {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(String name) {
        super(name);
    }

    public void Visit(String name, Date date) {

    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        double TotalExpense = 0;
        return TotalExpense;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
    public class DiscountRate {

        private static double serviceDiscountPremium = 0.2;
        private static double serviceDiscountGold = 0.15;
        private static double serviceDiscountSilver = 0.1;
        private static double productDiscountPremium = 0.1;
        private static double productDiscountGold = 0.1;
        private static double productDiscountSilver = 0.1;

        public static double getServiceDiscountRate(String type) {
            switch (type) {
                case "Premium":
                    return serviceDiscountPremium;
                case "Gold":
                    return serviceDiscountGold;
                case "Silver":
                    return serviceDiscountSilver;
                default:
                    throw new IllegalArgumentException("wrong service type specified");
            }
        }

        public static double getProductDiscountRate(String type) {
            switch (type) {
                case "Premium":
                    return productDiscountPremium;
                case "Gold":
                    return productDiscountGold;
                case "Silver":
                    return productDiscountSilver;
                default:
                    throw new IllegalArgumentException("wrong service type specified");
            }
        }

    }
    }


