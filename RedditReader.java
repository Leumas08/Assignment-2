import java.io.IOException;
import java.io.*;
import java.util.regex.*;

public class RedditReader {
	String filename;
	RedditReader()
	{
		filename="";
	}
	public String[] names() {
		String author[] = null;
		String it = null;
		 try {
			 int i=1;
			 int j=0;
		FileReader file1=new FileReader("redditAutors.txt");
		FileReader authfile=new FileReader("redditAutors.txt");
        BufferedReader authors = new BufferedReader(authfile);
        BufferedReader file2= new BufferedReader(file1);
		 while ((authors.ready())) {
        	it=(authors.readLine());
        	i= i+1;
		 }
		 String[] authortry= new String[i];
		 while (file2.ready()) {
			 authortry[j]= (file2.readLine());
			 j= j+1;
		 }
		  author=authortry;
		 }catch (IOException e) {
    			System.out.println("Sorry an error has occured");
    		}
		return author;
	} 
	public String[] posts() {
		 String[] post= null;
		try {
			 int i=0;
			 int j=0;
			 
			 String usless;
		FileReader post1=new FileReader("redditPosts.txt");
		FileReader post2=new FileReader("redditPosts.txt");
		BufferedReader readpost1= new BufferedReader(post1);
		BufferedReader readpost2= new BufferedReader(post2);
		 while (readpost1.ready()) {
			 usless=(readpost1.readLine());
			 i= i+1;
		 }
		 String[] posts= new String[i];
		while (readpost2.ready()) {
			posts[j]= (readpost2.readLine());
			j=j+1;
		}
		post=posts;
		 }catch (IOException e) {
   			System.out.println("Sorry an error has occured");
   		}
		return post;
		 }
}
