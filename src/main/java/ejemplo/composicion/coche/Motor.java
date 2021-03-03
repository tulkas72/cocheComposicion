package ejemplo.composicion.coche;

public class Motor
{
    private String tipo;
    private int caballos;

    public Motor(String tipo, int caballos)
    {
        this.tipo = tipo;
        this.caballos = caballos;
    }
    public void alimentarMotor() //originalmente inyectarCarburante
    {

    }
}
