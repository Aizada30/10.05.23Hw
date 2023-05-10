public class Programmer extends Person{

    String companyName;

    public Programmer(String name,String designer,String companyName){
        super(name,designer);
        this.companyName=companyName;
    }
    public String getCompanyName(){
        return companyName;
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }
    public void coding(){
        System.out.println("Write the cod ");
    }

    @Override
    public String toString() {
        return "Programmer: " +
                "name: "+getName()+"\n" +
                "designation: "+getDesignation()+"\n" +
                "companyName='" + companyName;
    }
}
