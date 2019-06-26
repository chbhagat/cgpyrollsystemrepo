package com.cg.payroll.main;
import java.util.*;

import com.cg.payroll.beans1.BankDetails;
import com.cg.payroll.beans1.Employees;

public class Mainclass {
	
private static int HDFC003;

public static void main(String[] args) {
		
		
	Employees emp=new Employees(101, "chetan", "bhagat", "IT", "SA", "bhagatchetan631@gmail.com", "ABCDES21", new BankDetails(1233214545, HDFC003, "HDFC"));
		 
System.out.println(emp.getBankdetail());
}
	}

