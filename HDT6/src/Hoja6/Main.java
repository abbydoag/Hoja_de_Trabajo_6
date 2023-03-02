package Hoja6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	private static String readProducts(String productFile) throws FileNotFoundException {
		BufferedReader productScan=new BufferedReader(new FileReader(productFile));
		String product="";
		try { 
			product=productScan.readLine();
			
			while (product!=null) {
				System.out.println(product);
				product=productScan.readLine();
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(product);		
		return product;
	}
	public static void main(String[]args) throws FileNotFoundException{
		String inventory=readProducts("src/Hoja6/ListadoProducto.txt");
		String selling=(inventory);
		System.out.println("Productos: "+selling);
		}
}
