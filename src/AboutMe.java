public class AboutMe {
    public static void main(String[] args) {
        //inicializar una variable (del tipo que veas conveniente) para cada uno de los siguentes datos: nombre, edad, país, lenguaje de programación, horas, pasatiempo, lugar y reemplaza en el texto de impresión, la variable que corresponda.

        //Escribe tu código aquí
        String nombre = "miller";
        String edad = "100";
        String pais = "japón";

        //segundo
        String programación = "Programación-web";
        String horas = "550";
        String hobby = "reir";
        String lugar = "sé ha perdido la señal del gps";


        //Reemplaza <name> y <age> concatenando el String con las variables creadas. 
        System.out.println("Mi nombre es: " + nombre+ "  tengo " + edad + " años y soy de " + pais);

        //Reemplaza <programmingLanguage> y <hours> concatenando el String con las variables creadas. 
        System.out.println("Estoy estudiando " +programación+  " y practico " +horas+  " horas al día.");

        //Reemplaza <hobby> y <place> concatenando el String con las variables creadas.
        System.out.println("Mi pasatiempo favorito es:" +hobby+ " y lo practico en: " +lugar);
    }
}
