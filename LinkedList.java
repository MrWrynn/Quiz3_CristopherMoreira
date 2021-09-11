
public class LinkedList {
    private Node cabeza;
    private Node ultimo;
    private int size;

    public LinkedList() {
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.cabeza == null;
    }

    public int size() {
        return this.size;
    }

    public void insertNode(Object data) { /** */
        Node newNode = new Node(data);
        if (this.cabeza == null) { //Si la cabeza está vacía:
            this.cabeza= newNode; //La cabeza es igual al nuevo nodo
            this.cabeza.siguiente=null; //El siguiente elemento de la cabeza está vacío
            this.cabeza.anterior=null; //El anterior elemento de la cabeza también está vacío
            this.ultimo=this.cabeza; //El ultimo elemento de la lista es la cabeza
            this.size++; //Aumenta el tamaño de la lista
        }else { //Si la cabeza no está vacía:
            this.ultimo.siguiente=newNode; //El siguiente elemento del ultimo es el nuevo nodo
            newNode.anterior=this.ultimo; //El elemento anterior del nuevo nodo es el ultimo elemento
            newNode.siguiente=null; //El elemento siguiente al nuevo nodo está vacío
            this.ultimo=newNode; //El ultimo elemento ahora es el nuevo nodo
            this.size++; //Aumenta el tamaño de la lista
        }
    }

    public Node deleteFirst() { /** este metodo sirve para eliminar el primer elemento de la lista */
        if (this.cabeza != null) {
            Node temp = this.cabeza;
            this.cabeza = this.cabeza.siguiente;
            this.size--;
            return temp;
        } else {
            return null;
        }
    }
    public Node getcabeza(){ /**Obtiene la cabeza de la lista */
        return this.cabeza;
    }

    public void recorrer() { /**Recorre la lista doblemente enlazada e imprime todos sus elementos */
        Node runner=this.cabeza;
        while (runner !=null){
            System.out.println(runner.getData());
            runner=runner.siguiente;

        }
    }

    
}
