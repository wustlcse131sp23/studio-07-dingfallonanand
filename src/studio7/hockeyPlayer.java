package studio7;

public class hockeyPlayer {
private String name;
private int number;
private int goals;
private int assists;
private String shoot;
private String handed;

public hockeyPlayer(String n, int num, String s, String h) {
	this.name = n;
	this.number = num;
	this.shoot = s;
	this.handed = h;
}


public int getGoals() {
	return goals;
}

public void setGoals(int goals) {
	this.goals+=goals;
}

public int getAssists() {
	return assists;
}

public void setAssists(int assists) {
	this.assists = this.assists + assists;
}

public void setName(String name) {
	this.name = name;
}

public void setNumber(int number) {
	this.number = number;
}

public void setShoot(String shoot) {
	this.shoot = shoot;
}

public void setHanded(String handed) {
	this.handed = handed;
}

public void game(int g, int a) {
	setAssists(a);
	setGoals(g);
}
public int points() {
	return this.goals+this.assists;
}
}
