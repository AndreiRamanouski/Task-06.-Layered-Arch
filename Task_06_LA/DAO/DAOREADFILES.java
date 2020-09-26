package DAO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DAOREADFILES {
	
	public void readAdults(){
		try{
			FileReader reader = new FileReader("C:\\Work\\ListOfBooksAdults.txt");
			FileReader reader2 = new FileReader("C:\\Work\\ExistedBooksAdults.txt");
			 int c;
	            while((c=reader.read())!=-1){
	                 
	                System.out.print((char)c);}
	            
	            
	            while((c=reader2.read())!=-1){
	                 
	                System.out.print((char)c);}
		reader.close();
		reader2.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
        } catch(IOException e){
          System.out.println(e.getMessage());
        }
		
	}

	public void readJuniors() {
		try(FileReader reader = new FileReader("C:\\Work\\ListOfBooksJuniors.txt")){
			FileReader reader2 = new FileReader("C:\\Work\\ExistedBooksJuniors.txt");
			
			 int c;
	            while((c=reader.read())!=-1){
	                 
	                System.out.print((char)c);}
	            while((c=reader2.read())!=-1){
	                 
	                System.out.print((char)c);}
	    reader.close();
	    reader2.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
        } catch(IOException e){
          System.out.println(e.getMessage());
        }
		
	}
	
	
	public List<String> readUsers() throws DAOEXception {
		List<String> list = new ArrayList<>();
		try(FileReader reader = new FileReader("C:\\Work\\ListOfUsers.txt")){
			FileReader reader2 = new FileReader("C:\\Work\\ExistedUsers.txt");
			
			String str = "";
			 int c;
	            while((c=reader.read())!=-1){
	            	str += (char)c;
	                 list.add(str);}
	            while((c=reader2.read())!=-1){
	                 str += (char)c;
	                 list.add(str);
	                }
	    reader.close();
		reader2.close();
	    return list;
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
        } catch(IOException e){
          System.out.println(e.getMessage());
        }
		throw new DAOEXception ("Something went wtong");
	}
}
