package homework1;

public class Robot implements Competitable {
    private int jumpHeight;
    private int runLength;
    private boolean atDistance;

    public Robot(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
        atDistance = true;
    }

    @Override
    public void jump(int height) {
        if (jumpHeight >= height && atDistance) {
            System.out.println("Робот перепрыгнул");
        } else if (atDistance) {
            System.out.println("Робот не смог перепрыгнуть");
            atDistance = false;
        } else {
            System.out.println("Робот выбыл");
        }

    }

    @Override
    public void run(int length) {
        if (runLength >= length && atDistance) {
            System.out.println("Робот пробежал");
        } else if (atDistance) {
            System.out.println("Робот не смог пробежать");
            atDistance = false;
        } else {
            System.out.println("Робот давно выбыл");
        }
    }
}
