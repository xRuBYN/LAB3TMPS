package com.tmps.behavioral.classiccommand;

public class SelectCommand implements Command {

  private DataBase dataBase;

  public SelectCommand(DataBase dataBase) {
    this.dataBase = dataBase;
  }
  @Override
  public void execute() {
    dataBase.select();
  }

  @Override
  public CommandType getCommandType() {
    return CommandType.SELECT;
  }
}
