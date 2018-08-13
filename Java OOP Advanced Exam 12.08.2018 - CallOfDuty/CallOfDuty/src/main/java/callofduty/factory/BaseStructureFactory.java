package callofduty.factory;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaseStructureFactory {

	public static BufferedReader createBufferedReader() {
		return new BufferedReader(new InputStreamReader(System.in));
	}

	public static StringBuilder createStringBuilder() {
		return new StringBuilder();
	}
}
