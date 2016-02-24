package demo.junit.interfaces;

@FunctionalInterface
public interface Scoreable {
	int getScore();
	default void defaultMethod(){
		
	}
	
	default int getScore2() {
		return 0;
	}
}
