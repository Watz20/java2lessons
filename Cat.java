package homework1;

public class Cat implements Competitable {
    private int jumpHeight;
    private int runLength;
    private boolean atDistance;

    public Cat(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
        atDistance = true;
    }

    @Override
    public void jump(int height) {
        if (jumpHeight >= height && atDistance) {
            System.out.println("Кот перепрыгнул");
        } else if (atDistance) {
            System.out.println("Кот не смог перепрыгнуть");
            atDistance = false;
        } else {
            System.out.println("Кот давно выбыл");

        }
    }

    @Override
    public void run(int length) {
        if (runLength >= length && atDistance) {
            System.out.println("Кот пробежал");
        } else if (atDistance) {
            System.out.println("Кот не смог пробежать");
        } else {
            System.out.println("Кот давно выбыл");
        }

    }
}
