import java.util.*;
import java.util.stream.Collectors;

class MapStuff {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(doubling(nums));
	}

	public static List<Integer> doubling(List<Integer> nums) {
		  return nums.stream()
			.map(num -> num*2)
			.collect(Collectors.toList());
	}
}
