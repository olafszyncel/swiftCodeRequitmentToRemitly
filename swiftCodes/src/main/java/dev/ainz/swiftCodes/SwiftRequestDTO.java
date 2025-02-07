package dev.ainz.swiftCodes;

import org.bson.types.ObjectId;

import java.util.Locale;

public class SwiftRequestDTO {
    private String address;
    private String BankName;
    private String countryISO2;
    private String countryName;
    private boolean isHeadquarter;
    private String swiftCode;

    public SwiftRequestDTO() {
    }

    public SwiftRequestDTO(String address, String countryISO2, String countryName, String BankName, String swiftCode, boolean headquarter) {
        this.address = address;
        this.countryISO2 = countryISO2;
        this.countryName = countryName;
        this.BankName = BankName;
        this.swiftCode = swiftCode;
        this.isHeadquarter = isHeadquarter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getCountryISO2() {
        return countryISO2;
    }

    public void setCountryISO2(String countryISO2) {
        this.countryISO2 = countryISO2;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public boolean isHeadquarter() {return isHeadquarter;}

}