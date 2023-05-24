package com.tmps.behavioral.classiccommand;

public class InsertCommand implements Command {

  private DataBase dataBase;

  public InsertCommand(DataBase dataBase) {
    this.dataBase = dataBase;
  }
  @Override
  public void execute() {
    dataBase.insert();
  }

  @Override
  public CommandType getCommandType() {
    return CommandType.INSERT;
  }
}
