package gradingsystem;

public class Gradingsystem {
  public static void main(String[] args) {
 int[] marks= {100,90,85,80,75,70,65,60,55,50,45,40,35,30,25,20,15,10,0};
 for(int i=0; i<=marks.length;i++) {
	 System.out.println(i);
	 if(i==10) {
		 break;
	 }	 
 }
int y=90;
while(y<100) {
	 System.out.println(y);
	 y++;	 
}
int b=0;
if(b>=90) {
	 System.out.println('A');
}else if(b>=80) {
	 System.out.println('B');
}else if(b>=70) {
	 System.out.println('C');
} else if(b>=60) {
	 System.out.println('D');	
} else if(b>=50) {
	 System.out.println('E');	
}else if(b>=40) {
	System.out.println("Pass");
}else {
	System.out.println("F");
	
}


  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
      }
      
       
	  
			
		
	


