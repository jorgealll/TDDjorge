import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {

    @Test
    public void test_crear_coche_su_velocidad_es_cerojorgealtet(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_aumentajorgealtet(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerarjorge(30);
       Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_disminuyejorgealtet(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerarjorge(20);
        Assertions.assertEquals(30, nuevoCoche.velocidad);
    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero_jorgealtet(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerarjorge(80);
        Assertions.assertEquals(0, nuevoCoche.velocidad);
    }
}
