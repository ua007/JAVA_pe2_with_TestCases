//function reads number of students and n grades as input (of int between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
//program shall check for valid input. You should keep all the grades in an int[] and use a method for each of the computations.

package com.stackroute.pe2;

public class GradeComputing {
    public static String GradeComputingFunction(int grades[]) {

        if(BoundChecker(grades).equals("True"))
            return("The average is "+checkAverage(grades)+"\n"+ "The minimum is "+checkMin(grades)+ "\nThe maximum is "+checkMax(grades));
        else
            return("Grades out of bound");
    }

    //check if the grade is between 1 and 100
    public static String BoundChecker(int grades[])
    {
        int k=0;
        for(int i=0;i<grades.length;i++)
        {
            if(grades[i]>=0 && grades[i]<=100)
                k=0;
            else
            {
                k=1;break;
            }
        }
        if(k==1)
            return("False");
        else
            return("True");
    }

    //return average of each student
    public static double checkAverage(int grades[])
    {
        double sum=0;
        for(int loop=0;loop<grades.length;loop++)
        {
            sum=sum+grades[loop];
        }
        double average=sum/grades.length;

        return average;

    }

    //return minimum grade
    public static int checkMin(int grades[])
    {
        int minValue = grades[0];
        for(int loop=1;loop<grades.length;loop++)
        {
            if(grades[loop] < minValue)
            {
                minValue = grades[loop];

            }
        }
        return minValue;
    }

    //return maximum grade
    public static int checkMax(int grades[])
    {
        int maxValue = grades[0];
        for(int loop=1;loop < grades.length;loop++){
            if(grades[loop] > maxValue){
                maxValue = grades[loop];
            }
        }
        return maxValue;

    }
}