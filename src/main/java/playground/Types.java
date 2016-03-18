package playground;



import java.lang.instrument.Instrumentation;
import java.math.BigDecimal;

public class Types {


    public Boolean getCharacter(Object character){
        return character instanceof Character;
    }

    public static void main(String[] args){
        Types types = new Types();

        char aPrimitiveChar = 'A';
        Character aObjectChar = 'B';
        char[] chars = { 'A', 'B', 'C', 'Д' };

        //Autoboxing
        Boolean isObjectChar = types.getCharacter(aPrimitiveChar); //expected object, got primitive char

        int[] anArray;
        anArray = new int[10];

        anArray[5] = 100;


        System.out.println(anArray[1]);
    }

}
