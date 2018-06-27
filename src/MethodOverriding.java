public class MethodOverriding {
    public static void main(String[] args) {
        Animals human = new Animals();
        Animals doggie = new Puppy();
        human.motion();
        doggie.motion();

    }

static class Animals{
        public  void motion(){
            System.out.println("Human beings can move");
        }
}

static class  Puppy extends  Animals{
    @Override
    public void motion() {
        System.out.println("Puppys can move and bark");
    }
}

}
