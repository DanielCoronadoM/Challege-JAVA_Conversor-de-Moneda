public class LogicsConversor {
    //public int opt = 0;
    public static String convert(Object item, String amount){

        try{
            System.out.println(item);

            double amountnum = Integer.parseInt(amount);

            System.out.println(amountnum);

            double conversion = amountnum * 0.0597;

            System.out.println(conversion);
            //String result = Integer.toString(conversion);



        }catch (Exception exception){
            System.out.println("No se ingresó un monto");
            return "Ingresa un número";
        }
        return "result";
    }
}
