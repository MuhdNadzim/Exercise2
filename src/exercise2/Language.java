package exercise2;

public class Language {
    String lang;
    
Language(){
}
Language(String l){
    this.lang=l;
}
public void displayLang(){
    System.out.println("Language");
    Language lg = new Language("Bahasa Melayu (100%)");
    Language lg1 = new Language("Bahasa Inggeris (70%)");
    System.out.println("1."+lg.lang);
    System.out.println("2."+lg1.lang);

}
}
