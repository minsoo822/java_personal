package oop0521;

public class Test01_for {

	public static void main(String[] args) {
		//���� �ݺ���
		
		for(int a=1; a<=2; a=a+1) {
			System.out.println("JAVA");
			for(int b=1; b<=3; b=b+1) {
			System.out.println("Python");
			}
		}//for end
		/*
		 	a=1  1<=2  JAVA
		 			   b=1	1<=3 python b=1+1
		 			     	2<=3 python b=2+1
		 			    	3<=3 python b=3+1
		 			    	4<=3 
		         2<=2  JAVA
		 			   b=1	1<=3 python b=1+1
		 			     	2<=3 python b=2+1
		 			    	3<=3 python b=3+1
		 			    	4<=3 		 
		 
		 */
		//������ 2��~9�� ����ϱ�
		for(int dan=2; dan<=9; dan=dan+1) {
			System.out.println(dan+"��");
			for(int n=1; n<=9; n=n+1) {
				System.out.println(dan+"*"+n+"="+(dan*n));
			}//for end
		}//for end
		
		System.out.println("-----------------------");
		
		//1. ȸ���� ����
		int a=0, b=0;
		for(a=1; a<=4; a=a+1) {
			for(b=1; b<=a; b=b+1) {
				System.out.print("@");
			}//for end
			System.out.println();//�ٹٲ�
		}//for end
		/*
		   a=1  1<=4
		      	      b=1  1<=1   @
		        
		        2<=4
		        	  b=1  1<=1   @
		        	  	   2<=2   @
		        	 
		        3<=4
		        	  b=1  1<=3   @
		        	       2<=3   @
		        	       3<=3   @  	   		 	 
		 */
		System.out.println("----------------");
		
		
		//2. ȸ���� ����
		for(a=4; a>=1; a=a-1) {
			for(b=1; b<=a; b=b+1) {
				System.out.print("#");
			}
			System.out.println();
		}
		/*
		 	a=4  4>=1
		 			   b=1  1<=4  #
		 			   	    2<=4  #
		 			   	    3<=4  #
		 			   	    4<=4  #
		 	     3>=1
		 			   b=1  1<=3  #
		 			   	    2<=3  #
		 			   	    3<=3  #
		 		 2>=1	   	    
		 		       b=1  1<=2  #
		 			   	    2<=2  #
		 	     1>=1	   	    
		 		       b=1  1<=1  #
		 			   	    2<=1  
		 		 0>=1	   	    	 
		 */
		 System.out.println(a+b); //0+2
	
		
		

	}//main() end
}//class end
