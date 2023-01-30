package com.demo.sikhonaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@JsonComponent
@RestController
public class Controller {
    @Autowired
    ProvinceRepository provinceRepo;

    @GetMapping("/provinces")
    public List<ProvinceModel> findAllProvinces(){
        List<ProvinceModel> provinceList = provinceRepo.findAll();
        return new ResponseEntity<>(provinceList, HttpStatus.OK).getBody();
    }

}
