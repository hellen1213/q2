package q2;

public class Driver {

	public static void main(String[] args) {
		String test = "+ 4 2";
		String[] test2 = {"*",  "8", "(", "+","7",  "12",  ")" };
		String[] test3 = {"+", "4", "2"};
		
		Operation op = new Operation();
				
	//	System.out.println(java.util.Arrays.toString(test.split(" ")));
	//	System.out.println(op.calExpression(test));
		
//		System.out.println(java.util.Arrays.toString(test2.split(" ")));
//		System.out.println(op.eval(test2));
//		System.out.println(op.eval(test3));
		op.printExpressionResult("+ 4 2");
	}

}
