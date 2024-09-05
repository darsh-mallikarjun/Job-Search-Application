package com.application.job.company.service;

import java.util.List;

import com.application.job.company.Company;

public interface CompanyService {
	
	List<Company> getAllCompanies();//abstract method 
	
	boolean updateCompany(Company company,Long id);
	void createCompany(Company company);
	boolean deleteCompantById(Long id);
	Company getCompanyById(Long id);


}
