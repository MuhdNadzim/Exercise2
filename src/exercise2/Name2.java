package exercise2;

public class Name2 {
    int age;
    String name,birthday,address,martial_status,citizenship,phoneno;
    char gender;

    
    Name2(){//default constructor
        this.name="Muhamad Nadzim Bin Ahmad Zaki";
        this.age=22;
        this.birthday="20 June 1998";
        this.gender='M';
        this.martial_status="Single";
        this.citizenship="Malaysia";
        this.address="No 24, Jalan Bunga Tanjung, Taman Pertama, 45200 Sabak Bernam, Selangor";
        this.phoneno="0174394734";
    }
public void printName(){
    Name2 obj1 = new Name2();
 
    System.out.println("Name: "+obj1.name+"\nAge: "+obj1.age+"\nBirthday: "+obj1.birthday+"\nGender: "+obj1.gender+"\nMartial Status: "+obj1.martial_status+"\nCitizenhsip: "+obj1.address+"\nNo. Phone: "+obj1.phoneno);

}
}


