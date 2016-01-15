package me.imfrozen;

public class rechner {
	public static int note = 1;
	int a = 0, b = 0, c = 0;
	public static double sa_ges = 0;
	
	int sa1 = (Integer) FrameA.sa1.getValue();
	int sa2 = (Integer) FrameA.sa2.getValue();
	int sa3 = (Integer) FrameA.sa3.getValue();
	int sa4 = (Integer) FrameA.sa4.getValue();
	int sa5 = (Integer) FrameA.sa5.getValue();
	int sa6 = (Integer) FrameA.sa6.getValue();
	int sa7 = (Integer) FrameA.sa7.getValue();
	int sa8 = (Integer) FrameA.sa8.getValue();
	
	int ex1 = (Integer) FrameA.ex1.getValue();
	int ex2 = (Integer) FrameA.ex2.getValue();
	int ex3 = (Integer) FrameA.ex3.getValue();
	int ex4 = (Integer) FrameA.ex4.getValue();
	int ex5 = (Integer) FrameA.ex5.getValue();
	int ex6 = (Integer) FrameA.ex6.getValue();
	int ex7 = (Integer) FrameA.ex7.getValue();
	int ex8 = (Integer) FrameA.ex8.getValue();

	int af1 = (Integer) FrameA.af1.getValue();
	int af2 = (Integer) FrameA.af2.getValue();
	int af3 = (Integer) FrameA.af3.getValue();
	int af4 = (Integer) FrameA.af4.getValue();
	int af5 = (Integer) FrameA.af5.getValue();
	int af6 = (Integer) FrameA.af6.getValue();
	int af7 = (Integer) FrameA.af7.getValue();
	int af8 = (Integer) FrameA.af8.getValue();

	
	int sa = 0, ex = 0, af = 0, exaf = 0;
	
	{
	//SCHULAUFGABEN
	if (sa1 >= 1){
		a++;
	}
	if (sa2 >= 1){
		a++;
	}
	if (sa3 >= 1){
		a++;
	}
	if (sa4 >= 1){
		a++;
	}
	if (sa5 >= 1){
		a++;
	}
	if (sa6 >= 1){
		a++;
	}
	if (sa7 >= 1){
		a++;
	}
	if (sa8 >= 1){
		a++;
	}
	
	//EXEN
	if (ex1 >= 1){
		b++;
	}
	if (ex2 >= 1){
		b++;
	}
	if (ex3 >= 1){
		b++;
	}
	if (ex4 >= 1){
		b++;
	}
	if (ex5 >= 1){
		b++;
	}
	if (ex6 >= 1){
		b++;
	}
	if (ex7 >= 1){
		b++;
	}
	if (ex8 >= 1){
		b++;
	}
	
	//ABFRAGEN
	if (af1 >= 1){
		c++;
	}
	if (af2 >= 1){
		c++;
	}
	if (af3 >= 1){
		c++;
	}
	if (af4 >= 1){
		c++;
	}
	if (af5 >= 1){
		c++;
	}
	if (af6 >= 1){
		c++;
	}
	if (af7 >= 1){
		c++;
	}
	if (af8 >= 1){
		c++;
	}
	
	//AUSRECHNEN
	sa = sa1+sa2+sa3+sa4+sa5+sa6+sa7+sa8;
	ex = (ex1+ex2+ex3+ex4+ex5+ex6+ex7+ex8) / b;
	af = (af1+af2+af3+af4+af5+af6+af7+af8) / c;
	exaf = ex + af;
	note = (sa + exaf) / a++ ;
	}
}
