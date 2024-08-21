// CustomException.java
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        try {
            throwCustomException();
        } catch (CustomException e) {
            System.out.println("Capturada exceção personalizada: " + e.getMessage());
        }
    }

    public static void throwCustomException() throws CustomException {
        // Simulando uma situação que lança a exceção
        boolean someCondition = false;
        if (someCondition) {
            throw new CustomException("Ocorreu um erro personalizado!");
        }
    }
}
