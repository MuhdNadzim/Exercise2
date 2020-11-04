package exercise2;

public class PersonalSkill {
    String skill;
    
PersonalSkill(){
}
PersonalSkill(String t){
    this.skill=t;
}
public void displaySkill(){
    System.out.println("Personal Skills");
    PersonalSkill skill1=new PersonalSkill("MS Package (80%)");
    PersonalSkill skill2=new PersonalSkill("ADOBE Photoshop (70%)");
    PersonalSkill skill3=new PersonalSkill("NetBeans Programming (60%)");
    System.out.println("1."+skill1.skill);
    System.out.println("2."+skill2.skill);
    System.out.println("3."+skill3.skill);
}
}
