package com_restassureAPI_Automation_;

import files.payload;
import io.restassured.path.json.JsonPath;
//without  API



public class Complexjsonparse {
public static void main (String []args) {
	JsonPath js=new JsonPath(payload.courseprice());
	/*Print No of courses returned by API*/
	int size=js.getInt("courses.size()");
	System.out.println(size);
	//Print Purchase Amount
	
	int total=js.getInt("dashboard.purchaseAmount");
	System.out.println(total);
	//Print Title of the first course

	String first_course=js.getString("courses[2].title");
	System.out.println(first_course);
	
//	Print All course titles and their respective Prices
	
	for (int i=0;i<size;i++)
	{
		System.out.println(  js.getString("courses["+i+"].title"));
		System.out.println(js.getInt("courses["+i+"].price"));
	}
	
	
	
	String cour=js.getString("courses[0]");
	System.out.println(cour);
	System.out.println("..................");
System.out.println(	"Print no of copies sold by RPA Course");

for(int i=0;i<size;i++) {
	String iter=js.getString("courses["+i+"].title");
	
	if(iter.equalsIgnoreCase("RPA")) {
		System.out.println(js.getInt("courses["+i+"].copies"));
		break;
	}
	
		}
	
}
}
