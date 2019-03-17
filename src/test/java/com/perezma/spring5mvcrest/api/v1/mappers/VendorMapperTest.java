package com.perezma.spring5mvcrest.api.v1.mappers;

import com.perezma.spring5mvcrest.api.v1.models.VendorDTO;
import com.perezma.spring5mvcrest.domains.Vendor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendorMapperTest {

    public static final String NAME = "High Garden Fruit Company";
    public static final String VENDOR_URL = "http://www.highgardenfruits.com";

    VendorMapper vendorMapper = VendorMapper.INSTANCE;

    @Test
    public void vendorToVendorDTO() throws Exception {
        //given
        Vendor vendor = new Vendor();
        vendor.setName(NAME);
        vendor.setVendorUrl(VENDOR_URL);

        //when
        VendorDTO vendorDTO = vendorMapper.vendorToVendorDTO(vendor);

        //then
        assertEquals(NAME, vendorDTO.getName());
        assertEquals(VENDOR_URL, vendorDTO.getVendorUrl());
    }

    @Test
    public void vendorDTOToVendor() throws Exception {
        //given
        VendorDTO vendorDTO = new VendorDTO();
        vendorDTO.setName(NAME);
        vendorDTO.setVendorUrl(VENDOR_URL);

        //when
        Vendor vendor = vendorMapper.vendorDTOToVendor(vendorDTO);

        //then
        assertEquals(NAME, vendor.getName());
        assertEquals(VENDOR_URL, vendor.getVendorUrl());
    }
}
