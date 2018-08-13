package callofduty;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import callofduty.constants.Constant;
import callofduty.core.MissionControlImpl;
import callofduty.interfaces.InputReader;
import callofduty.interfaces.MissionControl;
import callofduty.interfaces.MissionManager;
import callofduty.interfaces.OutputWriter;
import callofduty.io.ConsoleReader;
import callofduty.io.ConsoleWriter;
import callofduty.missionmanager.MissionManagerImpl;

/*/
Java OOP Advanced Exam Solution created by Todor Kamenov
 */

public class Main {
	public static void main(String[] args) throws IOException {
		InputReader reader = new ConsoleReader();
		OutputWriter writer = new ConsoleWriter();

		MissionControl missionControl = new MissionControlImpl();
		MissionManager missionManager = new MissionManagerImpl(missionControl);

		String line;

		line = reader.readLine();

		List<String> arguments = Arrays.stream(line.split(Constant.COMMAND_PARAMETERS_SEPARATOR)).collect(Collectors.toList());

		String command = arguments.get(0);

		missionCreateMethod(writer, missionManager, arguments, command);
		while (!line.equals(Constant.FINAL_COMMAND)) {
			line = reader.readLine();

			arguments = Arrays.stream(line.split(Constant.COMMAND_PARAMETERS_SEPARATOR)).collect(Collectors.toList());

			command = arguments.get(0);

			missionCreateMethod(writer, missionManager, arguments, command);
		}

	}

	private static void missionCreateMethod(OutputWriter writer, MissionManager missionManager, List<String> arguments, String command) {
		if (Constant.AGENT_COMMAND.equals(command)) {
			writer.println(missionManager.agent(arguments));

		} else if (Constant.REQUEST_COMMAND.equals(command)) {
			writer.println(missionManager.request(arguments));

		} else if (Constant.COMPLETE_COMMAND.equals(command)) {
			writer.println(missionManager.complete(arguments));

		} else if (Constant.STATUS_COMMAND.equals(command)) {
			writer.println(missionManager.status(arguments));

		} else if (Constant.OVER_COMMAND.equals(command)) {
			writer.println(missionManager.over(arguments));

		} else {
			throw new IllegalArgumentException(Constant.NOT_VALID_COMMAND_PRINT + command);
		}
	}
}