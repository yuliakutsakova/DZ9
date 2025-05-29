public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Кролик говорит");

    }
    @Override
    public void eat(String food) {
        String еда = "Grass";
        if (еда =="Grass") {
            System.out.println("Любит кушать травку");
        } else {
            System.out.println("Не доволен");
        }
    }
}
