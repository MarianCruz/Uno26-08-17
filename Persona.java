public class Persona{
	
	String name;
	String sexo;
	int edad;

public void caminar(){
	System.out.println(name + "Esta caminando");
}

public void estudiar(){
	
	 System.out.println(name+"Esta estudiando");


}

public void comer(String  comida){

 
 System.out.println(name +"Esta comiendo"+comida);
}

   
public void pedirCerveza(){

if(edad>=18){

	System.out.println("Dar Cerveza");
}
else{

System.out.println("No dar cerveza");

}

}
}

class Curso{
	
public static void main(String args[])
{
	
	Persona juan =new Persona();
	juan.name="JuanPerez";
	juan.sexo="M";
	juan.edad=22;
    juan.caminar();
    juan.estudiar();
    juan.comer("comida china");
    juan.pedirCerveza();


    Persona marian=new Persona();

    marian.name="Cruz Blas";
    marian.sexo="F";
    marian.edad=17;
    marian.caminar();
    marian.estudiar();
    marian.comer(" pescado");
    marian.pedirCerveza();
}
}




