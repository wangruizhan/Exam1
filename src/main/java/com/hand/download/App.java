package com.hand.download;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class App 
{
    public static void main( String[] args )
    {
    	String str = "http://www.manning.com/gsmith/SampleChapter1.pdf";	
    	
    	// 下载网络文件
        int bytesum = 0;
        int byteread = 0;


        try {
        	URL url = new URL(str);
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            
            FileOutputStream fs = new FileOutputStream("SampleChapter.pdf");

            byte[] buffer = new byte[1024];
            while ((byteread = inStream.read(buffer)) != -1) {
                fs.write(buffer, 0, byteread);
            }
            fs.close();
            inStream.close();
            
            System.out.println("文件已经下载完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    	
    	
    	
    	
    	

	}
	
	
    	
    		
    	
    	
} 
