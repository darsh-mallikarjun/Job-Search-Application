package com.application.job.service;

import java.util.List;

import com.application.job.model.Job;

public interface JobService {
	

	List<Job> findALL();
	void createaJob(Job job);
	Job getJobByid(Long id);
	boolean deleteJobById(Long id);
	
	boolean updateJob(Long id, Job updatedJob);

}
