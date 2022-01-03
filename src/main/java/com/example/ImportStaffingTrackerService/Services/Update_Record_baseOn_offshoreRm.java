package com.example.ImportStaffingTrackerService.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ImportStaffingTrackerService.Model.StaffingTracker;
import com.example.ImportStaffingTrackerService.Repository.StaffingTrackerRepository;

public class Update_Record_baseOn_offshoreRm  {
	
	@Autowired
	StaffingTrackerRepository repo;
	
	@Autowired
	ImportExcelService service;
	
	@Autowired
	StaffingTracker st;
	
	public void Update_StaffingTracker(List<StaffingTracker> staffingTrackervalues, int offshoreRm) {  
		
		
		for(int i=0;i<staffingTrackervalues.size();i++) {
			StaffingTracker st=staffingTrackervalues.get(i);
			System.out.println("st.getOffshore_RM() is "+st.getOffshore_RM());
			System.out.println("Offshore_RM is" +offshoreRm);
			if(st.getOffshore_RM()==offshoreRm) {
				System.out.println("i value is"+i);
				System.out.println(staffingTrackervalues.get(staffingTrackervalues.size() - 1));
				staffingTrackervalues.set(i, staffingTrackervalues.get(staffingTrackervalues.size() - 1));
			}
			}
	
}
	
			
			
}