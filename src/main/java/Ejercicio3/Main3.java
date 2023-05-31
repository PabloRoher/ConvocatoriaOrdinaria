package Ejercicio3;

public class Main3 {
    public static void main(String[] args) {
        Document document = new Document("Documento 1");
        Requirement requirement = new Requirement("Requerimiento 1");
        document.add(requirement);
        document.process();
    }
}
