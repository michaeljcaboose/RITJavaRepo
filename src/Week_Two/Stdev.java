package Week_Two;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Panebianco
 */
public class Stdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Run program like so: "
                    + "java Stdev <count> <x, x1, x2...>");

            System.exit(0);
        }

        // Pull in count, create array of size count
        int count = Integer.parseInt(args[0]);
        double[] valueArray = new double[count];

        for(int i = 0; i < count; i++){
            valueArray[i] = Double.parseDouble(args[i+1]);
        }
        double standard_deviation = calculateStdDev(valueArray, count);
        System.out.printf("The standard deviation of the sample is: %f \n",
                standard_deviation);
    }


    /*
    *  calculateStdDev
    *
    *  Takes in the double containing all of our data values and the length
    *  of the array as an integer. This is the main driver function for calculating
    *  Standard Deviation. Calls functions to calculate the mean, deviation, and
    *  squared deviation.
    *
    *  Returns the standard deviation as a double
    *
    * */

    private static double calculateStdDev(double[] inValueArray, int count){
        double stdDev = 0.0;
        double mean = calculateMean(inValueArray);
        System.out.println("Count: " + count);
        System.out.println("Mean: " + mean);
        double[] deviationArray = calculateDeviation(mean, inValueArray);
        double sqDevMean = calculateSqDevFromMean(deviationArray);
        System.out.println("Square Deviation Mean: " + sqDevMean);
        stdDev = Math.sqrt((sqDevMean / (count - 1)));

        return stdDev;
    }


    /*
    *
    * calculateMean
    *
    * Receives the array of data points
    * Returns their mean as a double
    *
    * */

    private static double calculateMean(double[] inValueArray){
        double outMean = 0.0;
        double sum = 0.0;

        for(double value: inValueArray){
            sum += value;
        }

        outMean = (sum/inValueArray.length);

        return outMean;
    }


    /*
    *
    * calculateDeviation
    *
    * Receives the mean and array of data values
    * Returns an array of doubles containing the
    * deviation of each value from the mean
    *
    * */

    private static double[] calculateDeviation(double inMean, double[] inValueArray){
        double[] outDeviation = new double[inValueArray.length];
        for(int i=0; i < inValueArray.length; i++){
            outDeviation[i] = inValueArray[i] - inMean;
        }

        return outDeviation;
    }


    /*
    *
    * calculateSqDevFromMean
    *
    * Receives an array of doubles containing the deviation of each data value
    * Returns the total squared deviation as a double variable
    *
    * */

    private static double calculateSqDevFromMean(double[] inDeviationArray){
        double outSqDevFromMean = 0.0;

        for(double value: inDeviationArray){
            double calcVal = (value * value);
            outSqDevFromMean += calcVal;
        }

        return outSqDevFromMean;
    }
}

