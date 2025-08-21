package com.wipro.firstboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.firstboot.repo.CityRepo;
import com.wipro.firstboot.service.CityService;
@Service
public class CityServiceImpl implements CityService {
	@Autowired
    CityRepo cityRepo;
 
    @Override
    public List<String> fetchCities() {
        return cityRepo.getCities();
    }

}
