package com.example.ImportStaffingTrackerService.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ImportStaffingTrackerService.Model.StaffingTracker;

public interface StaffingTrackerRepository extends CrudRepository<StaffingTracker, Integer>{

	
	//List<StaffingTracker> findByoffshore_rm(int offshorerm);
}
