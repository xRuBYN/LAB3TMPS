package com.tmps.behavioral.classiccommand;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DataEngineer {
  public Map<CommandType, Command> map = new HashMap<>();

  public DataEngineer(List<Command> commands) {
    this.map = commands.stream()
        .collect(Collectors.toMap(Command::getCommandType, Function.identity()));
  }

  public void executeCommand(CommandType commandType) {
    map.get(commandType).execute();
  }
}
