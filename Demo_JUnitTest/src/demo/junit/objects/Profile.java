package demo.junit.objects;

import java.util.HashMap;
import java.util.Map;

public class Profile {
	private Map<String, Answer> answers = new HashMap<String, Answer>();
	private int score;
	private String name;

	public Profile(String _name) {
		// TODO Auto-generated constructor stub
		this.name = _name;
	}

	public String getName() {
		return name;
	}

	public void add(Answer answer) {
		answers.put(answer.getQuestionText(), answer);
	}

	public boolean matches(Criteria criteria) {
		score = 0;

		boolean kill = false;
		boolean anyMatches = false;
		for (Criterion criterion : criteria) {
			Answer answer = answers.get(criterion.getAnswer().getQuestionText());
			System.out.println("criterion " +criterion.getWeight());
			boolean match = criterion.getWeight() != Weight.DontCare || answer.match(criterion.getAnswer());
			System.out.println("sf " + (criterion.getWeight() == Weight.DontCare));
			if (!match && criterion.getWeight() == Weight.MustMatch) {
				System.out.println("a");
				kill = true;
			}else {
				score += criterion.getWeight().getValue();
			}
			anyMatches |= match;
		}
		if (kill) {
			return false;
		}
		
		return anyMatches;
	}

	public int getScore() {
		return score;
	}
	
}
