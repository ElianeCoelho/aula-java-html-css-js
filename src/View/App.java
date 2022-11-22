package View;
import model.Cachorro;

class App{
    public static void main(String[] args) {
        
        Cachorro dog = new Cachorro();

        dog.setNome("Simba");
        dog.setRaca("VL");

        if(dog.getNome()=="Simba"){
        dog.late();
    }
    
    




    }
}