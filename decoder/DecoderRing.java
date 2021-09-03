import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class FloatingPoint {
	public static void main(String[] args) {
		DecoderRing.printLine("aaa");
	}
} 

class DecoderRing {
	public static void printLine(String str) {
		List<Character> result = str.chars()
			.mapToObj(item -> (char) ((int) item + 2))
			.collect(Collectors.toList());

		StringBuilder sb = new StringBuilder();
		for (Character chr : result)
			sb.append(chr);

		System.out.println(sb.toString());
	}
}
