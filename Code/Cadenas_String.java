package Code;

public class Cadenas_String {
    public static void main(String[] args) {
        String nombre = "Gustavo";
        String apellido = "Gomez";
        System.out.println(nombre.length());
        System.out.println(nombre.equals(apellido));
        String nickName = nombre.substring(3, 7);
        System.out.println(nickName.toUpperCase());
        System.out.println(nombre.charAt(0));
    }
    
}
