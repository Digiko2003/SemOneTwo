package lISTA;

//By Jesus Maldonado Cruz and Diego Arturo enriquez Mercado
public class ListaEnlazadaTrabajadores {
    private Trabajador1 head;
    private Trabajador1 tail;
    private int length;

    class Trabajador1{
        String name;
        String puesto;
        double salario;
        Trabajador1 next;

        Trabajador1(String name, String puesto, double salario){
            this.name=name;
            this.puesto=puesto;
            this.salario=salario;
        }
    }
    public ListaEnlazadaTrabajadores(String name, String puesto, double salario){
        Trabajador1 newNode = new Trabajador1(name, puesto, salario);
        head = newNode;
        tail = newNode;
        length= 1;
    }
    public void printllist(){
        System.out.println("La lista de empleados es: ");
        if (isEmpty()){
            System.out.println("La lista esta vacia: ");
            return;
        }
        System.out.printf("%-20s%-20s%8s%n","Nombre","Puesto","Salario");
        Trabajador1 temp = head;
        while (temp != null){
            System.out.printf("%-20s%-20s%8.2f%n",temp.name,temp.puesto
                    ,temp.salario);
            temp = temp.next;
        }
        System.out.println();
    }
    public void sumar(){
        Trabajador1 temp= head;
        double total=0;
        while(temp != null){
            total= total+ temp.salario;
            temp=temp.next;
        }
        System.out.println("La suma de los salarios es: "+total);
    }
    public void getHead(){
        System.out.println("Head: "+head.name);
    }
    public void getTail(){
        System.out.println("Tail: "+tail.name);
    }
    public void getLength(){
        System.out.println("Empleados: "+length);
    }
    public void append(String name, String puesto, double salario){
        Trabajador1 newNode= new Trabajador1(name,puesto,salario);
        if(length==0){
            head= newNode;
            tail= newNode;
        } else {
            tail.next=newNode;
            tail= newNode;
        }
        length++;
    }
    public Trabajador1 removeLast(){
        if (length==0)return null;
        Trabajador1 temp = head;
        Trabajador1 pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail=pre;
        tail.next= null;
        length--;
        if(length==0){
            head= null;
            tail= null;
        }
        return temp;
    }
    public boolean isEmpty(){
        if(length==0)return true;
        else return false;
    }
    public void prepend(String name, String puesto, double salario){
        Trabajador1 newNode = new Trabajador1(name, puesto, salario);
        if(length==0){
            head= newNode;
            tail= newNode;
        }else {
            newNode.next=head;
            head= newNode;
        }
        length++;
    }
    public Trabajador1 removeFirst(){
        if (length==0)return null;
        Trabajador1 temp=head;
        head= head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail= null;
        }
        return temp;
    }
    public int buscar(String name){
        Trabajador1 temp=head;
        int indice =1;
        while(temp!=null){
            if(name== temp.name){
                return indice;
            }
            indice++;
            temp= temp.next;
        }
        return -1;
    }
}