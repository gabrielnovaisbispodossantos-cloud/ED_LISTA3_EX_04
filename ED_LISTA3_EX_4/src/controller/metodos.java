package controller;

public class metodos {
 public metodos () {
	 super();
 }
 
 public String converter (int n) {
	 // quando n for 0 ou 1
	 if (n<=1) {
		 return String.valueOf(n);
	 }
	 return converter(n / 2) + (n % 2);
 }
 
 
 
 
 
 
}
