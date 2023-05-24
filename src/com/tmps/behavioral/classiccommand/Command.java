package com.tmps.behavioral.classiccommand;

public interface Command {
  void execute();

  CommandType getCommandType();
}
