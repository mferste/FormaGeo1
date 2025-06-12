import static org.junit.jupiter.api.Assertions.*;

import org.example.Triangulo;
import org.junit.jupiter.api.Test;

public class TrianguloTest {

    @Test
    public void testTrianguloEquilatero() {
        assertEquals("Triângulo Equilátero", Triangulo.classificarTriangulo(5, 5, 5));
    }

    @Test
    public void testTrianguloIsosceles() {
        assertEquals("Triângulo Isósceles", Triangulo.classificarTriangulo(5, 5, 3));
    }

    @Test
    public void testTrianguloEscaleno() {
        assertEquals("Triângulo Escaleno", Triangulo.classificarTriangulo(5, 4, 3));
    }

    @Test
    public void testLadoInvalido() {
        assertEquals("Erro: Lado inválido", Triangulo.classificarTriangulo(-5, 4, 3));
    }

    @Test
    public void testNaoFormaTriangulo() {
        assertEquals("Erro: Não forma triângulo", Triangulo.classificarTriangulo(1, 2, 8));
    }
}
