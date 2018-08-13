package callofduty.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import callofduty.interfaces.InputReader;

public class ConsoleReader implements InputReader {

	private BufferedReader bf;

	public ConsoleReader() {
		this.bf = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public String readLine() {
		try {
			return bf.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
