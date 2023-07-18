public class LogicsConversor {
    //public int opt = 0;
    public static String convert(Object item, String amount){

        try{
            return LogicsConversor.pesotodollar(amount);

        }catch (Exception exception){
            System.out.println("No se ingresó un monto");
            return "Ingresa un número";
        }
    }

    public static String pesotodollar(String amount){
        //System.out.println(item);

        double peso = Double.parseDouble(amount); //Convertir String a double

        System.out.println(peso);

        double conversion = peso * 0.0597;

        System.out.println(conversion);

        return String.valueOf(conversion); //Convierte double a String para retornarlo
    }
}
