import java.util.*;

public class RandomHand {
    private LeftHand leftHand;
    private RightHand rightHand;
    private Scanner scanner;

    public static void main(String arg[]){
        RandomHand rH = new RandomHand();
    }

    public RandomHand(){
        scanner = new Scanner(System.in);
        rightHand = new RightHand();
        leftHand = new LeftHand();
        levelMenu();
    }

    private void levelMenu(){
        System.out.println("====== Level selection ======");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        levelSelection();
    }

    private void levelSelection(){
        String selection = scanner.nextLine();
        switch (selection){
            case "1":
                levelOne();
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                System.out.println("Incorrect input, please type 1, 2 or 3");
                levelMenu();
        }
    }

    private void levelOne(){
        Queue queue = new LinkedList();
        boolean isPlaying = true;
        Random rN = new Random();
        System.out.println("Level one starts");

        do {
            int leftHandFingerRan = rN.nextInt(5);
            int leftHandFingerAorBRan = rN.nextInt(2);
            int rightHandFingerRan = rN.nextInt(5);
            int rightHandFingerAorBRan = rN.nextInt(2);


            Finger leftFinger = ((Finger)leftHand.getFingers().get(leftHandFingerRan));
            String leftkey = "";

            if (leftHandFingerAorBRan == 0)
                leftkey = leftFinger.getA();
            else
                leftkey = leftFinger.getB();

            queue.add(leftkey);
            System.out.println("Left hand key: "+leftkey);



            Finger rightFinger = ((Finger)rightHand.getFingers().get(rightHandFingerRan));
            String rightkey = "";

            if (rightHandFingerAorBRan == 0)
                rightkey = rightFinger.getA();
            else
                rightkey = rightFinger.getB();

            queue.add(rightkey);
            System.out.println("Right hand key: "+rightkey);

            boolean correct = true;
            while (correct){
                String pop = (String)queue.poll();
                if(pop == null){
                    correct = false;
                    break;
                }
                System.out.println("Input: ");
                String result = scanner.next();

                if(result.equals(pop)){
                    System.out.println("Correct");
                }else{
                    System.out.println("Incorrect");
                    isPlaying = false;
                    correct = false;
                    break;
                }
            }
        }while (isPlaying);
    }

}
