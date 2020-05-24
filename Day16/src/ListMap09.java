import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ListMap09 {
	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		
		
		map.put("신용권",85);map.put("홍길동",90);
		map.put("동장군",80);map.put("홍길동",95);
        //put()메서드로 키,값,쌍으로 저장. 홍길동 키가 같기 때문에 마지막에 저장된 '홍길동'95만 저장된다.
		//이전값은사라진다. 
		
		System.out.println("총원소개수: " + map.size());
		
		// 홍길동 키에 대한 점수값을 찾기 
		System.out.println("홍길동 : " + map.get("홍길동"));
	
	    System.out.println(); //개행
	    
	    //키셋을 구함
	    Set<String> keySet =map.keySet();
	    Iterator<String> keyIterator = keySet.iterator();
        
	    //다음 것이 있다면 참 
	    while(keyIterator.hasNext()){
	    	//키를 얻음
	    	String key = keyIterator.next();
	    	//키에 대한 값을 구함
	    	Integer value = map.get(key);
            System.out.println("\t"+key+":"+value);
	    	
	    }
	    System.out.println();
	    map.remove("홍길동");
	    System.out.println("총개수: "+map.size());
	    
	  //맴 엔트리 셋 얻기 
	    Set<Map.Entry<String,Integer>> entrySet=map.entrySet();
	     Iterator<Map.Entry<String,Integer>> entryIterator=entrySet.iterator();
	     
	     while(entryIterator.hasNext()) {
	    	 Map.Entry<String,Integer> entry=entryIterator.next();
	    	 String key=entry.getKey();//키를 구함.
	    	 Integer value=entry.getValue();//값을 구함.
	         System.out.println(key+" : "+value);    	 
	     }
	     map.clear();//전체 삭제
	     System.out.println("맵 원소개수 : "+map.size());     
		}
	}





















