package Model;

public class Customer {
    private int Customer_id;
    private String Customer_name;
    private int cus_license_num;
    private int mobile_num;
    public Customer(int customerId, String customerName, int cusLicenseNum, int mobileNum) {
        Customer_id = customerId;
        Customer_name = customerName;
        cus_license_num = cusLicenseNum;
        mobile_num = mobileNum;
    }

    public int getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(int customer_id) {
        Customer_id = customer_id;
    }

    public String getCustomer_name() {
        return Customer_name;
    }

    public void setCustomer_name(String customer_name) {
        Customer_name = customer_name;
    }

    public int getCus_license_num() {
        return cus_license_num;
    }

    public void setCus_license_num(int cus_license_num) {
        this.cus_license_num = cus_license_num;
    }

    public int getMobile_num() {
        return mobile_num;
    }

    public void setMobile_num(int mobile_num) {
        this.mobile_num = mobile_num;
    }
}
