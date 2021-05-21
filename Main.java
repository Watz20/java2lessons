package homework1;

public class Main {
    public static void main(String[] args) {
        CanJump[] jumpers = {new Cat(4, 12), new Human(6, 11), new Robot(3, 15)};
        CanRun[] runners = {new Cat(4, 12), new Human(6, 11), new Robot(3, 15)};

        Competitable[] competitors = {new Cat(4, 12), new Human(6, 11), new Robot(3, 15)};

        Overcomeable[] obstacles = {new Wall(5), new Road(11)};

        for (Overcomeable overcomeable : obstacles) {
            for (Competitable competitable : competitors) {
                overcomeable.overcome(competitable);
            }

        }
    }
}
