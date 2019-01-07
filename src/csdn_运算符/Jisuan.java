package csdn_运算符;

public class Jisuan {

//	public static void main(String[] args) {
//		boolean a=false;
//		boolean b=true;
//		System.out.println(!a);//结果为true
//		System.out.println(!b);//结果为false
//	}
	
//	
//	public static void main(String[] args) {
//		int a=10;
//		System.out.println(Integer.toBinaryString(a));//输出a的二进制形式，结果1010
//		System.out.println(Integer.toBinaryString(a>>3));//有符号右移三位，结果1
//		System.out.println(Integer.toBinaryString(a<<3));//左移三位，结果1010000
//		System.out.println(Integer.toBinaryString(a>>>3));//无符号右移三位，结果1
//	}
	
//	public static void main(String[] args) {
//		int a=10;
//		int b=8;
//		System.out.println(a>b);//true
//		System.out.println(a>=b);//true
//		System.out.println(a==b);//false
//		System.out.println(a!=b);//true
//	}
	
//	public static void main(String[] args) {
//		String name="csdn";
//		boolean result=name instanceof String;
//		System.out.println(result);//结果true
//	}
	
//	public static void main(String[] args) {
//		boolean a=true;
//		boolean b=false;
//		System.out.println(a&&b);//false
//		System.out.println(a||b);//true
//		System.out.println(!a);//false
//		System.out.println(!b);//true
//	}
	
	public static void main(String[] args){
	      int a , b;
	      a = 10;
	      //如果a=1成立，则b的值为20，不成立，b的值为30
	      b = (a == 1) ? 20 : 30;
	      System.out.println( "Value of b is : " +  b );//结果Value of b is :30
	 
	      //如果a=10成立，b的值为20，不成立，b的值为30
	      b = (a == 10) ? 20 : 30;
	      System.out.println( "Value of b is : " + b );//结果Value of b is :20
	   }
}
