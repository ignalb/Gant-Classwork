package chapter06;

public class Project6_3 {

	public static void main(String[] args){
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(3, 5);
		
		System.out.print(f1 + " + " + f2 + " = "); f1.add(f2);		System.out.println(f1);
		System.out.print(f1 + " - " + f2 + " = "); f1.subtract(f2);	System.out.println(f1);
		System.out.print(f1 + " * " + f2 + " = "); f1.multiply(f2);	System.out.println(f1);
		System.out.print(f1 + " / " + f2 + " = "); f1.divide(f2);	System.out.println(f1);
		
	}
	
}

class Fraction extends Number {
	private static final long serialVersionUID = -782497252345360986L;
	
	protected int numerator;
	protected int denominator;
	
	public Fraction(int n, int d){
		numerator = n;
		denominator = d;
	}

	@Override
	public double doubleValue() {
		return (double) numerator / denominator;
	}
	@Override
	public float floatValue() {
		return (float) numerator / denominator;
	}
	@Override
	public int intValue() {
		return numerator / denominator;
	}
	@Override
	public long longValue() {
		return (long) numerator / denominator;
	}
	
	public int getNumerator(){
		return numerator;
	}
	public int getDenominator(){
		return denominator;
	}
	
	public void add(Fraction f){
		numerator = getNumerator() * f.getDenominator() + f.getNumerator() * getDenominator();
		denominator = getDenominator() * f.getDenominator();
	}
	public void subtract(Fraction f){
		numerator = getNumerator() * f.getDenominator() - f.getNumerator() * getDenominator();
		denominator = getDenominator() * f.getDenominator();
	}
	public void multiply(Fraction f){
		numerator *= f.getNumerator();
		denominator *= f.getDenominator();
	}
	public void divide(Fraction f){
		numerator *= f.getDenominator();
		denominator *= f.getNumerator();
	}
	
	public String toString(){
		return numerator + "/" + denominator;
	}

	
}
