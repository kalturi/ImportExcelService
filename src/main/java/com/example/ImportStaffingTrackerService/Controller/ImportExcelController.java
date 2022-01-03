package com.example.ImportStaffingTrackerService.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.ImportStaffingTrackerService.Model.StaffingTracker;
import com.example.ImportStaffingTrackerService.Repository.StaffingTrackerRepository;
import com.example.ImportStaffingTrackerService.Services.ImportExcelService;


@RestController
public class ImportExcelController {
	
	
		@Autowired
		StaffingTrackerRepository repo;

		@PostMapping(value = "/import")
		public ResponseEntity<Object> fileupload(@RequestParam("file") MultipartFile file)
				throws IllegalStateException, IOException {
            ImportExcelService importservice = new ImportExcelService();
			List<StaffingTracker> entities = importservice.excelImport(file);
			repo.saveAll(entities);
			return new ResponseEntity<Object>("The file uploaded successfully", HttpStatus.OK);

		}

}
