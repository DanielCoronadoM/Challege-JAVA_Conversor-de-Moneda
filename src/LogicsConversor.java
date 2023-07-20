public class LogicsConversor {

    public static String convert(Object item, String amount){

        try {
            int i = (int) item; //Convertir el "Objeto" a tipo int
            String answer = "Ingrese un monto";
            //double proportion = 0;
            switch (i) {
                case 0 -> {
                    double proportion = 0.0598;
                    answer = LogicsConversor.convertcurrency(amount, proportion) + " USD";
                }
                case 1 -> {
                    double proportion = 0.0534;
                    answer = LogicsConversor.convertcurrency(amount, proportion) + " EUR";
                }
                case 2 -> {
                    double proportion = 0.0463;
                    answer = LogicsConversor.convertcurrency(amount, proportion) + " GBP";
                }
                case 3 -> {
                    double proportion = 8.3525;
                    answer = LogicsConversor.convertcurrency(amount, proportion) + " JPY";
                }
                case 4 -> {
                    double proportion = 75.74;
                    answer = LogicsConversor.convertcurrency(amount, proportion) + " KRW";
                }
                //--------------------------------------------------------------------------
                case 5 -> {
                    double proportion = 16.712;
                    answer = LogicsConversor.convertcurrency(amount, proportion) + " MXN";
                }
                case 6 -> {
                    double proportion = 18.73;
                    answer = LogicsConversor.convertcurrency(amount, proportion) + " MXN";
                }
                case 7 -> {
                    double proportion = 21.6304;
                    answer = LogicsConversor.convertcurrency(amount, proportion) + " MXN";
                }
                case 8 -> {
                    double proportion = 0.1198;
                    answer = LogicsConversor.convertcurrency(amount, proportion) + " MXN";
                }
                case 9 -> {
                    double proportion = 0.0132;
                    answer = LogicsConversor.convertcurrency(amount, proportion) + " MXN";
                }

                default -> {
                    return answer;
                }
            }
            return answer;

        }catch (Exception exception){
            System.out.println("Excepción: No se ingresó un monto");
            return "Ingresa un número válido";
        }
    }



    public static String convertcurrency(String amount, double proportion){

        double currency = Double.parseDouble(amount); //Convertir String a double

        System.out.println(currency);

        double conversion = currency * proportion;

        System.out.println(conversion);

        return String.valueOf(conversion); //Convierte double a String para retornarlo
    }
    
}
