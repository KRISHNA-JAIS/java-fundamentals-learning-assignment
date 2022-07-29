package main.java.question1;

public class Question1 {
    private static String compareStringValues(final String value) {

        if (value.equals("MOM"))
            return "MOM";
				else
                    return "DAD";
    }

    /**
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println(compareStringValues(null) + "cook food for me");
    }
}






