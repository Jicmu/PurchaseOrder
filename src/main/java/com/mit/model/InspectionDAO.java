package com.mit.model;

import java.util.List;

public interface InspectionDAO {
	public List<OrderDTO> getOrderAllNum();
	
	public List<InspectionDTO> getInspection(InspectionDTO inspectionDto);
	
	public Long countInspection(InspectionDTO inspectionDto);
	
	public List<InspectionDTO> getInspectionByOrderNum(InspectionDTO inspectionDto);
	
	public List<InspectionDTO> getInspectionForDownloadSchedule(List<InspectionDTO> checkedNum);
	
	public List<InspectionDTO> getOrderNum();
	
	public InspectionDTO getInspectionResult(InspectionDTO inspectionDto);
	
	public Integer insertInspectionSchedule(InspectionDTO inspectionDto);
	
	public Integer insertInspectionResult(InspectionDTO inspectionDto);
	
	public Integer updateInspectionQuantity(InspectionDTO inspectionDto);
	
	public Integer getNextInspectionNum(InspectionDTO inspectionDto);
	
	public Integer getNextInspectionResultNum(InspectionDTO inspectionDto);
	
	public InspectionDTO getTotalInspectionQuantity(OrderDTO orderDto);
	
	public InspectionDTO getDate(InspectionDTO inspectionDto);
	
	public Double getMaxProgress(InspectionDTO inspectionDto);
}
