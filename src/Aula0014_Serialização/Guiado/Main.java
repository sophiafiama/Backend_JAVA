package Aula0014_Serialização.Guiado;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cachorro> cachorros = new ArrayList<>();

        Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Nayla");
        cachorro1.setIdade(2);

        Cachorro cachorro2 = new Cachorro();
        cachorro1.setNome("Sheha");
        cachorro1.setIdade(3);

        Cachorro cachorro3 = new Cachorro();
        cachorro1.setNome("Margot");
        cachorro1.setIdade(4);

        Cachorro cachorro4 = new Cachorro();
        cachorro1.setNome("Bob");
        cachorro1.setIdade(13);

        cachorros.add(cachorro1);
        cachorros.add(cachorro2);
        cachorros.add(cachorro3);
        cachorros.add(cachorro4);

        FileOutputStream fo = null;

        try{
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream object = new ObjectOutputStream(fo);
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        //



    }

}
