package project.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import project.HRMS.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

	JobSeeker findJobSeekerByNationalId(String nationalId);
	
}
