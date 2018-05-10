package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Control {
	
		private static final String RUTA = "clientesAñadidos.txt"; 

		private File archivo;

		public Control() {
			crearArchivo();
		}

		public boolean guardar(String texto) {
			try {
				BufferedWriter bufferedW = abrirFlujoTextoW();
				bufferedW.write(texto+"@");
				bufferedW.flush();// Vacia el bufferedW
				bufferedW.close();
			} catch (IOException e) {
				return false;
			}
			return true;
		}

		public String leer() {
			StringBuilder texto = new StringBuilder();
			String lineaLeida = "Vacio";
			try {
				BufferedReader bufferedR = abrirFlujoTextoR();
				
				while((lineaLeida = bufferedR.readLine())!= null) {
					texto.append(lineaLeida);
					
				}
				
				
				bufferedR.close();
			} catch (IOException e) {

			}
			return texto.toString();
		}

		private BufferedReader abrirFlujoTextoR() throws FileNotFoundException {
			FileReader fileReader = new FileReader(archivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			return bufferedReader;
		}

		private BufferedWriter abrirFlujoTextoW() throws IOException {
			// FileWriter fileWriter= new FileWriter(archivo); Asi se sobreescribe cada vez
			// que guardemos
			FileWriter fileWriter = new FileWriter(archivo, true);// Ponemos true para guardar varias veces y no
																	// sobreescribir
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			return bufferedWriter;
		}

		private void crearArchivo() {
			archivo = new File(RUTA);
			if (!archivo.exists()) {
				try {
					archivo.createNewFile();
				} catch (IOException e) {

				}
			}

		}

}
