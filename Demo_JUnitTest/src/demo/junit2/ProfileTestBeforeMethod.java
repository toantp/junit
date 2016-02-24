package demo.junit2;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.Test;

import demo.junit.objects.*;


public class ProfileTestBeforeMethod {
	private Profile profile;
	private BooleanQuestion question;
	private Criteria criteria;
	
	
	@After
	public void initialized() {
		System.out.println("initialized");
		
		profile = new Profile("Toan Ton");
		question = new BooleanQuestion(1, "Keep calm and try hard");
		criteria = new Criteria();
	}
	
	@Test
	public void testMatchAnswerFalseWhenMustMatchCriteriaNotMet() {
		System.out.println("testMatchAnswerFalseWhenMustMatchCriteriaNotMet");
		Answer profileAnswer = new Answer(question, Bool.FALSE);
		profile.add(profileAnswer);
		Answer criteriaAnswer = new Answer(question, Bool.TRUE);
		Criterion criterion = new Criterion(criteriaAnswer, Weight.MustMatch);
		criteria.add(criterion);
		
		boolean matches = profile.matches(criteria);
		assertFalse(matches);
	}
	
	@Test
	public void testMatchAnswerTrueForDontCare() {
		System.out.println("testMatchAnswerTrueForDontCare");
		Answer profileAnswer = new Answer(question, Bool.FALSE);
		profile.add(profileAnswer);
		Answer criteriaAnswer = new Answer(question, Bool.TRUE);
		Criterion criterion = new Criterion(criteriaAnswer, Weight.DontCare);
		criteria.add(criterion);

		boolean matches = profile.matches(criteria);
		assertFalse(matches);
	}
}
