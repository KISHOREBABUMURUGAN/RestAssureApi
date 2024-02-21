package com_restassureAPI_Automation_;

public class MethodChaining {
public static MethodChaining a1() {
	System.out.println("al");
	return new MethodChaining();
	
	
}
public static MethodChaining a2() {
	System.out.println("a2");
	return new MethodChaining();
	
}
public static  MethodChaining a3() {
	System.out.println("a3");
	return new MethodChaining();
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//MethodChaining methodchaining=new MethodChaining();
//methodchaining.a1().a2().a3();
		a1().a2().a3();
	}

}
