package controller;

import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Maquina;

public class MaquinaController {

    public Stack<Maquina> filtrarPorSubred(List<Maquina> maquinas, int umbral){
        Stack<Maquina> maquinasOrdenadas=new Stack<>();

        
        for(int i=0;i<maquinas.size();i++){
            int valor=maquinas.get(i).getSubred();
            if(valor>100){
                maquinasOrdenadas.add(maquinas.get(i));
            }
        }
        return maquinasOrdenadas;

    }

    public static TreeSet<Maquina> ordenarPorSubred(Stack<Maquina> pila) {
        
        return null;
    }

    public TreeMap<Integer, Queue<Maquina>> agruparPorRiesgo(List<Maquina> maquinas){
        return null;

    }

    public Stack<Maquina> explotarGrupo(Map<Integer, Queue<Maquina>> mapa){
        return null;

    }
    
}
