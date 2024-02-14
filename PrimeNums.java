import java.io.*;
import java.util.Scanner;


public class PrimeNums {
    public static void main(String args[]) throws IOException {

        File inputfile = new File("C:\\Users\\bs024206\\IdeaProjects\\201LAB1\\input.txt");
        File outputfile = new File("C:\\Users\\bs024206\\IdeaProjects\\201LAB1\\output.txt");

        FileWriter fw = new FileWriter(outputfile);
        BufferedReader inputData = null;
        BufferedWriter outputData=null;



        inputData = new BufferedReader(new FileReader(inputfile));
        outputData = new BufferedWriter(new FileWriter(outputfile));


        String line;
        while((line = inputData.readLine())!=null){
            System.out.println(line);


             int num = Integer.parseInt(line);
                if(checkPrime(num)){
                    fw.write("prime\n");
                }else{
                    fw.write("not prime\n");
                }


        }
        fw.close();
    }

    public static boolean checkPrime(int num) {
        if(num<=1){
            return false;
        }
        for(int i =2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
