import java.util.NavigableSet;
import java.util.TreeSet;

public class ListMap12 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));scores.add(new Integer(98));
		scores.add(75);	scores.add(new Integer(95));
		scores.add(new Integer(80));

		// 내림차순 정렬
		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();

		// 오름차순정렬 => 낮은 순서대로 올라간다.
		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();// 오름차순정렬
		for (Integer score : ascendingSet) {
			System.out.print(score + " ");
		} // for
	}// main
}// class
