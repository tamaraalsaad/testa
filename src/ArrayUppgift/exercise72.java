package ArrayUppgift;

public class exercise72 {
    public static void main(String[] args) {
        //72.En array med 50 inlästa tal finns. Bestäm och skriv ut index för det sista negativa talet i
        //arrayn. (Tips: Börja bakifrån i arrayn).
        int[] numbers = {5, 23, 123, 4, 2, 6, 8, -138, 2341, 231,
                5, 23, 123, -4, 2, 6, 8, 138, 2341, 541,
                5, -23, 123, 4, 2, 6, 8, 138, 2341, 43,
                5, 23, -123, 4, 2, 6, 8, -138, 2341, 1,
                5, 23, 123, 4, 2, -6, 8, 138, 2341, 61};
        for (int i = numbers.length-1 ; i <=0; i--){


            if (numbers[numbers.length-1]<0) {

                    System.out.println("sista negativa talet har index:"+ (numbers.length-1-i));
                    break;

                }

            }
        int counter = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                counter = i;
            }
        }
        if(counter!=-1) {
            System.out.println("sista negativet talet har index: " + counter);
        }



        for (int i = 1; i <= numbers.length; i++) {
            if (numbers[numbers.length - i] < 0) {
                System.out.println("sista negativet talet har index: " + (numbers.length - i));
                break;
            }
        }

        for (int i = numbers.length-1; i >= 0; i--) {
            if (numbers[i] < 0) {
                System.out.println("sista negativet talet har index: " + (i));
                break;
            }
        }


        /*int index = numbers.length;

        if(numbers[index-1]<0) {
            System.out.println("sista negativet talet har index: " +(index-1));
        } else if(numbers[index-2]<0) {
            System.out.println("sista negativet talet har index: " +(index-2));
        } else if(numbers[index-3]<0) {
            System.out.println("sista negativet talet har index: " +(index-3));
        } else if(numbers[46]<0) {
            System.out.println("sista negativet talet har index: " +46);
        } else if(numbers[45]<0) {
            System.out.println("sista negativet talet har index: " +45);
        } else if(numbers[44]<0) {
            System.out.println("sista negativet talet har index: " +44);
        }*/


    }

}









