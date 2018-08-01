package com.example.demo.contracts;

import java.util.Calendar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import com.example.demo.model.Report;
import com.github.javafaker.Faker;

@Component
@Configuration
public class ReportFactoryImpl implements ReportFactory {
	
	
	@Bean
	public Faker getFaker() {
		return new Faker();
	}

	@Override
	public Report getReport(String reportType) {
		// TODO Auto-generated method stub

		return new Report(getFaker().firstName(), getFaker().country(), Calendar.getInstance(),Calendar.getInstance());
	}

}
