package com.o19s;

import java.nio.charset.Charset;
import com.foundationdb.Database;
import com.foundationdb.FDB;
import com.foundationdb.Transaction;

/**
 * FoundationDB
 * Hello world!
 * 
 * This example is based on FoundationDB's hello world example:
 * http://foundationdb.com/documentation/beta1/javadoc/index.html
 *
 */
public class Example 
{
    public static void main( String[] args ) throws Throwable
    {
    	FDB fdb = FDB.selectAPIVersion(21);
    	Database db = fdb.open().get();
    	
    	Charset c = Charset.forName("UTF-8");
    	
    	Transaction tr = db.createTransaction();
    	tr.set("Hello".getBytes(c), "World".getBytes(c));
    	tr.commit().get();
    	
    	tr = db.createTransaction();
    	byte[] result = tr.get("Hello".getBytes(c)).get();
    	System.out.println("Hello" + new String(result, c));
    	
        System.out.println( "Hello World!" );
        
        fdb.dispose();
    }
}