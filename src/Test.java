import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s = "Srikrishna" + System.lineSeparator() + "Iyer";
		Scanner sc= new Scanner(System.in);
		String file = sc.next();
		write(s,file);
	}

	private static void write(String Transactions, String outputFileName) throws IOException {
		//System.out.println(Transactions);
		File f = new File(outputFileName);
		if (!f.exists() || !f.canWrite())
			System.err.println("Error: file " + outputFileName + " cannot be opened for writing!!!");

		FileWriter fw = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fw);

		try {
			br.write(Transactions);
		} catch (IOException e) {
			System.err.println("Error: file " + outputFileName + " cannot be opened for writing");
		}finally{
			br.flush();
			br.close();
		}
	}}
