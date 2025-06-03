class Main {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        char firstChar = password.charAt(0);
        return !(firstChar >= '0' && firstChar <= '9');
    }

    public static void main(String[] args) {
        String password = "Hello123"; 
        System.out.println(isValidPassword(password));
    }
}