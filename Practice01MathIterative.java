public class Practice01MathIterative implements Practice01Math{

	public int fact(int n) throws Exception{
		if(n < 0){
			throw new IllegalArgumentException("Input cannot be negative");
		}
		int fact = 1;
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
		return fact;
	}
	public int fib(int n) throws Exception{
		if(n < 0){
			throw new IllegalArgumentException("Input cannot be negative");
		}
		if(n == 0 || n == 1){
			return n;
		}
		int fib = 1;
		int prevFib = 1;
		for(int i = 2; i < n; i++){
			int temp = fib;
			fib += prevFib;
			prevFib = temp;
		}
		return fib;
	}
}