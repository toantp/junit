package demo.junit.dataccess;

import java.util.ArrayList;
import java.util.List;

import demo.junit.interfaces.Scoreable;

public class ScoreCollection {
	private List<Scoreable> scores = new ArrayList<Scoreable>();
	
	public void add(Scoreable scoreable) {
		scores.add(scoreable);
	}
	
	public int arithmeticMean() {
		int toTotal = scores.stream().mapToInt(Scoreable::getScore).sum();
		return toTotal / scores.size();
	}
}
