package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ForwardingNumberInfo
{
    // Internal identifier of a forwarding/call flip phone number
    public String id;
    public ForwardingNumberInfo id(String id) {
        this.id = id;
        return this;
    }
    // Canonical URI of a forwarding/call flip phone number
    public String uri;
    public ForwardingNumberInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Forwarding/Call flip phone number
    public String phoneNumber;
    public ForwardingNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Forwarding/Call flip number title
    public String label;
    public ForwardingNumberInfo label(String label) {
        this.label = label;
        return this;
    }
    // Type of option this phone number is used for. Multiple values are accepted
    public String features;
    public ForwardingNumberInfo features(String features) {
        this.features = features;
        return this;
    }
    // Number assigned to the call flip phone number, corresponds to the shortcut dial number
    public Long flipNumber;
    public ForwardingNumberInfo flipNumber(Long flipNumber) {
        this.flipNumber = flipNumber;
        return this;
    }
}
