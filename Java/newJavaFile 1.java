class helloworld{
    public static void main(string []args)
    {
        System.out.println("Hello World");
				System.out.println("args[0]: " + args[0]);
				int x = Integer.parseInt(args[0]);
				int y = Integer.parseInt(args[1]);
				int option = Integer.parseInt(args[2]);
				int[] map = {984, 4, 13, 124, 784};
				int secret = map[option % 5];
				System.out.print("Ket qua: ");
				System.out.println((x + y) + x);
    }
}
