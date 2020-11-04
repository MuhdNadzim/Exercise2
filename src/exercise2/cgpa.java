package exercise2;

public class cgpa {
    double cgpa1;
    double gpa[];
    double sum=0;
    double finalcgpa=0;

    cgpa(){
        this.cgpa1=3.5;
        this.gpa=new double[]{3.4,3.5,3.6,3.5};
    }
    
    cgpa(double bioCGPA, double bioGPA[]){
        this.cgpa1=bioCGPA;
        this.gpa=bioGPA;
    }
    public void printCGPA1(){
        System.out.println("CGPA: "+cgpa1);
    }
public void printGPA1(){
    System.out.println("Sem 1: "+gpa[0]);
    System.out.println("Sem 2: "+gpa[1]);
    System.out.println("Sem 3: "+gpa[2]);
    System.out.println("Sem 4: "+gpa[3]);
    }
    public double calculateCGPA(){
        for (int i=0; i<gpa.length; i++){
            sum+=gpa[i];
    }
     if (gpa.length != 0) { //!=not equal
      cgpa1 = sum / gpa.length;
    } else {
      cgpa1 = 0.0;
    }
        finalcgpa = sum/gpa.length;
        return finalcgpa;
        
}
}

