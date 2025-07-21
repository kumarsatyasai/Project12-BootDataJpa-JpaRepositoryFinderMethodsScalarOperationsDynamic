package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Customer;
import com.nt.view.View;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
	
	
	
	public <T extends View> List<T> findByBillAmtBetween(Double start, Double end, Class<T> clazz);
	
	
	
	

}
