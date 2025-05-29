public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Собака говорит");
    }

    @Override
    public void eat(String food) {
        String еда = "Meat";
        if (еда =="Meat") {
            System.out.println("Любит кушать мясо");
        } else {
                System.out.println("Не доволен");
            }
        }
    }


