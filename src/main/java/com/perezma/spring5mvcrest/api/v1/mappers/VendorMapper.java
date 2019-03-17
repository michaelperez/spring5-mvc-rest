package com.perezma.spring5mvcrest.api.v1.mappers;

import com.perezma.spring5mvcrest.api.v1.models.VendorDTO;
import com.perezma.spring5mvcrest.domains.Vendor;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VendorMapper {

    VendorMapper INSTANCE = Mappers.getMapper(VendorMapper.class);

    VendorDTO vendorToVendorDTO(Vendor vendor);

    Vendor vendorDTOToVendor(VendorDTO vendorDTO);
}
