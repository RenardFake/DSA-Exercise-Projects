package arraysThings;

public class Main {
    //Dito nalang ako mag check baka masira ko code
    public static void main(String[] args) {
      GameEntry p1= new GameEntry("Wonka", 23);
      GameEntry p2= new GameEntry("Eri", 25);
      Scores s = new Scores();
      s.add(p1);
      String overall =s.toString();
      System.out.println(overall);
     
    }
}
