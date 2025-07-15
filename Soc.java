import java.net.*;
import java.io.*;
public class  Soc{
    public static void main(String args[]) throws Exception
    {// Socket:Hostname + portNumber
        int c;
    
            Socket so = new Socket("whois.internic.net",43);
    
        
            InputStream in = so.getInputStream();
            OutputStream out = so.getOutputStream();
            String str = (args.length == 0?"msrit.edu":args[0]);
            str +="\r\n";
            byte buf[] = str.getBytes();
            
            out.write(buf);
        
            while((c=in.read())!=-1)
            {
            System.out.print((char)c);
            }
        
    }
    
}