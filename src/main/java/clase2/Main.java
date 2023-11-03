package clase2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> stringLista= new ArrayList<String>();
		stringLista.add("hola");
		stringLista.add("hola2");
		stringLista.add("hola3");
		stringLista.add("hola4");
		stringLista.add("chau");
		EditaString aMayuscula = s -> s.toUpperCase(); 
		
		stringLista = transformador(stringLista, aMayuscula);
		
		stringLista.forEach(s -> System.out.println(s));
		
		stringLista.replaceAll(String::toLowerCase);
		stringLista.forEach(s -> System.out.println(s));
		
		

	}
	
	public static List<String> transformador(List<String> stringLista, EditaString transformacion) {
		
		List <String> resultado = new ArrayList<String>();
		
		for (String string : stringLista) {
			resultado.add(transformacion.editarString(string));
		}
		
		return resultado;
	}
	
}