package csdn_�����;

public class Jisuan {

//	public static void main(String[] args) {
//		boolean a=false;
//		boolean b=true;
//		System.out.println(!a);//���Ϊtrue
//		System.out.println(!b);//���Ϊfalse
//	}
	
//	
//	public static void main(String[] args) {
//		int a=10;
//		System.out.println(Integer.toBinaryString(a));//���a�Ķ�������ʽ�����1010
//		System.out.println(Integer.toBinaryString(a>>3));//�з���������λ�����1
//		System.out.println(Integer.toBinaryString(a<<3));//������λ�����1010000
//		System.out.println(Integer.toBinaryString(a>>>3));//�޷���������λ�����1
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
//		System.out.println(result);//���true
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
	      //���a=1��������b��ֵΪ20����������b��ֵΪ30
	      b = (a == 1) ? 20 : 30;
	      System.out.println( "Value of b is : " +  b );//���Value of b is :30
	 
	      //���a=10������b��ֵΪ20����������b��ֵΪ30
	      b = (a == 10) ? 20 : 30;
	      System.out.println( "Value of b is : " + b );//���Value of b is :20
	   }
}
