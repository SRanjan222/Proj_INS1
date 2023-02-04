package com.projins.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projins.model.IncomeDetails;

public interface IncomeDetailsRepo extends JpaRepository<IncomeDetails, Integer> {

}
