package com.example.homebanking.Banco;

public class ListaEnlazada {
    private Nodo primero;
    public int tamaño;

    public ListaEnlazada() {
        this.primero = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String username, String password,String nombre, String apellido) {

        Nodo nuevo = new Nodo(username,password,nombre,apellido);

        if (vacia()) {
            // agregamos el primer nodo
            this.primero = nuevo;
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = this.primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.tamaño++;
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            // se tiene que recorrer la lista hasta llegar al ultimo nodo
            Nodo aux = primero;
            Nodo nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            // Verifico si realmente avanzó en la lista hasta llegar al
            // último nodo que sea distinto del primero.
            // Si estoy en el primero, entonces lo hago null para indicar que la lista esta vacia.
            if (aux == this.primero) {
                this.primero = null;
            } else {
                // Le indico al nodo anterior que no apunte más al nodo a eliminar "aux".
                nodoAnterior.siguiente = null;
            }

            // Decremento el tamaño
            this.tamaño--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacia");
        } else {
            Nodo aux = this.primero;
            for(int i = 0; i<this.tamaño; i++) {
                System.out.println(aux.username+" "+aux.password+" "+aux.nombre+" "+aux.apellido+" "+aux.getCVU()+" "+aux.getSaldo());
                aux = aux.siguiente;
            }
        }
    }
}
