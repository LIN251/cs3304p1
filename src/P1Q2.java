
public class P1Q2 {

    public static void main(String[] args) {
        
        String result = checkpasher("(2222");
        System.out.println(result);
        
 
        }

    public static String checkpasher(String input) {
        int length = input.length();
        int index = 0;
        char ch1 = input.charAt(0);
        System.out.println(ch1);
        if(ch1 != '(') {
            errorOutput(index,input);
        }
        else {index = index+1;} 
        
        if(Character.isDigit(input.charAt(index))) {
            errorOutput(index,input);
        }
        else {
            index = index+1;
            while(Character.isDigit(input.charAt(index))) {
                index = index+1;
            }
               System.out.println(index);
        }

       
        return null;
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void errorOutput(int index, String input) {
        System.out.println(input);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < index-1; i++) {
            result.append(" ");
         }
        result.append("^");
        System.out.println(result);
    }
    
    
    
    public void rightoutput(String s) {
        ////////`````
    }
    
    
    
    
    
    
    
    

}