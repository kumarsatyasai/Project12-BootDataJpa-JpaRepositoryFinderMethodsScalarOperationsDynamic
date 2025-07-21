package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.ICustomerRepository;
import com.nt.view.ResultView4;

@Component
public class CustomFinderMethodsTestRunner implements CommandLineRunner {
	
	
	@Autowired
	private ICustomerRepository custRepo;


	@Override
	public void run(String... args) throws Exception {

		try 
		{
			List<ResultView4> list = custRepo.findByBillAmtBetween(1d, 100d, ResultView4.class);
			for(ResultView4 x : list)
			{
				System.out.println(x.getName());
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

}
