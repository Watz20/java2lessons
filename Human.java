package homework1;

public class Human implements Competitable {
    private int jumpHeight;
    private int runLength;
    private boolean atDistance;

    public Human(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
        atDistance = true;

    }

    @Override
    public void jump(int height) {
        if (jumpHeight >= height && atDistance) {
            System.out.println("Человек перепрыгнул");
        } else if (atDistance) {
            System.out.println("Человек не смог перепрыгнуть");
            atDistance = false;
        } else {
            System.out.println("Человек выбыл");
        }

    }

    @Override
    public void run(int length) {
        if (runLength >= length && atDistance) {
            System.out.println("Человек пробежал");
        } else if (atDistance) {
            System.out.println("Человек не смог пробежать");
            atDistance = false;
        } else {
            System.out.println("Человек давно выбыл");
        }

    }
}
