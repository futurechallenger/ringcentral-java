package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallerIdPhoneInfo
{
    // Internal identifier of a phone number
    public String id;
    public CallerIdPhoneInfo id(String id) {
        this.id = id;
        return this;
    }
    // Link to a phone number resource
    public String uri;
    public CallerIdPhoneInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Phone number in E.164 (with '+' sign) format
    public String phoneNumber;
    public CallerIdPhoneInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
