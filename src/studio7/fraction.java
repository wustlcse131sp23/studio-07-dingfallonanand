package studio7;

public class fraction {
	private int numerator;
	private int denominator;

	public fraction(int n, int d) {
		this.numerator = n;
		this.denominator = d;
	}

	public void setNumerator(int n) {
		this.numerator = n;
	}

	public void setDenominator(int d) {
		this.denominator = d;
	}

	public int getNumerator() {
		return this.numerator;
	}

	public int getDenominator() {
		return this.denominator;
	}

	public String getSum(fraction a, fraction b) {
		int numerator = a.numerator * b.denominator + b.numerator * a.denominator;
		int denominator = a.denominator * b.denominator;
		return numerator + "/" + denominator;
	}

	public String getProduct(fraction a, fraction b) {
		int numerator = a.numerator * b.numerator;
		int denominator = a.denominator * b.denominator;
		return numerator + "/" + denominator;
	}

	public fraction getReciprocal(fraction a) {
		return new fraction(a.denominator, a.numerator);
	}

	public fraction getSimplify(fraction a) {
		if (a.numerator == a.denominator) {
			return new fraction(1, 1);
		} else if (a.numerator > a.denominator) {
			for (int i = a.numerator; i > 0; i--) {
				if (a.numerator % i == 0 && a.denominator % i == 0) {
					return new fraction(a.numerator / i, a.denominator / i);
				}
			}
		} else {
			for (int i = a.denominator; i > 0; i--) {
				if (a.numerator % i == 0 && a.denominator % i == 0) {
					return new fraction(a.numerator / i, a.denominator / i);
				}
			}
		}
		return a;
	}
}
