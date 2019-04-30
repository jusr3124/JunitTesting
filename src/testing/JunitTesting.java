package testing;

public class JunitTesting {

	public int methodOne(int x) {
		return x * x;
	}

	public int methodTwo(String word) {
		int count = 0;
		for(int i = 0;  i < word.length(); i++) {
			if(word.charAt(i) == 'a' || word.charAt(i) == 'A') {
				count++;
			}
		}
		return count;
	}

}
