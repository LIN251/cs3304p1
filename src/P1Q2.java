
public class P1Q2 {

    public static void main(String[] args) {
        
        String result = checkpasher("stack");
        System.out.println(result);
        
 
        }

    public static String checkpasher(String input) {
        
        int length = input.length();
        int index = 0;
        char ch1 = input.charAt(0);
        if(ch1 != '(') {
            errorOutput(index,input);
            
        }else {index = index+1;} 
        ch1 = input.charAt(index);
        if(ch1 !=) {
            
        }
        while( index< length) {

        
        
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