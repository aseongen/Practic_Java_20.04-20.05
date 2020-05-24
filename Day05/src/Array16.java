
public class Array16 {

	public static void main(String[] args) {

		String[] names= {"kim", "park", "Yi"};
		
		for(int i=0; i<names.length; i++) {
			System.out.println("names [" + i + "] = " + names [i]);
		}
        System.out.println("\n---------------------------------");		
		String tmp = names[2]; //3번째 배열 원소값 Yi 저장
		System.out.println("tmp : "+ tmp);
		
		names[0] = "Yu"; // 첫번째 배열 원소값을 kim 에서   Yu로 변경
		
		System.out.println("\n------변경된 배열원소값---------");
		
		for(String name : names) {
			System.out.println(name);
		}
		
	}

}
