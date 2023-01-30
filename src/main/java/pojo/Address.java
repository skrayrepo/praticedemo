package pojo;

public class Address {

    private String address1;
    private String address2;
    private String district;
    private String state;
    private Integer pinCode;
    private Long phoneNumer;


    public Address(String address1, String address2, String district, String state, Integer pinCode, Long phoneNumer) {
        this.address1 = address1;
        this.address2 = address2;
        this.district = district;
        this.state = state;
        this.pinCode = pinCode;
        this.phoneNumer = phoneNumer;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPinCode() {
        return pinCode;
    }

    public void setPinCode(Integer pinCode) {
        this.pinCode = pinCode;
    }

    public Long getPhoneNumer() {
        return phoneNumer;
    }

    public void setPhoneNumer(Long phoneNumer) {
        this.phoneNumer = phoneNumer;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                ", phoneNumer=" + phoneNumer +
                '}';
    }
}
