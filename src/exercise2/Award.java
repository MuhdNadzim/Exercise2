package exercise2;

public class Award {
    String awd;
    
Award(){
}

Award(String a){
    this.awd=a;
}
public void displayAward(){
    System.out.println("Award & Certificate");
    Award awrd = new Award("Malaysia University English Test - Band 3");
    Award awrd1 = new Award("Dean for Last Semester");
    System.out.println("1."+awrd.awd);
    System.out.println("2."+awrd1.awd);

}
}
