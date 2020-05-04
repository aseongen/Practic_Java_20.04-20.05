
public class Opr07 {

	public static void main(String[] args) {

		int x =10;
		int y =20;
		int z =(++x) + (y--); //변수값 11 을 먼저 1 증가,  11+20 = 31 을  z 변수에 저장, 이후 y 변수값을 후행증가 
		
		System.out.println("z= " +z); //31

		System.out.println("---------------------------");
		
		int pencils = 534; //총 연필 갯수
		int students =30; //학생 수  
	

		/* 문제 )
		 * 학생 한명당 가지는 연필수를 구해서 출력하고 , 남은 연필 수도 구해서 각각 구하는 코드를 작성하자
		 */
		
		int b = pencils / students;
		int least = pencils % students;
		System.out.println("한명당 가지는 연필 수: "+b);
		System.out.println("나머지: " + least);

		
	}

}
