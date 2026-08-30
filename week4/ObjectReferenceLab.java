class ScoreBox {
    private int score;

    public ScoreBox(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative");
        }

        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("Score cannot be negative");
        }

        this.score = score;
    }
}

public class ObjectReferenceLab {

    static void addBonus(ScoreBox box, int bonus) {
        box.setScore(box.getScore() + bonus);
    }

    static void replaceLocally(ScoreBox box) {
        box = new ScoreBox(100);
        System.out.println("Inside replaceLocally: " + box.getScore());
    }

    static ScoreBox createScoreBox(int score) {
        return new ScoreBox(score);
    }

    public static void main(String[] args) {

        ScoreBox box1 = new ScoreBox(50);
        ScoreBox alias = box1;

        ScoreBox box2 = new ScoreBox(50);

        System.out.println("box1 score: " + box1.getScore());
        System.out.println("alias score: " + alias.getScore());
        System.out.println("box2 score: " + box2.getScore());

        System.out.println("\nReference comparisons:");
        System.out.println("box1 == alias: " + (box1 == alias));
        System.out.println("box1 == box2: " + (box1 == box2));

        alias.setScore(70);

        System.out.println("\nAfter changing score through alias:");
        System.out.println(box1.getScore());
        System.out.println(alias.getScore());
        System.out.println(box2.getScore());

        addBonus(box1, 10);

        System.out.println("\nAfter addBonus(box1, 10):");
        System.out.println(box1.getScore());
        System.out.println(alias.getScore());

        replaceLocally(box1);

        System.out.println("\nAfter replaceLocally(box1):");
        System.out.println(box1.getScore());
        System.out.println(alias.getScore());

        ScoreBox box3 = createScoreBox(90);

        System.out.println("\nNew object returned by createScoreBox:");
        System.out.println(box3.getScore());

        System.out.println("\nFinal reference comparisons:");
        System.out.println("box1 == alias: " + (box1 == alias));
        System.out.println("box1 == box2: " + (box1 == box2));
        System.out.println("box1 == box3: " + (box1 == box3));
        System.out.println("box2 == box3: " + (box2 == box3));
    }
}


