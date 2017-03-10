import imports.BinaryTree;

import java.util.Scanner;

public class BinaryTree_ruleta {		 
	public static void main(String[] args){            
        Scanner scan = new Scanner(System.in);
        BinaryTree<Integer> bt = new BinaryTree<Integer>(); 
        System.out.println("Arbol Binario\n");          
        char ch;        
        do    
        {
            System.out.println("\nOperaciones Del arbol Binario\n");
            System.out.println("1. insertar ");
            System.out.println("2. buscar");
            System.out.println("3. contar nodos");
            System.out.println("4. checar estado vacio");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("inserta el numero que se utilizara");
                bt.insert( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Inserta el numero que se buscara");
                System.out.println("Resultado de busqueda : "+ bt.search( scan.nextInt() ));
                break;                                          
            case 3 : 
                System.out.println("Nodos = "+ bt.countNodes());
                break;     
            case 4 : 
                System.out.println("Estado de vacio = "+ bt.isEmpty());
                break;            
            default : 
                System.out.println("Entrada incorrecta \n ");
                break;   
            }
            System.out.print("\nPost orden : ");
            bt.postorder();
            System.out.print("\nPre orden : ");
            bt.preorder();
            System.out.print("\nIn orden : ");
            bt.inorder();
 
            System.out.println("\n\nQuieres Continuar? (Escribe y o n) \n");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');
        scan.close();
    }
}
