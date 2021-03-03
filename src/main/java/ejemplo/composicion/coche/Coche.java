package ejemplo.composicion.coche;

public class Coche
{
    private String color;
    private int velocidad;
    private float tamaño;
    private Rueda[] ruedas;
    private Motor motor;

    public Coche(String color, int velocidad, float tamaño, Rueda[] ruedas, Motor motor)
    {
        this.color = color;
        this.velocidad = velocidad;
        this.tamaño = tamaño;
        this.ruedas = ruedas;
        this.motor = motor;
    }

    public void avanzar()
    {
        motor.alimentarMotor(); //inyectarCarburante
        for (int i = 0; i < ruedas.length; i++)
        {
            ruedas[i].girar();
        }

        //alternativamente
        //for (Rueda rueda : ruedas)
        //            {
        //                rueda.girar();
        //            }
    }
}
