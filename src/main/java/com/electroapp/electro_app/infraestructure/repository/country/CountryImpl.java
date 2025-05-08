package com.electroapp.electro_app.infraestructure.repository.country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.electroapp.electro_app.aplication.services.ICountryService;
import com.electroapp.electro_app.domain.entities.Country;

import org.springframework.transaction.annotation.Transactional;

@Service
public class CountryImpl implements ICountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Country> findAll() {
        return (List<Country>)countryRepository.findAll();
    }
    @Override
    public Optional<Country> findById(Long id) {

        return countryRepository.findById(id);
    }

    @Override
    public Country save(Country country) {
       return countryRepository.save(country);
    }

    @Override
    public Optional<Country> update(Long id, Country country) {
      Optional<Country> countryOptional = countryRepository.findById(id);
        if (countryOptional.isPresent()) {
            Country countryDb = countryOptional.orElseThrow();
            countryDb.setName(country.getName());
            return Optional.of(countryRepository.save(countryDb));
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Country> delete(Long id) {
        Optional<Country> countryOptional = countryRepository.findById(id);
        countryOptional.ifPresent(countryDb -> {
            countryRepository.delete(countryDb);
        });
        return countryOptional;
    }
}
