public class Singer extends Person{

    String bandName;

    public Singer(String name,String designer,String bandName){
        super(name,designer);
        this.bandName=bandName;

    }
    public String getBandName(){
        return bandName;
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void walk() {
        super.walk();
    }
    public void singing(){
        System.out.println("Singing to ");
    }
    public void playGitar(){
        System.out.println("Play with gitar ");
    }

    @Override
    public String toString() {
        return "Singer: " +
                "name: "+getName()+"\n" +
                "designation: "+getDesignation()+"\n" +
                "bandName: " + bandName ;
    }
}
