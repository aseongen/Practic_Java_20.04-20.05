
public class OprData12 {
	public static void main(String[] args) {
 
		int x = 10;
		int y = 10;
		int z ;
		
		x++;
		++x;
	    System.out.println("x= " + x);	
	   
	    y--;  --y;
	    System.out.println("y="+y);
	
	    z = x++; //z 변수에 12를 먼저 대입하고 나중에 1증가해서 x 변수값이 13 
	    System.out.println("z= "+ z + "x= " + x);
	    
	    z = ++x; //13을 먼저 1 증가한 14값을 z 변수에 대입
	    System.out.println("z= " + z + ",x = " + x );
	    
	    z = ++x + y++; //x변수값 14를 먼저 1 증가한 15 + 8 =23을 z 변수에 대입
	                   //나중에 y 변수값 8을 1증가해서 9가 됨
        System.out.println("Z = " + z +",x= " + 15 + ",y =" + y );	    

        
        
	}
}
