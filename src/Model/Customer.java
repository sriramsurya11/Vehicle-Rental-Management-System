package Model;

public class Customer {
    private int Aadhar_num;
    private int licence_num;
    private int mobile_num;
    private String name;
    
    public int getAadharNum() {
        return Aadhar_num;
    }
    
    public void setAadharNum(int aadharNum) {
        this.Aadhar_num = aadharNum;
    }
    
    public int getLicenceNum() {
        return licence_num;
    }
    
    public void setLicenceNum(int licenceNum) {
        this.licence_num = licenceNum;
    }
    
    public int getMobileNum() {
        return mobile_num;
    }
    
    public void setMobileNum(int mobileNum) {
        this.mobile_num = mobileNum;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    private String email;

    public Customer(int AadharNum, int licenceNum, int mobileNum, String name, String email) {
        this.Aadhar_num = AadharNum;
        this.licence_num = licenceNum;
        this.mobile_num = mobileNum;
        this.name = name;
        this.email = email;
    }
}
