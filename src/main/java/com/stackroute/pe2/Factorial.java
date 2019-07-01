package com.stackroute.pe2;

public class Factorial {

    public String printIntFactorials()
    {
        int i  = 1;
        int fn = 1;
        String output="";
        while (true)
        {
            output=output+"\n"+fn;
            if (Integer.MAX_VALUE / fn < (i+1)) {
                output=output+"out of range";
                break;
            }
            i++;
            fn *= i;
        }
        return output;

    }

    public String printLongFactorials()
    {   String output="";
        long i  = 1L;
        long fn = 1L;
        while (true)
        {   output=output+"\n"+fn;

            if (Long.MAX_VALUE / fn < (i+1)) {
                output=output+"out of range";
                break;
            }
            i++;
            fn *= i;
        }
        return output;
    }
}
