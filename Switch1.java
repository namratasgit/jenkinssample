class Switch1{
    public static void main(String args[]){

       String day = "Friday";
    
        /*switch(day){
    
            case "Saturday", "Sunday" -> System.out.println("9A.M");
            case "Monday" -> System.out.println("8A.M");
            default -> System.out.println("6:15A.M");
        }*/

        //using switch as expressio to return values

        String result= "";
        
        /*switch(day){
    
            case "Saturday", "Sunday" -> result= "9A.M";
            case "Monday" -> result= "8A.M";
            default -> result = "6:15A.M";
        }*/


        result= switch(day){
    
            case "Saturday", "Sunday" -> "9A.M";
            //case "Saturday", "Sunday" : yield "9A.M";

            case "Monday" -> "8A.M";
            //case "Monday" : yield "8A.M";
            
            default -> "6:15A.M";
            //default : yield "6:15A.M";
        };
        System.out.println(result);
    }
}
