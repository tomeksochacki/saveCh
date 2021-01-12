class SaveCh {
    public static void main(String[] args) throws java.io.IOException {
        char answer = '.', ignore;
        int counter = 0;

        System.out.println("Enter a character! ");
        for (; ; ) {
            do {
                answer = (char) System.in.read();
                if (answer == ' ') {
                    counter++;
                }
                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (answer != '.');
            if (answer == '.')
                System.out.println("Counter is: " + counter);
            break;
        }
    }
}
