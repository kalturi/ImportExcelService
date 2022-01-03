package com.example.ImportStaffingTrackerService.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Staffing_Tracker")
public class StaffingTracker {
    
	@Id
	@Column(name="Tracker_id", nullable=false, length=512)
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int Tracker_id;
	@Column(name="Group1", nullable=false, length=512)
	private String Group1;
	@Column(name="CGI_Manager", nullable=false, length=512)
	private String CGI_Manager;
	@Column(name="Row", nullable=false, length=512)
	private String Row;
	@Column(name="PM", nullable=false, length=512)
	private String PM;
	@Column(name="Manager", nullable=false, length=512)
	private String Manager;
	@Column(name="Position_Title", nullable=false, length=512)
	private String Position_Title;
	@Column(name="Application_Mnemonic", nullable=false, length=512)
	private String Application_Mnemonic;
	@Column(name="Type", nullable=false, length=512)
	private String Type;
	@Column(name="Fixed_Price_TandM_Consulting", nullable=false, length=512)
	private String Fixed_Price_TandM_Consulting;
	@Column(name="Status", nullable=false, length=512)
	private String Status;
	@Column(name="Member_Hire_Contractor", nullable=false, length=512)
	private String Member_Hire_Contractor;
	@Column(name="Open_Date", nullable=false, length=512)
	private Date Open_Date;
	@Column(name="Estimated_Resource_Start_Date", nullable=false, length=512)
	private Date Estimated_Resource_Start_Date;
	@Column(name="Placement_Date", nullable=false, length=512)
	private Date Placement_Date;
	@Column(name="Offshore_FTE", nullable=false, length=512)
	private String Offshore_FTE;
	@Column(name="Offshore_Hired", nullable=false, length=512)
	private String Offshore_Hired;
	@Column(name="Offshore_Hires_Remaining", nullable=false, length=512)
	private String Offshore_Hires_Remaining;
	@Column(name="Transfer_New_Hire", nullable=false, length=512)
	private String Transfer_New_Hire;
	@Column(name="Offshore_Location", nullable=false, length=512)
	private String Offshore_Location;
	@Column(name="Citrix_Scripted", nullable=false, length=512)
	private String Citrix_Scripted;
	@Column(name="VM_Requirements", nullable=false, length=512)
	private String VM_Requirements;
	@Column(name="BRM", nullable=false, length=512)
	private String BRM;
	@Column(name="Notes", nullable=false, length=512)
	private String Notes;
	@Column(name="NJOYN", nullable=false, length=512)
	private String NJOYN;
	@Column(name="Offshore_RM", nullable=false, length=512)
	private int Offshore_RM;
	@Column(name="Comments", nullable=false, length=512)
	private String Comments;
	@Column(name="Cancellation_Reason", nullable=false, length=512)
	private String Cancellation_Reason;
	
	public StaffingTracker() {
		
	}
	public StaffingTracker(int tracker_id,
			String Group1, String cGI_Manager, String row, String pM, String manager,
			String position_Title, String application_Mnemonic, String type, String fixed_Price_TandM_Consulting,
			String status, String member_Hire_Contractor, Date open_Date, Date estimated_Resource_Start_Date,
			Date placement_Date, String offshore_FTE, String offshore_Hired, String offshore_Hires_Remaining,
			String transfer_New_Hire, String offshore_Location, String citrix_Scripted, String vM_Requirements,
			String bRM, String notes, String nJOYN, int offshore_RM, String comments, String cancellation_Reason) {
		this.Tracker_id=tracker_id;
		CGI_Manager = cGI_Manager;
		this.Group1= Group1;
		Row = row;
		PM = pM;
		Manager = manager;
		Position_Title = position_Title;
		Application_Mnemonic = application_Mnemonic;
		Type = type;
		Fixed_Price_TandM_Consulting = fixed_Price_TandM_Consulting;
		Status = status;
		Member_Hire_Contractor = member_Hire_Contractor;
		Open_Date = open_Date;
		Estimated_Resource_Start_Date = estimated_Resource_Start_Date;
		Placement_Date = placement_Date;
		Offshore_FTE = offshore_FTE;
		Offshore_Hired = offshore_Hired;
		Offshore_Hires_Remaining = offshore_Hires_Remaining;
		Transfer_New_Hire = transfer_New_Hire;
		Offshore_Location = offshore_Location;
		Citrix_Scripted = citrix_Scripted;
		VM_Requirements = vM_Requirements;
		BRM = bRM;
		Notes = notes;
		NJOYN = nJOYN;
		Offshore_RM = offshore_RM;
		Comments = comments;
		Cancellation_Reason = cancellation_Reason;
	}
	
	public String getGroup1() {
		return Group1;
	}
	public void setGroup1(String group1) {
		Group1 = group1;
	}
	public int getTracker_id() {
		return Tracker_id;
	}
	public void setSTracker_id(int tracker_id) {
		Tracker_id = tracker_id;
	}
	public String getCGI_Manager() {
		return CGI_Manager;
	}
	public void setCGI_Manager(String cGI_Manager) {
		CGI_Manager = cGI_Manager;
	}
	public String getRow() {
		return Row;
	}
	public void setRow(String row) {
		Row = row;
	}
	public String getPM() {
		return PM;
	}
	public void setPM(String pM) {
		PM = pM;
	}
	public String getManager() {
		return Manager;
	}
	public void setManager(String manager) {
		Manager = manager;
	}
	public String getPosition_Title() {
		return Position_Title;
	}
	public void setPosition_Title(String position_Title) {
		Position_Title = position_Title;
	}
	public String getApplication_Mnemonic() {
		return Application_Mnemonic;
	}
	public void setApplication_Mnemonic(String application_Mnemonic) {
		Application_Mnemonic = application_Mnemonic;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getFixed_Price_TandM_Consulting() {
		return Fixed_Price_TandM_Consulting;
	}
	public void setFixed_Price_TandM_Consulting(String fixed_Price_TandM_Consulting) {
		Fixed_Price_TandM_Consulting = fixed_Price_TandM_Consulting;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getMember_Hire_Contractor() {
		return Member_Hire_Contractor;
	}
	public void setMember_Hire_Contractor(String member_Hire_Contractor) {
		Member_Hire_Contractor = member_Hire_Contractor;
	}
	public Date getOpen_Date() {
		return Open_Date;
	}
	public void setOpen_Date(Date open_Date) {
		Open_Date = open_Date;
	}
	public Date getEstimated_Resource_Start_Date() {
		return Estimated_Resource_Start_Date;
	}
	public void setEstimated_Resource_Start_Date(Date estimated_Resource_Start_Date) {
		Estimated_Resource_Start_Date = estimated_Resource_Start_Date;
	}
	public Date getPlacement_Date() {
		return Placement_Date;
	}
	public void setPlacement_Date(Date placement_Date) {
		Placement_Date = placement_Date;
	}
	public String getOffshore_FTE() {
		return Offshore_FTE;
	}
	public void setOffshore_FTE(String offshore_FTE) {
		Offshore_FTE = offshore_FTE;
	}
	public String getOffshore_Hired() {
		return Offshore_Hired;
	}
	public void setOffshore_Hired(String offshore_Hired) {
		Offshore_Hired = offshore_Hired;
	}
	public String getOffshore_Hires_Remaining() {
		return Offshore_Hires_Remaining;
	}
	public void setOffshore_Hires_Remaining(String offshore_Hires_Remaining) {
		Offshore_Hires_Remaining = offshore_Hires_Remaining;
	}
	public String getTransfer_New_Hire() {
		return Transfer_New_Hire;
	}
	public void setTransfer_New_Hire(String transfer_New_Hire) {
		Transfer_New_Hire = transfer_New_Hire;
	}
	public String getOffshore_Location() {
		return Offshore_Location;
	}
	public void setOffshore_Location(String offshore_Location) {
		Offshore_Location = offshore_Location;
	}
	public String getCitrix_Scripted() {
		return Citrix_Scripted;
	}
	public void setCitrix_Scripted(String citrix_Scripted) {
		Citrix_Scripted = citrix_Scripted;
	}
	public String getVM_Requirements() {
		return VM_Requirements;
	}
	public void setVM_Requirements(String vM_Requirements) {
		VM_Requirements = vM_Requirements;
	}
	public String getBRM() {
		return BRM;
	}
	public void setBRM(String bRM) {
		BRM = bRM;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public String getNJOYN() {
		return NJOYN;
	}
	public void setNJOYN(String nJOYN) {
		NJOYN = nJOYN;
	}
	public int getOffshore_RM() {
		return Offshore_RM;
	}
	public void setOffshore_RM(int offshore_RM) {
		Offshore_RM = offshore_RM;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getCancellation_Reason() {
		return Cancellation_Reason;
	}
	public void setCancellation_Reason(String cancellation_Reason) {
		Cancellation_Reason = cancellation_Reason;
	}
	
	
	

}
