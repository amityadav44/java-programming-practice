class WordConcat {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "powerful", "and", "fun"};
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word).append(" ");
        }

        System.out.println("Concatenated String: " + sb.toString().trim());
    }
}
