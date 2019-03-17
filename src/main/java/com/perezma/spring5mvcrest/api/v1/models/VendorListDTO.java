package com.perezma.spring5mvcrest.api.v1.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorListDTO {

    List<VendorDTO> vendors;
}
