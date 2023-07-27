
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MineSweeper {
    int RowNumber;
    int ColumnNumber;

    char[][] Table;
    char[][] MineTable;

    public MineSweeper(int RowNumber, int ColumnNumber ){
        this.RowNumber = RowNumber;
        this.ColumnNumber= ColumnNumber;
        this.Table =new char[RowNumber][ColumnNumber];
        this.MineTable =new char[RowNumber][ColumnNumber];
        StartMatrix();
        CreateMine();
    }
    //The initial matrix creates in this method.
    public void  StartMatrix(){
        for (int i =0; i<RowNumber;i++){
            for(int j=0; j<ColumnNumber; j++){
                this.Table[i][j] = '-';

            }
        }
    }
     //Mines are created randomly and MinesTable are created.(NumberofElements/4)
    public void  CreateMine(){
        for(int i=0; i<this.RowNumber;i++){
            Arrays.fill(this.MineTable[i], '-');
        }

        Random random = new Random();
        for (int i =0; i<((this.RowNumber*this.ColumnNumber)/4); i++){
            int RowValue =random.nextInt((this.RowNumber));
            int ColumnValue =random.nextInt((this.ColumnNumber));
            this.MineTable[RowValue][ColumnValue] = ('*');            
        }  
    }
    public boolean isValidIndex (int row,int Column){
        return (row >= 0 && row<this.RowNumber ) && (Column >= 0 && Column<this.ColumnNumber );
    }
    //counting numbers of bomb around the cell
    public int SurroundingMines (int row,int column){
        int count = 0;
        for(int i=(row-1);i<= row+1;i++){
                for(int j=(column-1); j<= column+1;j++){
                    if(isValidIndex(i, j) && this.MineTable[i][j] == '*' ){
                        count ++;
                    }
                }
            }
            return count;
    } 
    
    //minesweeper game plays at Run method.
    public void Run(){
        PrintGame();
        Scanner inp = new Scanner(System.in);
        int opened= 0;
        int remainingCells = RowNumber*ColumnNumber-(RowNumber*ColumnNumber/4);
        while  (opened < remainingCells){
            System.out.println("Enter Row Number : ");
            int RowPoint = inp.nextInt();
            System.out.println("Enter Column Number : ");
            int ColumnPoint = inp.nextInt();
        if(!isValidIndex(RowPoint, ColumnPoint)){
            System.out.println("numbers entered are outside the map");
            continue;
        }  
        if(MineTable[RowPoint][ColumnPoint] == '*'){
            System.out.println("Game Over ! ");
            return;
        }
        if (isValidIndex(RowPoint, ColumnPoint)){
            //converting count to char
            int a = SurroundingMines(RowPoint, ColumnPoint);            
            char b = (char)(a +'0');
            //counting opened cell
                if (Table[RowPoint][ColumnPoint] !=b){
                Table[RowPoint][ColumnPoint] =(b);
                opened++;
                //return true;
            }
            PrintGameStages(Table);
        }
        }
        System.out.println("Well Done ! You won");
        inp.close();
        }

    
    

   //prints two dimensional arrays
        public void PrintGameStages(char[][] Table){
        for (int i=0; i<Table.length;i++){
            for (int j=0; j<Table[i].length;j++){
                System.out.print(Table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==========================");
    }

    //prints every game stages
    public void PrintGame(){
            
        System.out.println("Location of Mines");
        PrintGameStages(this.MineTable);
        System.out.println("Welcome MineSweeper Game ! ");
    }
    }

