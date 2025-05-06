package com.electroapp.electro_app.infraestructure.repository.country;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.electroapp.electro_app.domain.entities.City;

public interface CityRepository extends JpaRepository<City, Long> {


}