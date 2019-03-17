package com.perezma.spring5mvcrest.services;

import com.perezma.spring5mvcrest.api.v1.mappers.VendorMapper;
import com.perezma.spring5mvcrest.api.v1.models.VendorDTO;
import com.perezma.spring5mvcrest.repositories.VendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorServiceImpl implements VendorService {

    private final VendorMapper vendorMapper;

    private final VendorRepository vendorRepository;

    public VendorServiceImpl(VendorMapper vendorMapper, VendorRepository vendorRepository) {
        this.vendorMapper = vendorMapper;
        this.vendorRepository = vendorRepository;
    }


    @Override
    public List<VendorDTO> getAllVendors() {
        return null;
    }

    @Override
    public VendorDTO getVendorById(Long id) {
        return null;
    }

    @Override
    public VendorDTO createNewVendor(VendorDTO vendorDTO) {
        return null;
    }

    @Override
    public VendorDTO saveVendorByDTO(Long id, VendorDTO vendorDTO) {
        return null;
    }

    @Override
    public VendorDTO patchVendor(Long id, VendorDTO vendorDTO) {
        return null;
    }

    @Override
    public void deleteVendorById(Long id) {

    }
}
