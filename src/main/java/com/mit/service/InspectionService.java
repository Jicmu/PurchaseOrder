package com.mit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mit.model.InspectionDAO;
import com.mit.model.InspectionDTO;
import com.mit.model.OrderDTO;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InspectionService extends com.mit.service.Service {
	
	InspectionDAO inspectionDao;
	
	
	public List<OrderDTO> getOrderAllNum() {
		return inspectionDao.getOrderAllNum();
	}
	
	public Long countInspection(InspectionDTO inspectionDto) {
		return inspectionDao.countInspection(inspectionDto);
	}
	
	public List<InspectionDTO> getInspection(InspectionDTO inspectionDto) {
		return inspectionDao.getInspection(inspectionDto);
	}
	
	public List<InspectionDTO> getInspectionByOrderNum(InspectionDTO inspectionDto) {
		return inspectionDao.getInspectionByOrderNum(inspectionDto);
	}
	
	public List<InspectionDTO> getInspectionForDownloadSchedule(List<InspectionDTO> checkedNum) {
		return inspectionDao.getInspectionForDownloadSchedule(checkedNum);
	}
	
	public List<InspectionDTO> getOrderNum() {
		return inspectionDao.getOrderNum();
	}
	
	public InspectionDTO getInspectionResult(InspectionDTO inspectionDto) {
		return inspectionDao.getInspectionResult(inspectionDto);
	}
	
	public Integer insertInspectionSchedule(InspectionDTO inspectionDto) {
		return inspectionDao.insertInspectionSchedule(inspectionDto);
	}
	
	public Integer insertInspectionResult(InspectionDTO inspectionDto) {
		if (inspectionDao.insertInspectionResult(inspectionDto) != 0) {
			return inspectionDao.updateInspectionQuantity(inspectionDto);
		}
		
		return 0;
	}
	
	public Integer getNextInspectionNum(InspectionDTO inspectionDto) {
		return inspectionDao.getNextInspectionNum(inspectionDto);
	}
	
	public Integer getNextInspectionResultNum(InspectionDTO inspectionDto) {
		return inspectionDao.getNextInspectionResultNum(inspectionDto);
	}
	
	public InspectionDTO getTotalInspectionQuantity(OrderDTO orderDto) {
		return inspectionDao.getTotalInspectionQuantity(orderDto);
	}
	
	public InspectionDTO getDate(InspectionDTO inspectionDto) {
		return inspectionDao.getDate(inspectionDto);
	}
	
	public Double getMaxProgress(InspectionDTO inspectionDto) {
		return inspectionDao.getMaxProgress(inspectionDto);
	}
}
