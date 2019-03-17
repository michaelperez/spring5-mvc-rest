package com.perezma.spring5mvcrest.api.v1.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class VendorDTO {

    private String name;

    @JsonProperty("vendor_url")
    private String vendorUrl;
}
