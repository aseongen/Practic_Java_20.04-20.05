import java.util.LinkedList;
import java.util.Queue;

class Message{
	String command;
	String to;
	
	Message (String command, String to){
		this.command = command;
		this.to = to;
	}
}//class Message
public class ListMap16 {
    public static void main(String[] args) {
		
    	Queue<Message> messageQue = new LinkedList<>();
    	
    	messageQue.offer(new Message("sendMail", "홍길동"));
    	messageQue.offer(new Message("sendSMS", "이순신"));
    	messageQue.offer(new Message("sendKakaotalk", "신사임당"));
    	
    	//큐가 비어있지 않다면 
    	while( ! messageQue.isEmpty()) {
    		//큐로부터 메시지를 꺼내오면서 제거 
    		Message message = messageQue.poll();
    		switch (message.command) {
    		case "sendMail" : //자바 7부터 switch case 조건식과   case 값에 정수식외에 문자열도 함께 올수 있다.
    			System.out.println(message.to + "님에게 메일을 보냅니다."); break;
    		case "sendSMS":
    			System.out.println(message.to + "님에게 문자를 보냅니다."); break;
    		case "sendKakaotalk" : 
    			System.out.println(message.to + "님에게 톡을 보냅니다."); break;
    		}
    	}
	}//main
}//class
