package com.tmps.behavioral.classiccommand;

public class DeleteCommand implements Command {

  private DataBase dataBase;

  public DeleteCommand(DataBase dataBase) {
    this.dataBase = dataBase;
  }
  @Override
  public void execute() {
    dataBase.delete();
  }

  @Override
  public CommandType getCommandType() {
    return CommandType.DELETE;
  }
}