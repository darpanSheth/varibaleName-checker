import java.util.Scanner;

public class variableNameChecker {

    public static void main(String[] args){
        String variableName;
        String message = "This style of writing a variable name is ";

        Scanner stdIn = new Scanner(System.in);
        System.out.print("Enter a variable name(q to Quit): ");
        variableName = stdIn.nextLine();


        while(!variableName.equalsIgnoreCase("q")) {
            if (variableName.contains(" ") || Character.isDigit(variableName.charAt(0))) {
                message += "Illegal";
            }
            else if(Character.isUpperCase(variableName.charAt(0)) || isContainSpecialCharacters(variableName)){
                message += "Legal, but uses poor style.";
            }
            else{
                message += "Good";
            }


            System.out.println(message);
            message = "This style of writing a variable name is ";

            System.out.print("Enter a variable name(q to Quit): ");
            variableName = stdIn.nextLine();
        }
    }

    public static boolean isContainSpecialCharacters(String name) {
        for(int i = 0; i < name.length(); i++){
            if(!Character.isLetterOrDigit(name.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
