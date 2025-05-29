public class Tiger extends Animal{
    @Override
    public void voice() {
        System.out.println("Тигр говорит");

    }

    @Override
    public void eat(String food) {
        String еда = "Grass";
        if (еда =="Meat") {
            System.out.println("Любит кушать мясо");
        } else {
            System.out.println("Не доволен");
        }
    }
}