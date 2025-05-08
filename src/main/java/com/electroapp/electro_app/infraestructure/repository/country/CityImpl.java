package com.electroapp.electro_app.infraestructure.repository.country;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;


import com.electroapp.electro_app.aplication.services.ICityService;
import com.electroapp.electro_app.domain.entities.City;

@Service
public class CityImpl implements ICityService {

    @Override
    public List<City> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Optional<City> findById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public City save(City city) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public Optional<City> update(Long id, City city) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Optional<City> delete(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }


}
