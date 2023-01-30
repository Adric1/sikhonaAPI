package com.demo.sikhonaAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<ProvinceModel, Integer> {

    List<ProvinceModel> findAll();
}
