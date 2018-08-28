package com.devon.exe02;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.nio.file.attribute.BasicFileAttributes;



/**
 *
 * @author marcel
 */
public class ExeSlide15 {
    public static void main(String[] args) throws IOException{
        Path atual = Paths.get("");
        atual = atual.toAbsolutePath();

        System.out.println(atual);
        boolean t = Files.isDirectory(atual);
        System.out.println("É diretório "+(t?"Sim":"Não"));
        System.out.format("Tamanho: %d %n", Files.size(atual));
        System.out.println("Proprietário: "+Files.getOwner(atual).getName());
        System.out.format("getFileName: %s%n", atual.getFileName());
        System.out.format("getName(0): %s%n", atual.getName(0));
        System.out.format("getNameCount: %d%n", atual.getNameCount());
        System.out.format("subpath(0,2): %s%n", atual.subpath(0,2));
        System.out.format("getParent: %s%n", atual.getParent());
        System.out.format("getRoot: %s%n", atual.getRoot());
        
        System.out.println("\nAtributos ---->");        
        BasicFileAttributes attrs = Files.readAttributes(atual, BasicFileAttributes.class);
        System.out.println("Diretorio? "+attrs.isDirectory());
        System.out.println("Último acesso:"+attrs.lastAccessTime());
        System.out.println("Modificado em:"+attrs.lastModifiedTime());
        System.out.println("Tamanho:"+attrs.size());
        
        System.out.println("\nConteúdo do diretório:");
        DirectoryStream<Path> stream = Files.newDirectoryStream(atual);
        for (Path p: stream){
            System.out.println(p.getFileName());
        }
        
        Path arquivo = Paths.get("teste.txt");
        Files.deleteIfExists(arquivo);
        Files.createFile(arquivo);
       
        
        Path diretorio = Paths.get("Teste");
        if (!Files.exists(diretorio)){
            Files.createDirectory(diretorio);
        }
        
        Path novo = diretorio.resolve(arquivo);
        Files.move(arquivo, novo, REPLACE_EXISTING);
      
    }
    
}
