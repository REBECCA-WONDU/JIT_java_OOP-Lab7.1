class Animal {
    String name;

    public void eat() {
        System.out.println("I can eat meat");
    }
}
        class dog extends Animal {

            public void display() {
                System.out.println("what is your name" + name);
            }
            }
            class Main{
                public static void main(String[] args) {
                  dog obj=new dog();
                    obj.name = "huskey";
                    obj.display();
                    obj.eat();

                }
            }