package com.perezma.spring5mvcrest.services;

import com.perezma.spring5mvcrest.api.v1.models.VendorDTO;

import java.util.List;

public interface VendorService {

    List<VendorDTO> getAllVendors();

    VendorDTO getVendorById(Long id);

    VendorDTO createNewVendor(VendorDTO vendorDTO);

    VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO);

    VendorDTO patchVendor(Long id, VendorDTO vendorDTO);

    void deleteVendorById(Long id);

}
