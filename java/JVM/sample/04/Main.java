import java.io.*;

class Main{
	static{
		System.out.println("Main static");
	}

	public static void main(String[] args) throws IOException{
		System.out.println("main");
		new T();
		System.in.read();
	}
}