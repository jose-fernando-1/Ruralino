package Controllers;

import Models.Presente;
import dados.InterfacePresente;
import dados.*;

import java.util.*;

public class PresenteControlador {
    private List<Presente> presentes;

    private InterfacePresente repositorioPresentes;

    private static PresenteControlador instance;

    private PresenteControlador()
    {
        repositorioPresentes = RepositorioPresentes.getInstanceRepositorioPresentes();
    }






}
