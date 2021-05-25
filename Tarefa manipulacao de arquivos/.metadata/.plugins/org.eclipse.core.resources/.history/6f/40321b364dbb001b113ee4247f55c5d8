package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		
		IArquivosController arquivoController = new ArquivosController();
		String diretorio = "C:\\temp";
		String nome = "generic_food.csv";
		
		try{
			arquivoController.readFile(diretorio, nome);
		} catch (IOException e){
			e.printStackTrace();
		}
	}

}
