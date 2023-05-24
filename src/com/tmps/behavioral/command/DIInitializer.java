package com.tmps.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class DIInitializer {
  public static List<ReportGenerator> reportGeneratorList = new ArrayList<>();

  static {
    reportGeneratorList.add(new XmlReportGenerator());
    reportGeneratorList.add(new PdfReportGenerator());
    reportGeneratorList.add(new CsvReportGenerator());
  }
}
