class WrongPasswordException extends Exception {
	public WrongPasswordException() {}

	public WrongPasswordException(String message) {
		super(message);
	}
}// WrongPasswordException

class NotExistIDException extends Exception {
	NotExistIDException() { }

	NotExistIDException(String message) {
		super(message);
	}
} //NotExistIDException

public class Try11 {
	public static void main(String[] args) {

		try {
			login("white", "12345");

		} catch (Exception e) {
			
			// 예외에러 경고 메시지 출력 문장 작성
			System.out.println(e.getMessage());
			
		} // 첫번째 try~catch

		try {
			login("blue", "54321");

		} catch (Exception w) {
			System.out.println(w.getMessage());

		} // 두번째 try catch

	}//main

	static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		/*
		 * 문제 )
		 *  1) id 가 blue가 아니라면 인위적 예외를 발생해서 경고 메시지를 띄우는 코드를 작성해라 문제
		 *  2) 비번이 12345 가 아니라면 인위적 예외를 발생해서 경고 메시지를 띄우는 코드를 작성하자
		 */

		if (!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지않습니다.");
		}
		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}//if
		
	}// WrongPasswordException

}//class
