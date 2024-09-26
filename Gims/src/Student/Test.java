package Student;

public class Test {

    public int getInitialValue() {
        
        return 10; 
    }

    public void dostuff(int value) {
        System.out.println("Processing value: " + value);
    }

    public static void main(String[] args) {
        Test test1 = new Test();
        int value = test1.getInitialValue();  
        test1.dostuff(value); 
        System.out.println("Starting.");
        System.out.println("Increment value.");
        value++;
        value = value - 8;
        System.out.println(value);
        System.out.println("Finishing.");
    }
}
