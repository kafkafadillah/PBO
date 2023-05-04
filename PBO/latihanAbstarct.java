
//class Hero
abstract class Hero {
    private String name;
    private int level;


    //constructor
    public Hero (String name){
        this.name = name;
        this.level = 1;
    }

    //method abstract levelUp
    public abstract void levelUp();

    //method setLevel
    public void setLevel(int deltaLevel){
        this.level += deltaLevel;


    }

    //method display
    public void display(){
        System.out.println("Hero \t\t: " + this.name);
        System.out.println("Level \t: " + this.level);
    }

}


//class Ronaldo
class Ronaldo extends Hero {

    //constructor 
    public Ronaldo(String name){
        super(name);
    }

    //method abstract levelUp
    public void levelUp(){
        this.setLevel(10);
    }

} 

//class Messi
class Messi extends Hero{

    //constructor
    public Messi(String name){
        super(name);
    }

    //method abstract
    public void levelUp(){
        this.setLevel(8);
    }
}

//class Haaland
class Haaland extends Hero{

    //constructor
    public Haaland(String name){
        super(name);
    }

    //method abstract
    public void levelUp(){
        this.setLevel(9);
    }
}

//class Mbappe
class Mbappe extends Hero{

    //constructor
    public Mbappe(String name){
        super(name);
    }

    //method abstract
    public void levelUp(){
        this.setLevel(7);
    }
}


public class latihanAbstarct {
    public static void main (String[] args){

        //objek Ronaldo
        Ronaldo Hero1 = new Ronaldo("Ronaldo");
        
        //objek Messi
        Messi Hero2 = new Messi("Messi");

        //objek Haaland
        Haaland Hero3 = new Haaland("Haaland");

        //objek Mbappe
        Mbappe Hero4 = new Mbappe("Mbappe");

        ///////////////////////////////////////////////////////

        Hero1.levelUp();
        Hero1.display();

        Hero2.levelUp();
        Hero2.display();

        Hero3.levelUp();
        Hero3.display();

        Hero4.levelUp();
        Hero4.display();
    }
    
}
