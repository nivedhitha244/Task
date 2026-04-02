class Name{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}
public class getterSetter {
    public static void main(String[] args){
    Name n=new Name();
    n.setName("NIVEDHITHA");
    System.out.println(n.getName());
    }

    
}