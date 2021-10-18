package br.com.alura.java.io.teste;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {

	public static void main(String[] args) throws Exception {
		String s = "ç'";
		System.out.println(s.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.println(bytes.length + " , windows-1252" );
		
		
		String str = new String(bytes, "windows-1252");
		System.out.println(str);
		
		bytes = s.getBytes("UTF-16");
		System.out.println(bytes.length + " , UTF-16" );
		str = new String(bytes, "windows-1252");
		System.out.println(str);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length + " , US_ASCII" );
		str = new String(bytes, "windows-1252");
		System.out.println(str);

	}

}
