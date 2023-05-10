public class Danser extends Person{
    String groupName;

    public Danser(String name,String designer,String groupName){
        super(name,designer);
        this.groupName=groupName;
    }
    public String getCompanyName(){
        return groupName;
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
    public void densing(){
        System.out.println("Densing to ");
    }

    @Override
    public String toString() {
        return "Dancer: " +
                "name: "+getName()+"\n" +
                "designation: "+getDesignation()+"\n" +
                "groupName: " + groupName;
    }
}
