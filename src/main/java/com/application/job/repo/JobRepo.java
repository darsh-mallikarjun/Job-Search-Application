package com.application.job.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.application.job.model.Job;

public interface JobRepo extends JpaRepository<Job,Long> {

}
