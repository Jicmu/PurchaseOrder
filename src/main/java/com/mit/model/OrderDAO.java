package com.mit.model;

import java.sql.Date;
import java.util.List;

public interface OrderDAO {
	List<OrderDTO> getOrder(OrderDTO orderDto);
	
	Long countOrder(OrderDTO orderDto);
	
	Integer updatePublished(OrderDTO orderDto);
	
	OrderDTO getOrderNum(OrderDTO orderDto);
	
	CompanyDTO getOurCompany();
	
	List<OrderDTO> getAllPart();
	
	List<OrderDTO> getAllCompany();
	
	OrderDTO getResetOrderData(OrderDTO orderDto);
	
	Integer updateOrder(OrderDTO orderDto);
	
	Long countProgress(OrderDTO orderDto);
	
	OrderDTO getScheduleInfo(OrderDTO orderDto);
	
	
	List<CompanyDTO> getCompany();
	
	List<OrderDTO> getOrderByMonth(Date date);
	
	List<OrderDTO> getOrderInfo(OrderDTO orderDto);
	
	List<OrderDTO> searchOrderProgress(OrderDTO orderDto);
}
