public class Queue {
    private LinkedList QueueList;

    public Queue(){
        QueueList=new LinkedList();
    }

    public void enqueue(Object data){ /**Encola un elemento */
        this.QueueList.insertNode(data);
    }
    public Node dequeue(){ /**Desencola un elemento */
        return this.QueueList.deleteFirst();
    
    }
    public Node peek() {/**Obtiene la cabeza/primer elemento*/
        return this.QueueList.getcabeza();
    }
    public void recorrer(){/**Recorre la lista doblemente enlazada e imprime todos sus elementos */
        this.QueueList.recorrer();
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
            queue.enqueue(5);
            queue.enqueue(8);
            queue.enqueue(3);
            queue.enqueue(12);
            queue.enqueue(0);
            queue.enqueue(89);
            queue.enqueue(77);
            queue.dequeue();
            queue.dequeue();
            //queue.dequeue();
            queue.recorrer();
            /**
             * Los resultados son los esperados, pues despúes de encolar los números 5, 8, 3, 12, 0, 89 y 77
             * y desencolar tres veces, cuando se imprime la lista con el metodo recorrer(), el codigo imprime
             * toda la lista menos los tres primeros elementos que se desencolaron.
             */
    }
}

