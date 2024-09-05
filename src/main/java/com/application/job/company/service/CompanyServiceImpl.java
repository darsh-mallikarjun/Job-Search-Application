package com.application.job.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.application.job.company.Company;
import com.application.job.company.repo.CompanyRepo;

public class CompanyServiceImpl implements CompanyService{
	
	
   @Autowired
	private CompanyRepo companyRepository;
	//initialzie the CompanyRepository
	
	@Override
	public List<Company> getAllCompanies() {
		return companyRepository.findAll();
	}

	@Override
	public boolean updateCompany(Company company, Long id) {
		Optional<Company> companyOptional=companyRepository.findById(id);
		
		if(companyOptional.isPresent()) {
			Company company1=companyOptional.get();		
			company1.setName(company.getName());
			company1.setDescription(company.getDescription());
			company1.setJobs(company.getJobs());
			
	
			companyRepository.save(company1);
			return true;
		}
	
	return false;
		
	}

	@Override
	public void createCompany(Company company) {
		companyRepository.save(company);
	}

	@Override
	public boolean deleteCompantById(Long id) {
		if(companyRepository.existsById(id)) {
		companyRepository.deleteById(id);
		return true;
		}
		return false;
	}

	@Override
	public Company getCompanyById(Long id) {
		return companyRepository.findById(id).orElse(null);
	}


}
