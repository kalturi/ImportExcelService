package com.example.ImportStaffingTrackerService.Services;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.springframework.util.StringUtils;

public class ExcelUtility {
	
	public static boolean containsValue(XSSFRow row, int fcell, int lcell) 
	{
	    boolean flag = false;
	    for (int i = fcell; i < lcell; i++) {
	    if (StringUtils.isEmpty(String.valueOf(row.getCell(i))) == true || 
	        //StringUtils.isWhitespace(String.valueOf(row.getCell(i))) == true || 
	        //StringUtils.isBlank(String.valueOf(row.getCell(i))) == true || 
	        String.valueOf(row.getCell(i)).length() == 0 || 
	        row.getCell(i) == null) {} 
	    else {
	                flag = true;
	        }
	    }
	        return flag;
	}

}
