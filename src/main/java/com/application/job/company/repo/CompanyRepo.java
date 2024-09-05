package com.application.job.company.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.job.company.Company;

@Repository
public interface CompanyRepo  extends JpaRepository<Company,Long>{

}
