package studio7;

public class Dice {
private int sides;

public Dice(int side) {
	this.sides = side;
}

public void sides(int s) {
	this.sides = s;
}
public int getnumberSides() {
	return this.sides;
}

public int roll() {
	return (int) (Math.random()*this.sides)+1;
}


}
