public class Main {

    public static long maxRot(long n) {

        long result = 0;
        String aNum = String.valueOf(n);
        int counter = 0;
        String tempString = aNum;

        while (counter <= aNum.length() - 1) {
            if (Long.valueOf(tempString) > result) {
                result = Long.valueOf(tempString);
            }
            tempString = tempString.substring(0, counter) + tempString.substring(counter + 1) + tempString.substring(counter, counter + 1);
            counter++;
        }
        return result;
    }


}
