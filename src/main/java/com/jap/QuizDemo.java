package com.jap;

import java.util.Arrays;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
         int max=0;
        String schoolName="";
        try {
            for (int i = 0; i < scores.length; i++) {
                if (max < Integer.parseInt(scores[i])) {
                    max = Integer.parseInt(scores[i]);
                   schoolName = nameOfSchool[i];//.concat("-" + String.valueOf(max));
                }
            }
        }catch (NumberFormatException e) {
            return e.toString();
        }catch(ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
            System.out.println("Check array length");
            return e.toString();
        }catch (NullPointerException e)
        {
            e.printStackTrace();
            System.out.println("Name of school cannot be a null");
            return e.toString();
        }
        return schoolName;

    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String[] name){
        String[] upperCase = new String[name.length];
        for (int i=0;i< name.length;i++)
        {
            upperCase[i]=name[i].toUpperCase();

        }


        return upperCase;
    }

    public static void main(String[] args) {
        String[] nameOfSchool=new String[]{"kscj","sjs","lfs","dbs"};
        String[] scores=new String[]{"20","23","66","55"};

        QuizDemo quizDemo=new QuizDemo();
        System.out.println("quizDemo.highestScore(nameOfSchool,scores) = " + quizDemo.highestScore(nameOfSchool, scores));

        System.out.println("quizDemo.convertAllNamesToCapital(nameOfSchool) = " + Arrays.toString(quizDemo.convertAllNamesToCapital(nameOfSchool)));
    }
}






