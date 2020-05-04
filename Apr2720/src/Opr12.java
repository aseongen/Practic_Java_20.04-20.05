import java.util.Scanner;

public class Opr12 {

	public static void main(String[] args) {

/*문제 )
 * Scanner사용 해서 0~100 까지의 점수값만 입력되게 하고, 아니면 유효성 검증 처리
 * if else if~ 다중 조건문 활용하여 A+ A- A0 , B+ B- B0.....D+///
 * 구하는 코드를 작성하시오. 
 */
		Scanner sc = new Scanner(System.in);
		System.out.println(" 0~100까지 정수만 입력하세요");
		int score = sc.nextInt();
		String grade = " ";
		
		if (!(score <=0 && score <=100)) {
			System.out.println("0~100까지 정수만 입력하세요"); //유효성 검증 
		}else {
			if (score <98) {
				grade = "A+";
			}else if (score >96) {
				grade = "A-";
			}else if (score >=95) {
				grade = "A0";
			} else {
				if(score <=94) {
					grade = "B+";
				}else if (score >93) {
					grade = "B-";
				}else if (score >=90) {
					grade = "B0";
				}else {
					if (score <=89) {
						grade = "c+";
					}else if (score >87) {
						grade = "c-";
				    }else if (score >=85) {
						grade = "c0";
				    }else {
				    	if (score <=84) {
				    	  grade = "D+";
				    	}else if (score >83) {
						  grade = "D-";
				        }else if (score >=80) {
						  grade = "D0";	
				    	} else {
				    		if(score <=79) {
				    			grade = "E+";
				    		}else if (score >77) {
				    			grade = "E-";
				    		}else if (score >=70 && score <69) {
				    			grade = "E0";
				    		}else {
				    			grade = "F";
				    		}
				    	}
				}
		}
				System.out.println("F입니다.");
	}
		
    System.out.println(grade );
	} 
		
	
	System.out.println("=====================================");
     int s =0;
     char grad=' ';
     char opt = '0';
     
     System.out.println("0~100사이  정수만 입력>>> ");
     s = Integer.parseInt(sc.nextLine());
     if (!(0<=s && s <=100 )) { //유효성 검증 
    	 if(s >=90) {
    		 grad= 'A';
    		 if(s>=98) {
    			 opt= '+';
    		 }else if (score <=94) {
    			 opt= '-';
    		 }
    	 }else if(s >=80) {
    		 grad = 'B';
    		 if(s>=88) {
    	     opt= '+';
    	     }else if (s <=84) {
    	     opt= '-';
    	     }
    	 }else if (s>=70) {
    		 grad = 'C';
    		 if(s>=78) {
    			 opt= '+';
    		 }else if (s <=74) {
    			 opt= '-';
    		 }
    	 }else if(s >=60) {
    		 grad ='D';
    		 if(s>=68) {
    			 opt= '+';
    		 }else if (s <=64) {
    			 opt= '-';
    		 }
    	 }else { //59점 미만 
    		 grad = 'F';
    	 }
    	 if(grad != 'F') {
    		 System.out.println(score + "점수는" + grade + opt + "입니다.");
    	 }else {
    		 System.out.println(score + "점수는" + grade + "학점입니다.");
    	 }
     }else {
    	 System.out.println("0~100사이  정수만 입력하세요 ");
     }
	
   }
}
