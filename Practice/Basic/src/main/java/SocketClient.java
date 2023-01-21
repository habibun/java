/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
import java.io.*;  
import java.net.*;  
public class SocketClient {  
    public static void main(String[] args) {  
        try{      
            Socket s=new Socket("localhost",6666);  
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
            dout.writeUTF("Hello Server");  
            dout.flush();  
            dout.close();  
            s.close();  
        }catch(Exception e){
            System.out.println(e);
        }  
    }  
}  
