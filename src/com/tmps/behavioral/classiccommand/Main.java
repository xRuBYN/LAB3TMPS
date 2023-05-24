package com.tmps.behavioral.classiccommand;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    DataBase dataBase = new DataBase();

    DataEngineer dataEngineer = new DataEngineer(List.of(new DeleteCommand(dataBase), new SelectCommand(dataBase), new InsertCommand(dataBase)));
    dataEngineer.executeCommand(CommandType.SELECT);
    dataEngineer.executeCommand(CommandType.DELETE);
    dataEngineer.executeCommand(CommandType.INSERT);
  }

}
