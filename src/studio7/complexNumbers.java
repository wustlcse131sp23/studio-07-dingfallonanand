package studio7;

public class complexNumbers {
	private double real;
	private double imaginary;
	
public complexNumbers(double a, double b) {
	this.real = a;
	this.imaginary = b;
}

public void setReal(double a) {
	this.real = a;
}

public void setImaginary(double b) {
	this.imaginary = b;
}

public double getReal() {
	return this.real;
}

public double getImg() {
	return this.imaginary;
}

public complexNumbers getSum(complexNumbers a, complexNumbers b) {
	return new complexNumbers(a.real+b.real, a.imaginary+b.imaginary);
}

public complexNumbers getProduct(complexNumbers a, complexNumbers b) {
	return new complexNumbers(a.real*b.real-a.imaginary*b.imaginary, a.real*b.imaginary+a.imaginary*b.real);
}


}
