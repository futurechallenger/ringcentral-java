package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneNumberResource
{
    // Internal identifier of a phone number
    public String id;
    public PhoneNumberResource id(String id) {
        this.id = id;
        return this;
    }
    // Brief information on a phone number country
    public CountryResource country;
    public PhoneNumberResource country(CountryResource country) {
        this.country = country;
        return this;
    }
    // Information on an extension to which the phone number is assigned
    public ExtensionResource extension;
    public PhoneNumberResource extension(ExtensionResource extension) {
        this.extension = extension;
        return this;
    }
    // Custom user name of a phone number, if any. Supported for numbers assigned to Auto-Receptionist, with usage type 'CompanyNumber'
    public String label;
    public PhoneNumberResource label(String label) {
        this.label = label;
        return this;
    }
    // Location (City, State). Filled for local US numbers
    public String location;
    public PhoneNumberResource location(String location) {
        this.location = location;
        return this;
    }
    // Payment type. 'External' is returned for forwarded numbers which are not terminated in the RingCentral phone system = ['External', 'TollFree', 'Local'],
    public String paymentType;
    public PhoneNumberResource paymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    // Phone number
    public String phoneNumber;
    public PhoneNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Status of a phone number. If the value is 'Normal', the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral ,
    public String status;
    public PhoneNumberResource status(String status) {
        this.status = status;
        return this;
    }
    //
    public String usageType;
    public PhoneNumberResource usageType(String usageType) {
        this.usageType = usageType;
        return this;
    }
    // Type of a phone number
    public String type;
    public PhoneNumberResource type(String type) {
        this.type = type;
        return this;
    }
}
