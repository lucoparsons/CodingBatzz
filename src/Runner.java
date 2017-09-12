/**
 * Created by h205p2 on 9/5/17.
 */
public class Runner {

    //your main containing tests and output
    public static void main(String[] args) {

        //Runner r = new Runner();

        System.out.println(helloName("Matt"));
        System.out.println(helloName("Jim"));
        System.out.println(helloName("Maria"));
        System.out.println(helloName("Kate"));

        //System.out.println(nextMethod(true));

        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(true, true));

        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("x", 5));
        System.out.println(stringTimes("Hi", 0));

        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("x", ""));
        System.out.println(makeAbba("aaa", "bbb"));

        int nums1[] = new int[]{1, 2, 3}; //shortcut for creating arrays!
//        nums1[0] = 1;
//        nums1[1] = 2;
//        nums1[2] = 3;
        System.out.println(sameFirstLast(nums1));
        int nums2[] = new int[4];
        nums2[0] = 1;
        nums2[1] = 2;
        nums2[2] = 3;
        nums2[3] = 1;
        System.out.println(sameFirstLast(nums2));

        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, false));
        System.out.println(cigarParty(30, true));
        System.out.println(cigarParty(70, true));

        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(22, 50));

        System.out.println(doubleChar("Hello"));
        System.out.println(doubleChar("Wassup"));

        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggxgx"));
        System.out.println(gHappy("xxggxxg"));
        System.out.println(gHappy("g"));
        System.out.println(gHappy("gg"));

        int nums3[] = new int[]{2, 1, 2, 3, 4};
        System.out.println(countEvens(nums3));
        int nums4[] = new int[]{2, 2, 0};
        System.out.println(countEvens(nums4));
        int nums5[] = new int[]{1, 3, 5};
        System.out.println(countEvens(nums5));

        int nums6[] = new int[]{1, 2, 4, 6};
        int nums7[] = new int[]{2, 4};
        System.out.println(linearIn(nums6, nums7));
        int nums8[] = new int[]{2, 3, 4};
        System.out.println(linearIn(nums6, nums8));
        int nums9[] = new int[]{2, 2, 2, 2, 2};
        System.out.println(linearIn(nums9, nums7));
    }

    //your codingbat method here - must match the method name from codingbat
    public static String helloName(String name) {
        return "hi " + name;
    }

    // next codingbat method here
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

    public static String stringTimes(String str, int n) {
        String newStr = "";
        for(int i = 0; i<n; i++) {
            newStr += str;
        }
        return newStr;
    }

    public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static boolean sameFirstLast(int[] nums) {
        int a = nums.length;
        return((a>=1) && (nums[0] == nums[a-1]));

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if((isWeekend && cigars >= 40) || (!isWeekend && cigars >=40 && cigars <=60)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int blackjack(int a, int b) {
        if (a>21 && b>21) {
            return 0;
        }
        else if (a>21) {
            return b;
        }
        else if (b>21) {
            return a;
        }
        else if (a>b) {
            return a;
        }
        else if (b>a) {
            return b;
        }
        return 0;
    }

    public static String doubleChar(String str) {
        int a = str.length();
        String result = "";
        for(int i = 0; i < a; i++) {
            result = result + str.charAt(i) + str.charAt(i);

        }
        return result;
    }

    public static boolean gHappy(String str) {
        if (str == "g") {
            return false;
        }
        for(int i = 0; i < str.length(); i++) {
            if(i == 0 && str.charAt(i) == 'g') {
                if(!(str.charAt(i+1) == 'g')) {
                    return false;
                }

            }
            else if(i == (str.length()-1) && str.charAt(i) == 'g') {
                if(!(str.charAt(i-1) == 'g')) {
                    return false;
                }

            }
            else if(str.charAt(i) == 'g') {
                if(!(str.charAt(i+1) == 'g') && !(str.charAt(i-1) == 'g')) {
                    return false;
                }

            }

        }
        return true;
    }

    public static int countEvens(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                counter += 1;
            }
        }
        return counter;
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int correctCount = 0;
        for(int i = 0; i < inner.length; i++) {
            int a = inner[i];
            int counter = 0;
            for(int j = 0; j < outer.length; j++) {
                if(outer[j] == a) {
                    counter += 1;
                }
            }
            if (counter >= 1) {
                correctCount++;
            }
        }
        return (correctCount >= inner.length);
    }

}

