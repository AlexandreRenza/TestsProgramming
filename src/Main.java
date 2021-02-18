import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args){

        System.out.println("Started");
        Palindrome("arara");
        Parenthesis("(a+b)");
        DeleteLetter("Alexandre", 'd');
        int [] list = {1,2,3,4};
        ReverseList(list);
        RemoveDup();
        powerOfTwoGeneral(16);

    }

    //Palindrome
    public static void Palindrome(String name){

        StringBuffer reverseName = new StringBuffer();
        Boolean result = name.equals(reverseName.reverse().toString());

        System.out.println("Result: " + (result ? "Yes, it is a Palindrome" : "No, It is not a Palindrome"));

    }

    //Parenthesis

    public static void Parenthesis(String exp){

        Stack<Character> stack = new Stack<>();

        for(int i=0; i < exp.length(); i++ ){

            char parenthesis = exp.charAt(i);

            if(parenthesis == '('){
                stack.push(parenthesis);
            }
            if(parenthesis == ')'){

                if(stack.isEmpty()){
                    i = exp.length();
                }

                if(parenthesis == ')' && stack.peek() == '('){
                    stack.pop();
                }
            }

        }

        System.out.println("The Expression is: " + (stack.isEmpty()? "Correct" : "Incorrect"));

    }

    //DeleteLetter

    public static void DeleteLetter(String name, char x){

        String newName = "";

        ArrayList<Character> newName2  = new ArrayList<>();

        LinkedList<Character> newName3 = new LinkedList<>();

        for(int i=0; i < name.length(); i++){

            if(name.charAt(i) != x){
                newName = newName + name.charAt(i);
                newName2.add(name.charAt(i));
                newName3.add(name.charAt(i));
            }
        }

        System.out.println("New name is: " + newName);
        System.out.println("New name is: " + newName2);
        System.out.println("New name is: " + newName3);

    }



    //Reverse list
    public static void ReverseList(int [] list){

        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < list.length; i++){
            linkedList.add(list[i]);
        }

        Iterator<Integer> listReverse = linkedList.descendingIterator();

        while(listReverse.hasNext()){
            System.out.println(listReverse.next());
        }
    }



    //Remove Duplicated in the List


    public static void RemoveDup(){

        LinkedList<Integer> LinkedL = new LinkedList<>();
        LinkedL.add(1);
        LinkedL.add(5);
        LinkedL.add(3);
        LinkedL.add(5);
        LinkedL.add(0);
        LinkedL.add(10);
        LinkedL.add(6);
        LinkedL.add(10);

        LinkedList<Integer> sortLinkedL = new LinkedList<>();

        int aux ;

        for(int i=0; i < LinkedL.size(); i++){

            for(int j=i+1; j < LinkedL.size(); j++){

                if(LinkedL.get(i) > LinkedL.get(j)){
                        aux = LinkedL.get(i);
                        LinkedL.set(i,LinkedL.get(j));
                        LinkedL.set(j,aux);
                }
            }
        }

        for(int i=0; i < LinkedL.size(); i++){
            if(LinkedL.get(i) == LinkedL.get(i+1)){
                LinkedL.remove(i);
            }
        }

        Iterator<Integer> Ite = LinkedL.listIterator();

        while(Ite.hasNext()){
              System.out.println(Ite.next());
        }
    }


    //Power of two /2




    public static void powerOfTwoGeneral(int n)
    {
        while(n%2==0){
            n=n/2;
        }

        if(n==1){
            System.out.println(n + " is a power of two");
        }
        else {
            System.out.println(n + " is not a power of two");
        }
    }
}
