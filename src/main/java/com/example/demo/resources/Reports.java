package com.example.demo.resources;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.contracts.ReportFactory;
import com.example.demo.model.Report;

@RestController
@RequestMapping("/rest/reports")
@Api(value = "End points for reports", description = "Hit below end points for document reterival")
public class Reports {

	@Autowired
	public ReportFactory factory;

	@GetMapping("/getReport")
	@ApiOperation(value = "getReports", response = Report.class)
	public Report getReport(@ApiParam(value = "reportType") @RequestParam String reportType) {

		return findReport(reportType);
	}

	private Report findReport(String reportType) {
		// TODO Auto-generated method stub
		return factory.getReport(reportType);
	}


}
