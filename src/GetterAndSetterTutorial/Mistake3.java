package GetterAndSetterTutorial;

public class Mistake3 {
    private int[] scores = new int[6];

    public void displayScores() {
	int lengthScores = scores.length;
	for (int i = 0; i < lengthScores; i++) {
	    System.out.print(this.scores[i] + "/");
	}
	System.out.println();
    }

    public int[] getScores() {
	return scores;
	//return scores.clone();//nen lam nhu the nay
    }

    public void setScores(int[] scores) {
	this.scores = scores.clone();
    }
}
