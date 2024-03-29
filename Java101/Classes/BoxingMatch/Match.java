

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight =maxWeight;
        
    }


    public void run(){
        if (checkWeight()) {
            
            //if f1 starts.
            if (start()){    
                while (f1.health > 0 && f2.health > 0){
                    System.out.println("----Begin new Round-----");
                    f2.health = f1.hit(f2);
                    if (isWin()){
                        break;    
                    }
                    f1.health =f2.hit(f1);
                    if (isWin()){
                        break;
                    }
                    printScore();
            }
            //if f2 starts
            }else{
                while (f1.health > 0 && f2.health > 0){
                    System.out.println("----Begin new Round-----");
                    f1.health = f2.hit(f1);
                    if (isWin()){
                        break;    
                    }
                    f2.health =f1.hit(f2);
                    if (isWin()){
                        break;
                    }
                    printScore();
                }
            }
        }
        else{
            System.out.println("The weights of the athletes do not match.");
        }
    }

    public boolean start(){ 
        //this method helps to determine with probability which fighter will hit first.
        double randomValue = Math.random()*100; //0.0 to 99.9
        if (randomValue < 50){
            return true;
        }
        return false;
    }

    public boolean checkWeight(){
        return ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight));
        }
    
    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Winner is : " + f2.name);
            return true;
        } else if (f2.health == 0){
            System.out.println("Winner is : " + f1.name);
            return true;
        }

        return false;
    }

     public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Rest Health \t:" + f1.health);
        System.out.println(f2.name + " Rest Health \t:" + f2.health);
    }
    
    
}
