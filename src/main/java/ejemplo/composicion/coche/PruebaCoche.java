package ejemplo.composicion.coche;

public class PruebaCoche
{
    public static void main(String[] args)
    {
        Rueda[] ruedas=
        { new Rueda(20,"Dunlop"),
          new Rueda(20,"Dunlop"),
          new Rueda(22,"Dunlop"),
          new Rueda(22,"Dunlop"),
        };

        Coche miCoche = new Coche("verde",80,3.2f,ruedas, new Motor("Diesel",100));

    }
}
