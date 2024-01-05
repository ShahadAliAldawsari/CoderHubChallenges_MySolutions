
// Challenge link: https://coderhub.sa/challenges/627b881a-1624-4521-9f90-6f54b07e6faa/view?language=Java

public class convert_time_Challenge {
    public static void main(String[] args) {
        System.out.println(convert_time("12:00 am"));
    }

    public static String convert_time(String time) {
        // write your code here
        String hours = time.split(":")[0];
        String minutes = time.split(":")[1];
        String am_pm = "";
        if (time.contains(" ")) {
            minutes = minutes.split(" ")[0];
            am_pm = (time.split(" ")[1]);
        }
        if (Integer.valueOf(hours) == 12 && Integer.valueOf(minutes) == 0) {
            return "0:00";
        } else if (Integer.valueOf(hours) >= 12) {
            return Integer.valueOf(hours) % 12 + ":" + minutes + " pm";
        } else {
            String result = "";
            if (am_pm.equals("am")) {
                result = Integer.valueOf(hours) + ":" + minutes;
            } else if (am_pm.equals("pm")) {
                result = (Integer.valueOf(hours) + 12) + ":" + minutes;
            } /*
               * else {
               * result = "Please specify am or pm.";
               * }
               */
            return result;
        }
    }

}
