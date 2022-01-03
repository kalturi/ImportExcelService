package com.example.ImportStaffingTrackerService.Services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.ImportStaffingTrackerService.Model.StaffingTracker;

@Service
public class ImportExcelService {

	public List<StaffingTracker> excelImport(MultipartFile file) throws IllegalStateException, IOException {
		List<StaffingTracker> StaffingTrackervalues = new ArrayList<>();

		int Tracker_id = 0;
		String Group1 = "";
		String CGI_Manager = "";
		String Row = "";
		String PM = "";
		String Manager = "";
		String Position_Title = "";
		String Application_Mnemonic = "";
		String Type = "";
		String Fixed_Price_TandM_Consulting = "";
		String Status = "";
		String Member_Hire_Contractor = "";
		Date Open_date = new Date();
		Date Estimated_Resource_Start_Date = new Date();
		Date Placement_Date = new Date();
		String Offshore_FTE = "";
		String Offshore_Hired = "";
		String Offshore_Hires_Remaining = "";
		String Transfer_New_Hire = "";
		String Offshore_Location = "";
		String Citrix_Scripted = "";
		String VM_Requirements = "";
		String BRM = "";
		String Notes = "";
		String NJOYN = "";
		int Offshore_RM = 0;
		String Comments = "";
		String Cancellation_Reason = "";

		long start = System.currentTimeMillis();

		try {
			Workbook workbook = new XSSFWorkbook(file.getInputStream());
			Sheet firstsheet = workbook.getSheetAt(0);
			int rows = firstsheet.getLastRowNum();
			int cols = firstsheet.getRow(2).getLastCellNum();
			Iterator<Row> rowIterator = firstsheet.iterator();
			rowIterator.next();
			rowIterator.next();
			while (rowIterator.hasNext()) {
				XSSFRow row = (XSSFRow) rowIterator.next();
				int fcell = row.getFirstCellNum();// first cell number of excel
				int lcell = row.getLastCellNum();
				// System.out.println("row is at" + row);
				if (ExcelUtility.containsValue(row, fcell, lcell) == true) {
					Iterator<Cell> cellIterator = row.cellIterator();

					while (cellIterator.hasNext()) {
						Cell nextCell = cellIterator.next();
						int columnIndex = nextCell.getColumnIndex();

						switch (columnIndex) {
						case 0:
							// System.out.println("********* "+Tracker_id);
							// System.out.println( nextCell.getNumericCellValue());
							Tracker_id = (int) nextCell.getNumericCellValue();
							// Tracker_id= (String)nextCell.getStringCellValue();
							System.out.println("tracker id is " + Tracker_id);
							break;
						case 1:
							CGI_Manager = (String) nextCell.getStringCellValue();

							System.out.println(CGI_Manager);
							break;
						case 2:
							Group1 = (String) nextCell.getStringCellValue();

							System.out.println(Group1);
							break;
						case 3:
							Row = (String) nextCell.getStringCellValue();

							System.out.println(Row);
							break;
						case 4:
							PM = (String) nextCell.getStringCellValue();
							System.out.println(PM);
							break;
						case 5:
							Manager = (String) nextCell.getStringCellValue();

							System.out.println(Manager);
							break;
						case 6:
							Position_Title = (String) nextCell.getStringCellValue();
							System.out.println(Position_Title);
							break;
						case 7:
							Application_Mnemonic = (String) nextCell.getStringCellValue();
							System.out.println(Application_Mnemonic);
							break;
						case 8:
							Type = (String) nextCell.getStringCellValue();
							System.out.println(Type);
							break;
						case 9:
							Fixed_Price_TandM_Consulting = (String) nextCell.getStringCellValue();

							System.out.println(Fixed_Price_TandM_Consulting);
							break;
						case 10:
							Status = (String) nextCell.getStringCellValue();
							System.out.println(Status);
							break;
						case 11:
							Member_Hire_Contractor = (String) nextCell.getStringCellValue();

							System.out.println(Member_Hire_Contractor);
							break;
						case 12:
							Open_date =  nextCell.getDateCellValue();
							System.out.println(Open_date);
							break;
						case 13:
							Estimated_Resource_Start_Date = nextCell.getDateCellValue();

							System.out.println(Estimated_Resource_Start_Date);
							break;
						case 14:
							// Placement_Date = (String) nextCell.getStringCellValue();
							Placement_Date = nextCell.getDateCellValue();
							System.out.println(Placement_Date);
							break;
						case 15:
							Offshore_FTE = (String) nextCell.getStringCellValue();
							System.out.println(Offshore_FTE);
							break;
						case 16:
							Offshore_Hired = (String) nextCell.getStringCellValue();
							System.out.println(Offshore_Hired);
							break;
						case 17:
							Offshore_Hires_Remaining = (String) nextCell.getStringCellValue();

							System.out.println(Offshore_Hires_Remaining);
							break;
						case 18:
							Transfer_New_Hire = (String) nextCell.getStringCellValue();
							System.out.println(Transfer_New_Hire);
							break;
						case 19:
							Offshore_Location = (String) nextCell.getStringCellValue();

							System.out.println(Offshore_Location);
							break;
						case 20:
							Citrix_Scripted = (String) nextCell.getStringCellValue();
							System.out.println(Citrix_Scripted);
							break;
						case 21:
							VM_Requirements = (String) nextCell.getStringCellValue();

							System.out.println(VM_Requirements);
							break;
						case 22:
							BRM = (String) nextCell.getStringCellValue();
							System.out.println(BRM);
							break;
						case 23:
							Notes = (String) nextCell.getStringCellValue();

							System.out.println(Notes);
							break;
						case 24:
							NJOYN = (String) nextCell.getStringCellValue();
	//a ,b, c, 9						System.out.println(NJOYN);
	//c, d,e, 4						
	//u, j,f, 9				
							break;
						case 25:
							
							Offshore_RM = (int) nextCell.getNumericCellValue();
							
							System.out.println(Offshore_RM);
							break;
						case 26:
							Comments = (String) nextCell.getStringCellValue();
							System.out.println(Comments);
							break;
						case 27:
							Cancellation_Reason = (String) nextCell.getStringCellValue();

							System.out.println(Cancellation_Reason);
							break;

						}
					}
					
					StaffingTrackervalues.add(new StaffingTracker(Tracker_id, Group1, CGI_Manager, Row, PM, Manager,
							Position_Title, Application_Mnemonic, Type, Fixed_Price_TandM_Consulting, Status,
							Member_Hire_Contractor, Open_date, Estimated_Resource_Start_Date, Placement_Date,
							Offshore_FTE, Offshore_Hired, Offshore_Hires_Remaining, Transfer_New_Hire,
							Offshore_Location, Citrix_Scripted, VM_Requirements, BRM, Notes, NJOYN, Offshore_RM,
							Comments, Cancellation_Reason));

				/*	for(int i=0;i<StaffingTrackervalues.size();i++) {
						StaffingTracker st=StaffingTrackervalues.get(i);
						
						if(st.getOffshore_RM()==Offshore_RM) {
							StaffingTrackervalues.remove(i);
							System.out.println("removed element is "+i);
							System.out.println("getOffshore_RM element is "+st.getOffshore_RM());
							System.out.println("Offshore_RM element is "+Offshore_RM);
							StaffingTrackervalues.add(new StaffingTracker(Tracker_id, Group1, CGI_Manager, Row, PM, Manager,
									Position_Title, Application_Mnemonic, Type, Fixed_Price_TandM_Consulting, Status,
									Member_Hire_Contractor, Open_date, Estimated_Resource_Start_Date, Placement_Date,
									Offshore_FTE, Offshore_Hired, Offshore_Hires_Remaining, Transfer_New_Hire,
									Offshore_Location, Citrix_Scripted, VM_Requirements, BRM, Notes, NJOYN, Offshore_RM,
									Comments, Cancellation_Reason));		
							}
						
					}*/
					
					Update_Record_baseOn_offshoreRm updateoffshorerm =new Update_Record_baseOn_offshoreRm();
					updateoffshorerm.Update_StaffingTracker(StaffingTrackervalues, Offshore_RM);
						
					} else
					break;
			}
			workbook.close();
			long end = System.currentTimeMillis();
			System.out.printf("Import done in %d  ms\n", (end - start));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		return StaffingTrackervalues;

	}

}
