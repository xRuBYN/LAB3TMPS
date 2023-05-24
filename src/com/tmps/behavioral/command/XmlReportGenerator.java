package com.tmps.behavioral.command;

public class XmlReportGenerator implements ReportGenerator {

  @Override
  public String generate() {
    return "Generate xml report";
  }

  @Override
  public ReportType getReportType() {
    return ReportType.XML;
  }
}
