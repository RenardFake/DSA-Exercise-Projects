package arraysThings;

public class Scores {
    public static final int MaxEntries =10;
    protected int numEntries;
    protected GameEntry[] entries; //a class that has two attributes

    public Scores(){
        entries = new GameEntry[MaxEntries];
        numEntries =0;
    }
    
    
    //Exepected output [name , score ]???
    //this area i will learn some fundemental string manipulations
    //this are also represent how the array was used in real world 
    //and it kinda pretty handy
    public String toString(){//print function
        String s = "[";
        for(int i=0; i<MaxEntries;i++){
            if(i>0){
                s+=" , "; // create a seperation
            }
            s+=entries;
        }
        return s + "]";
    }

    //check the score if it High score if it is then place it
    //this is an example of insertion in array
    public void add(GameEntry e){
        int newScore = e.getScore();
        //let check if this a high score
        if(numEntries == MaxEntries){//check if array if full
            if(newScore<=entries[numEntries-1].getScore()){
                return; //return if not high score
            }
        }else{//means array not full
            numEntries++;
            int i = numEntries-1;
            //locate where the high score belongs
            for(;(i>=1)&&(newScore>entries[i-1].getScore());i--){
                entries[i] = entries[i-1]; // this a swapping algorithmn
                entries[i]=e;
            }

        } 
    }
    //imprementation of deletion of an array with exception method
    public GameEntry remove(int i) throws IndexOutOfBoundsException{
        if((i<0)||(i>=numEntries)){
            throw new IndexOutOfBoundsException("Invalid index: "+i);
        } 
         GameEntry temp = entries[i]; //temporary store
            for(int j=i;j<numEntries-1;j++){
                entries[j]=entries[j+1];//move the cell to the left 
            }
               entries[numEntries-1]=null;//null the last score
                numEntries--;
                return temp; //return the remove object
    }

}
