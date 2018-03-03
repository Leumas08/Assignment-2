
public class Test {


	public static void main(String[] args) {
		int j=0;
		int finalcount=0;
		int finalcount1=0;
		String[]author = null;
	    String[]post;
	    String[] postsplit1;
	    String space=" ";
	    int split1length= 0;
	    int currentcount=0;
	    
	    RedditReader info= new RedditReader();
	    author= info.names();
	    post= info.posts();
	    int postslength=post.length;
	    for (int i=0; i<postslength; i++) {
	    	postsplit1=post[i].toLowerCase().split(space);
	    	currentcount=postsplit1.length;
	    	
	    	for (j=0; j<currentcount;j++) {
	    		postsplit1[j]=postsplit1[j].replace(".", "");
	    		if (postsplit1[j].equals("russia")) {
	    			finalcount=finalcount+1;
	    		}else if(postsplit1[j].equals("russian")) {
	    			finalcount1=finalcount1+1;
	    		}
	    	}
	    }
	    System.out.println("'Russia' is mentioned "+ finalcount+ " times in the entire post.");
	    System.out.println("'Russian' is mentioned "+ finalcount1+" times in the entire post.");
    }
	}