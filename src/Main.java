import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Бася", 5, 8);
        Animal animal2 = new Animal("Вася", 2, 3);
        Animal animal3 = new Animal("Кузя", 10, 4);
        Animal animal4 = new Animal("Мурка", 12, 2);
        Animal animal5 = new Animal("Тузик", 7, 14);
        Animal animal6 = new Animal("Шарик", 4, 7);

        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        animals.add(animal6);

        animals.stream()
                .filter(element -> element.getAge() > 5)
                .forEach(System.out::println);
        System.out.println("---------------");
        animals.stream()
                .filter(element -> !element.getName().equals("Тузик"))
                .forEach(System.out::println);
        System.out.println("---------------");
        animals.stream()
                .filter(element -> element.getName().equals("Кузя"))
                .map(element -> element.getName().toUpperCase())
                .forEach(System.out::println);
        System.out.println("---------------");


    }
}

