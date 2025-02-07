package dev.ainz.swiftCodes;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Interns_2025_SWIFT_CODES")
public class Swift {
    @Id
    private ObjectId id;
    private String address;
    private String codeType;
    private String countryIso2Code;
    private String countryName;
    private String name;
    private String swiftCode;
    private String timeZone;
    private String townName;


    public Swift() {
    }

    public Swift(String address, String bankName, String countryISO2, String countryName, String swiftCode) {
        this.address = address;
        this.name = bankName;
        this.countryIso2Code = countryISO2;
        this.countryName = countryName;
        this.swiftCode = swiftCode;
    }

    // Getters and Setters
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getCountryIso2Code() {
        return countryIso2Code;
    }

    public void setCountryIso2Code(String countryIso2Code) {
        this.countryIso2Code = countryIso2Code;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSwiftCode() {
        return swiftCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

}