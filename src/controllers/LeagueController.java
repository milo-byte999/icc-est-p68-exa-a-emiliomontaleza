package controllers;

import models.League;

public class LeagueController {

    /**
     * FILA A - Implementar este metodo con Selection Sort ascendente.
     * Ordena el arreglo de ligas de menor a mayor segun getTotalActiveGoals().
     *
     * Nombre exacto requerido: sortSelectionAsc
     *
     * @param leagues Arreglo de ligas a ordenar
     * @return Arreglo ordenado
     */
    public League[] sortSelectionAsc(League[] leagues) {
        // TODO: Implementar (solo si su fila es A)
        throw new UnsupportedOperationException("Metodo sortSelectionAsc no implementado");
    }

    /**
     * FILA B - Implementar este metodo con Insertion Sort descendente.
     * Ordena el arreglo de ligas de mayor a menor segun getTotalActiveGoals().
     *
     * Nombre exacto requerido: sortInsertionDesc
     *
     * @param leagues Arreglo de ligas a ordenar
     * @return Arreglo ordenado
     */
    public League[] sortInsertionDesc(League[] leagues) {

        for(int i=1; i<leagues.length; i++){

            League key = leagues[i];
            int j=i-1;

            while(j>=0 && leagues[j].getTotalActiveGoals() < key.getTotalActiveGoals()){
                leagues[j+1] = leagues[j];
                j--;
            }
            leagues[j+1]= key;
        }
        return leagues;
    }

    /**
     * TODOS - Implementar busqueda binaria por goles activos totales.
     *
     * El arreglo recibido ya fue ordenado con el metodo de su fila.
     * Implemente la busqueda conforme al orden que aplico:
     * - Fila A: arreglo ascendente, use logica de busqueda ascendente.
     * - Fila B: arreglo descendente, use logica de busqueda descendente.
     *
     * Nombre exacto requerido: binarySearchByTotalActiveGoals
     *
     * @param leagues          Arreglo de ligas ya ordenado
     * @param totalActiveGoals Total de goles activos a buscar
     * @return La liga encontrada, o null si no existe
     */
    public League binarySearchByTotalActiveGoals(League[] leagues, int totalActiveGoals) {
        int izq=0;
        int dere=leagues.length-1;

        while(dere>izq){
            int mid = (izq+dere)/2;
            int current = leagues[mid].getTotalActiveGoals();
            if(mid==current){
                return leagues[mid];
            }
            if(dere>current){
                current = mid -1;
            }else{
                current = mid +1;
            }
        }
        return null;
    }

    /**
     * Imprime el arreglo de ligas en consola.
     *
     * @param leagues Arreglo de ligas a imprimir
     */
    public void printLeagues(League[] leagues) {

        for(League league: leagues){
            System.out.println(league.getLeagueName()+"-"+league.getTotalActiveGoals());
        }

    }
}
