package Controlador;

public class ListaEnlazada {
        private Nodo head;
        
        public ListaEnlazada(){
            head=null;
        }
        
        public void add(Objetos objeto){
            Nodo nuevoNodo=new Nodo(objeto);
            
            if(head==null){
                head=nuevoNodo;
            }else{
                Nodo current=head;
                while(current.next !=null){
                    current=current.next;
                }
                current.next=nuevoNodo;
            }
        }
        
        public void imprimir(){
            if(head==null){
                System.out.println("Lista vacia");
            }
            
            Nodo current=head;
            while(current!=null){
                System.out.println(current.objeto);
                current=current.next;
            }
        }
}


