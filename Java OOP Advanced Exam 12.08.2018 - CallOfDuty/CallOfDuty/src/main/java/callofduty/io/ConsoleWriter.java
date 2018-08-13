package callofduty.io;

import callofduty.interfaces.OutputWriter;

public class ConsoleWriter implements OutputWriter {

	public ConsoleWriter() {
	}

	@Override
	public void println(String text) {
		System.out.println(text);
	}

	@Override
	public void print(String text) {
		System.out.print(text);
	}
}
