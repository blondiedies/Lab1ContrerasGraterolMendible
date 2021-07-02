package lab1;
import java.util.Scanner;

class Menu{
        
        Scanner entrada = new Scanner(System.in);
        
	public Menu(){}
	public int principal(){
		int opcion = 0;
		while ( opcion < 1 || opcion > 7){
			System.out.println(".......MENU......");
		    System.out.println("1. Introducir persona");
		    System.out.println("2. Imprimir Datos");
		    System.out.println("3. Consultar sexo ");
		    System.out.println("4. Consultar si es mayor de edad");
		    System.out.println("5. Opciones Entrenador");
		    System.out.println("6. Opciones Deportista");
		    System.out.println("7. Salir");
		    System.out.print("Elija una opcion: ");	
		    opcion = entrada.nextInt();
		    System.out.println("\n");
		    System.out.println("\n");
		}
		return opcion;
	}

	public void introducirPersona(Deportista deportista, Entrenador entrenador){
		int opcion = 0;
		while(opcion < 1 || opcion > 3){
	      	System.out.println("1. Agregar Entrenador");
	     	System.out.println("2. Agregar Deportista"); 
	      	System.out.println("3. Regresar al menu anterior");
	      	System.out.print("Elija una opcion: ");
	      	opcion = entrada.nextInt();
	      	System.out.println("\n\n"); 
		}
		switch (opcion){
			case 1: 
				entrenador.setDatosEntrenador();
				break;
			case 2:
				deportista.setDatosDeportista();
				break;
			default:
				break;
		}
	}
		
	public void imprimirDatos(Deportista deportista, Entrenador entrenador){
		int opcion = 0;
		while( opcion < 1 || opcion > 3){
          System.out.println("1. Imprimir datos de Entrenador");
          System.out.println("2. Imprimir datos de Deportista"); 
          System.out.println("3. Regresar al menu anterior");
          System.out.print("Elija una opcion: ");
          opcion = entrada.nextInt();
          System.out.println("\n\n"); 
		}
		switch (opcion){
			case 2:
				deportista.imprimirDatosPer();
				break;
			case 1:
				entrenador.imprimirDatosPer();
				break;
			default:
				break;
		}
	}

	public void consultarSexo(Deportista deportista, Entrenador entrenador){
		int opcion = 0;
		while(opcion < 1 || opcion > 2){
	      	System.out.println("1. Consultar sexo de Entrenador");
	     	System.out.println("2. Consultar sexo de Deportista"); 
	     	System.out.print("Elija una opcion: ");
	      	opcion = entrada.nextInt();
	      	System.out.println("\n\n"); 
		}
		char sexo = 't';
		switch (opcion){
			case 2:
				if (deportista.getSexo() == 'F')
					sexo = 'F';
				else
					sexo = 'M';
				break;
			case 1:
				if (entrenador.getSexo() == 'F')
					sexo = 'F';
				else
					sexo = 'M';
				break;
			default:
				break;
		}
		if (sexo == 'F') {
			System.out.print("Femenino");
	      	System.out.println("\n\n");
		}else{
			System.out.print("Masculino");
	      	System.out.println("\n\n");
		}
	}

	public void esMayorEdad(Deportista deportista, Entrenador entrenador){
		int opcion = 0;
		while(opcion < 1 || opcion > 2){
	      	System.out.println("1. Consultar si el entrenador es mayor de edad");
	     	System.out.println("2. Consultar sexo de deportista es mayor de edad"); 
	     	System.out.print("Elija una opcion: ");
	      	opcion = entrada.nextInt();
	      	System.out.println("\n"); 
		}

		int edad = 0;
		switch(opcion){
			case 1: 
				edad = entrenador.getEdad();
				break;
			case 2:
				edad = deportista.getEdad();
				break;
		}

		if(edad < 18){
			System.out.print("No es mayor de edad");
		}else{
			System.out.print("Es mayor de edad");
		}
		System.out.println("\n\n"); 
	}

	public void opcionesEntrenador(Deportista deportista, Entrenador entrenador){
		int opcion = 0;
		while(opcion < 1 || opcion > 2){
	      	System.out.println("1. Determinar rutina para deportista");
	     	System.out.println("2. Determinar objetivo para deportista"); 
	     	System.out.print("Elija una opcion: ");
	      	opcion = entrada.nextInt();
	      	System.out.println("\n\n"); 
		}

		switch (opcion){
			case 1:
				entrenador.determinarRutina(deportista.calcularIMC(), deportista.getTipoEjercicio());
				System.out.println("\n\n"); 
				break;
			case 2:
				entrenador.determinarRutina(deportista);
				System.out.println("\n\n"); 
				break;
			default:
				break;
		}
	}

	public void opcionDeportista(Deportista deportista, Entrenador entrenador){
		int opcion = 0;
		while(opcion < 1 || opcion > 2){
          	System.out.println("1. Calcular porcentaje de grasa corporal");
          	System.out.println("2. Verificar ritmo cardiaco");
	     	System.out.print("Elija una opcion: ");
	      	opcion = entrada.nextInt();
	      	System.out.println("\n"); 
		}

		switch(opcion){
			case 1:
				System.out.println("Porcentaje de grasa corporal:"+ deportista.calcularIMC());
			case 2:
				deportista.esMayor();
		}
	}
}