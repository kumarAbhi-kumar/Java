class palindrome
{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Give it a string");
            String var = sc.nextLine();
            String rec = "";
            for(int i = var.length()-1; i >= 0; i--)
                rec += var.charAt(i);

            
            System.out.println(rec);
            if (rec.equals(var))
                System.out.println("Palindrome!");
            else
                System.out.println("Not Palindrome");
        }
    }
}