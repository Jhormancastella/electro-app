package com.electroapp.electro_app.infraestructure.repository.country;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;


import com.electroapp.electro_app.aplication.services.ICityService;
import com.electroapp.electro_app.domain.entities.City;
import com.electroapp.electro_app.domain.entities.Country;

@Service
public class CityImpl implements ICityService {

    @Override
    public List<Country> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<City> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public Country save(Country country) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<Country> update(Long id, Country country) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Optional<Country> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    }
