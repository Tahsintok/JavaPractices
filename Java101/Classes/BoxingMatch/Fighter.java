


public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    

    public Fighter(String name,int damage,int health,int weight, double dodge){
        this.name =name;
        this.damage = damage;
        this.health =health;
        this.weight =weight;
        this.dodge = dodge;
        

    }

    public int hit(Fighter Opponent) {
        System.out.println("---------");
        System.out.println(this.name + " => " + Opponent.name + "\t" + this.damage + " hit");
        
        if (Opponent.dodge()) {
            System.out.println(Opponent.name + " dodged hit");
            return Opponent.health;
        }
    
        if (Opponent.health - this.damage < 0){
            return 0;
        }

        return Opponent.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() *100;
        return randomValue <= this.dodge;
    }

}