import java.util.Iterator;
import java.util.TreeSet;

/* 사용자 정의 클래스에서 자동정렬 즉 오름차순 정렬을 하려면, 
 * Comparable 인터페이스를 구현해야 한다. 
 */

class Person implements Comparable<Person>{

	public String name;
	public int age;
	
	public Person(String name, int age) {
	    this.name=name; this.age=age;
	}
	
	@Override
	public int compareTo(Person o) {

		if(age< o.age)return -1; //주어진 객체와 적으면 음수
		else if(age == o.age) return 1; //같으면 0
		return 1; //주어진 객체보다 크면 양수
	}
	
}//class Person
public class ListMap14 {
	public static void main(String[] args) {

		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("홍길동",45)); treeSet.add(new Person("이순신", 25));
		treeSet.add(new Person("강감찬",33)); 
	
		//왼쪽 마지막 노드에서 오른쪽 마지막 노드까지 반복해서 오름차순 정렬
		//나이순서대로오름차순이 적용된다.
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " " + person.age);

		}//while
		
	}//main

}//class
