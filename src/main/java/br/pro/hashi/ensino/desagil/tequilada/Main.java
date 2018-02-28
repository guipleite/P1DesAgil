package br.pro.hashi.ensino.desagil.tequilada;
import java.io.*;
import java.util.LinkedList;


//public class Main {
	//	public static void main(String[] args) {
		//	System.out.println("Projeto 1");
			
	//	}
//}


public class Main {
    public static void main(String [] args) {
        
        
        String fileName = "C:/Users/Usuario/Desktop/Insper/2018/DES/1/P1DesAgil/Tabuleiro.txt";
        String line = null;
        
        try {
            FileReader fileReader = 
                new FileReader(fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            int num_line = 0;

            while((line = bufferedReader.readLine()) != null) {
            	int col = 0;
            	
            	if (num_line > 0){
                    LinkedList<String> Lista = new LinkedList<>();
            		String array[] = line.split("");
            		
            		while(col < array.length){
        				if(array[col].equals("#")){
                    		array[col]= "X";
            				}
        				Lista.add(array[col]);
            			col++;
            		}
            		String myString = String.join("", Lista);
            		System.out.println(myString);
        		}
            	num_line++;    	
            }   // fecha o while
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        }
    }
}
