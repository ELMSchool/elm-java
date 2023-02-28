package section5_3;
import java.util.*;
public class MultiDimnesionalArraysIntro {
	
	public static void main(String[] args) {
		
		
		String [] countries = {"USA", "Germany", "Italy", "Japan"};
		
		
		String [] carsBrandsOfUSA = {"Ford", "Lincoln", "GMC", "Tesla"};
		
		String [] carsBrandsOfGermany = {"Mercedes", "BMW", "Volkswagen", "Audi"};
		
		String [] carsBrandsOfItaly = {"Ferrari", "Maserati", "Fiat", "Bugatti"};
		
		String [] carsBrandsOfJapan = {"Toyota", "Honda", "Nissan", "Acura"};
		
		String [][] carBrands = new String [4][];
		
		carBrands[0] = carsBrandsOfGermany;
		carBrands[1] = carsBrandsOfUSA;
		carBrands[2] = carsBrandsOfItaly;
		carBrands[3] = carsBrandsOfJapan;		
		
		String car = carBrands[2][3];
		System.out.println(car);
		
		/*
		 * {		0			   1				2			 3	
		 * 	0	{"Mercedes", 	"BMW",        "Volkswagen",    "Audi"}
		 * 	1	{"Ford",     	"Lincoln",    "GMC",           "Tesla"}
		 * 	2	{"Ferrari",  	"Maserati",   "Fiat", 		   "Bugatti"}
		 * 	3	{"Toyota",   	"Honda",      "Nissan", 	   "Acura"}
		 * }
		 * 
		 * */
		
		
//		String [][] worldCarBrands =  {carsBrandsOfGermany, carsBrandsOfUSA, carsBrandsOfItaly, carsBrandsOfJapan};
		
	
		
		
		
	}

}
