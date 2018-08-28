package fryTest;

public class FryCalculate {
	 private static int result=0; // 静态变量，用于存储运行结果
	 
	 public int add( int n) {
		 result = result + n;
		 return result;
	 }
	 
	 public int sub (int n) {
		 result = result - n;
		 return result;
	 }
	 
	 public int multi(int n) {
		 
		 result = result * n;
		 return result;
	 }
	 
	 public int divide(int n) {
		 result = result / n;
		 return result;
	 }

}
