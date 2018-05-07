package pksoft;

import java.io.*;

public class first {

	public static void main(String args[]) throws IOException{ 
		 String str ="******************";
		 byte[] byt = str.getBytes();
		 ByteArrayInputStream bis = new ByteArrayInputStream(byt);
		 PushbackInputStream pis = new PushbackInputStream(bis);
		 int pk;
		 while((pk=pis.read())!=-1) {
			 if(pk=='*') {
				 int j;
				 if((j=pis.read())=='*') {
					 System.out.print("##");
				 }else {
					 pis.unread(pk);
					 System.out.println((char)pk);

				 }
			 }else {
				
				 System.out.println((char)pk);
				 
			 }
		 }
				
	}

		
}
