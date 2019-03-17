package com.perezma.spring5mvcrest.controllers.v1;

import com.perezma.spring5mvcrest.services.VendorService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(VendorController.BASE_URL)
public class VendorController {

    public static final String BASE_URL = "/api/v1/vendors";

    private final VendorService vendorService;


    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }


}
