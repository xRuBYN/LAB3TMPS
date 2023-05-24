package com.tmps.behavioral.command;

public class CsvReportGenerator implements ReportGenerator {

  @Override
  public String generate() {
    return "Generate csv report";
  }

  @Override
  public ReportType getReportType() {
    return ReportType.CSV;
  }
}
