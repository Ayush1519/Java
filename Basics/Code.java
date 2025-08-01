class Main {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {// using password.length to print the length
            return false;//using return keyword
        }
        char firstChar = password.charAt(0);//char variable declared
        return !(firstChar >= '0' && firstChar <= '9');
    }

    public static void main(String[] args) {
        String password = "Hello123"; // Example password
        System.out.println(isValidPassword(password)); // Prints true or false
    }
}
