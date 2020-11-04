package exercise2;

public class WorkSkill {
    String wrk;
    
WorkSkill(){
}

WorkSkill(String w){
    this.wrk=w;
}
public void displayWork(){
    System.out.println("Work Experiences");
    WorkSkill work1=new WorkSkill("Graphic Designner");
    System.out.println("1."+work1.wrk);
}
}
