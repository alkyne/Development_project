package Food;


import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import java.awt.Component;
import javax.swing.*;
import javax.swing.table.*;

public class database {
	
	public static String no;
	static ArrayList<Integer> rest = new ArrayList<Integer>();
	static ArrayList<String> restname = new ArrayList<String>();
	static ArrayList<String> imgname = new ArrayList<String>();
	static int noOfrest = 0;
 
	//public static void main(String[] args)	{
	
	static void dbconn() {
				
		try{
				
			String driverName = "org.gjt.mm.mysql.Driver";
			String DBName = "development_project";
			String dbURL = "jdbc:mysql://13.124.93.183:3306/"+DBName+"?useSSL=false";
				
			Class.forName(driverName);
			Connection con  = DriverManager.getConnection(dbURL,"h3x0r","hackerh3x0r");
			System.out.println("Mysql DB Connection.");

			String price, group;
			//Scanner scan = new Scanner(System.in);
			
			//System.out.print("input price (0~2) : ");
			//price = scan.nextLine();
			//System.out.print("input group (0~5) : ");
			//group = scan.nextLine();
			
			group = String.valueOf(main.menu_num);
			price = String.valueOf(main.money_num);
			
			System.out.println("group : " + main.menu_num);
			System.out.println("price : " + main.money_num);
			
			rest.clear();
			restname.clear();
			imgname.clear();
			
			String SQL = "select * from restaurant where price="+price+" and `group` = "+group+";";
			// System.out.print(SQL);
			Statement stmt = con.createStatement();
			stmt.executeQuery(SQL);
			ResultSet result = stmt.executeQuery(SQL);
			
			while(result.next()) {
				
				// store data
				rest.add(noOfrest, Integer.parseInt(result.getString(1)));
				restname.add(noOfrest, result.getString(2));
				
				// print data
				System.out.print(result.getString(1)+"\t");
				System.out.print(result.getString(2)+"\t");
				System.out.println(result.getString(3)+"\t");
				noOfrest++;
				
				if(noOfrest == 2)
					break;

			} // end while

			con.close();            
			// System.out.println("no of restaurant : " + noOfrest);
			
			for(int i=0; i<noOfrest; i++) {
				//System.out.println(rest.get(i) + ".jpg");
				imgname.add(noOfrest, rest.get(i) + ".jpg");
				//System.out.println(imgname.get(i));
			}
		} // end try

		catch(Exception e) {
				System.out.println("Mysql Server Not Connection.");
				e.printStackTrace();
		} // end catch
		
		//new test1();
				
				
	} // end main
		
}
