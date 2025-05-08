package com.electroapp.electro_app.infraestructure.utils.validations;


import org.springframework.beans.factory.annotation.Autowired;

import com.electroapp.electro_app.aplication.services.ICountryService;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ExistsbyCountrynameValidation implements ConstraintValidator<ExistsByCountryname, String> {

    @Autowired
    private ICountryService countryService;

    @Override
    public boolean isValid(String countryName, ConstraintValidatorContext context) {
        
        if (countryName == null)  {
            return true; 
        }
        return countryService.ExistsByCountryname(countryName);
    }


}
