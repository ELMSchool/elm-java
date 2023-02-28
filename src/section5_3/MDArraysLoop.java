package section5_3;

public class MDArraysLoop {
	
	public static void main(String[] args) {
		

		String [] carBrandsOfUSA = {"Ford", "Lincoln", "GMC", "Tesla"};
		
		String [] carBrandsOfGermany = {"Mercedes", "BMW", "Volkswagen", "Audi"};
		
		String [] carBrandsOfItaly = {"Ferrari", "Maserati", "Fiat", "Bugatti"};
		
		
		String[][] topCarBrands = {carBrandsOfUSA, carBrandsOfGermany, carBrandsOfItaly};
		
		
		for (int i =0; i < topCarBrands.length; i++) {
			
			for (int k = 0; k < topCarBrands[0].length; k++) {
				
				String car = topCarBrands[i][k];//0,0  0,1  0,2  0,3
												//1,0  1,1  1,2  1,3	
				System.out.println(car);		//2,0  2,1  2,2  2,3
			}
			
		}
		
		
	}

}
