package demo.junit2;

import static org.junit.Assert.*;

import org.junit.Test;

import demo.junit.objects.*;

public class ProfileTest {

	/*@Test
	public void testAdd1() {
		//fail("Not yet implemented");
		Profile profile = new Profile("Bull Hockey, Inc.");
		Question question = new BooleanQuestion(1, "Got bonuses?");
		Criteria criteria = new Criteria();
		Answer criteriaAnswer = new Answer(question, Bool.TRUE);
		Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
		criteria.add(criterion);
	}*/

	@Test
	public void testAdd2() {
		//fail("Not yet implemented");
		System.out.println("testAdd2");
		Profile profile = new Profile("Bull Hockey, Inc.");
		Question question = new BooleanQuestion(1, "Got bonuses?");
		Criteria criteria = new Criteria();
		Answer profileAnswer = new Answer(question, Bool.FALSE);
		Answer criteriaAnswer = new Answer(question, Bool.TRUE);
		profile.add(profileAnswer);
		Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
		criteria.add(criterion);
	}
	
	@Test
	public void testMatchAnswerFalseWhenMustMatchCriteriaNotMet() {
		System.out.println("testMatchAnswerFalseWhenMustMatchCriteriaNotMet");
		Profile profile = new Profile("Bull Hockey, Inc.");
		Question question = new BooleanQuestion(1, "Go milk ?");
		Criteria criteria = new Criteria();
		Answer profileAnswer = new Answer(question, Bool.FALSE);
		Answer criteriaAnswer = new Answer(question, Bool.TRUE);
		Criterion criterion = new Criterion(criteriaAnswer, Weight.DontCare);
		profile.add(profileAnswer);
		criteria.add(criterion);
		
		boolean matches = profile.matches(criteria);
		assertFalse(matches);
	}
}
