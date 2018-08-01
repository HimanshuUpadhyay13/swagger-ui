package com.example.demo.contracts;

import com.example.demo.model.Report;

public interface ReportFactory {

	Report getReport(String reportType);

}
