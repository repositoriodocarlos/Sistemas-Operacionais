package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController{	
	
	private boolean readDir(String path) throws IOException {
		File diretorio = new File(path);
		if(diretorio.exists() && diretorio.isDirectory()){
			return true;
		}
		else{
			return false;
			
		}
	}

	@Override
	public void readFile(String path, String nome) throws IOException {
		boolean valid = readDir(path);
		File arquivo = new File(path, nome);
		if(arquivo.exists() && arquivo.isFile() && valid){
			FileInputStream fluxo = new FileInputStream(arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			String[] vetorLinha = linha.split(",");
			while(linha != null){
				if(vetorLinha[2].equals("Fruits")){
					System.out.println(vetorLinha[0] + "	" + vetorLinha[0]+ "	" + vetorLinha[3]);				
				}
				linha = buffer.readLine();
				if(linha != null){
					vetorLinha = linha.split(",");
				}				
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		}
		else{
			throw new IOException("Arquivo Inválido");
		}
		
	}
}
