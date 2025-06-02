package Q_01;

public class Q_01 {
    // Q_01/Pet.java
    public class Pet {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String petName) {
            name = petName;
        }

        public String speak() {
            return "I'm your cuddly little pet.";
        }
    }

    // Q_01/Dog.java
    public class Dog extends Pet {
        @Override
        public String speak() {
            return "Woof!";
        }
    }

    // Q_01/Cat.java
    public class Cat extends Pet {
        @Override
        public String speak() {
            return "Meow!";
        }
    }

}
