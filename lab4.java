
abstract class Robber {

    public void RobbingClass() {
        System.err.println("MSAI&ML");
    }
}

abstract class JAVAProfessionalRobber extends Robber {

    public void MachineLearning() {
        System.err.println("I Love MachineLearning");
    }

    abstract public int RowHouse(int[] money);

    abstract public int RoundHouses(int[] money);

    abstract public int SquareHouse(int[] money);

    abstract public int MultiHouseBuilding(int[][] money);
}

class RobHouses extends JAVAProfessionalRobber {

    @Override
    public int RowHouse(int[] money) {
        // RowHouses(): Accepts an integer array representing the amount of money in each
        // rowhouse. The objective is to maximize the amount robbed without triggering
        // security alarms from adjacent houses. The method should return the maximum
        // amount that can be robbed without getting caught. (2 Marks)
        int odd = 0;
        int even = 0;
        for (int i = 0; i < money.length; i++) {
            if (i % 2 == 0) {
                even += money[i];
            } else {
                odd += money[i];
            }
        }

        return Math.max(odd, even);
    }

    @Override
    public int RoundHouses(int[] money) {
        // ● RoundHouses(): Accepts an integer array representing the amount of money in each
        // roundhouse. Since the houses form a circle, with the last and first houses being
        // adjacent, the goal is to maximize the amount robbed without triggering security
        // alarms from adjacent houses. The method should return the maximum amount that
        // can be robbed without getting caught. (2 Marks)
        int odd = 0;
        int even = 0;

        if (money.length % 2 == 0) {
            for (int i = 0; i < money.length; i++) {
                if (i % 2 == 0 && i != money.length) {
                    even += money[i];
                } else {
                    odd += money[i];
                }
            }
        } else {
            for (int i = 0; i < money.length; i++) {
                if (i % 2 == 0) {
                    even += money[i];
                } else {
                    odd += money[i];
                }
            }

        }
        return Math.max(odd, even);
    }

    @Override
    public int SquareHouse(int[] money) {
        // ● SquareHouse(): Accepts an integer array representing the amount of money in each
        // square house. Robbing adjacent square houses triggers security alarms. The method
        // should return the maximum amount that can be robbed without getting caught. (2
        // Marks)
        int odd = 0;
        int even = 0;
        for (int i = 0; i < money.length; i++) {
            if (i % 2 == 0) {
                even += money[i];
            } else {
                odd += money[i];
            }
        }

        return Math.max(odd, even);
    }

    @Override
    public int MultiHouseBuilding(int[][] money) {
        // ● MuliHouseBuilding(): Accepts an integer array representing the amount of money in
        // each type of house in a multi-type building. Robbing adjacent houses of any type
        // triggers security alarms. The method should return the maximum amount that can be
        // robbed without getting caught. (2 Marks)

        int odd = 0;
        int even = 0;

        for (int i = 0; i < money.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < money[i].length; j++) {
                    even += money[i][j];
                }
            } else {
                for (int j = 0; j < money[i].length; j++) {
                    odd += money[i][j];
                }
            }
        }
        return Math.max(odd, even);
    }
}

public class lab4 {

    public static void main(String[] args) {
        RobHouses rob = new RobHouses();
        int[] rowHouseMoney = {1, 2, 3, 0};
        System.out.println(rob.RowHouse(rowHouseMoney));

        int[] roundHouseMoney = {1, 2, 3, 4};
        System.out.println(rob.RoundHouses(roundHouseMoney));

        int[] squareHouseMoney = {5, 10, 2, 7};
        System.out.println(rob.SquareHouse(squareHouseMoney));

        int[][] multiHousMoney = {{5, 3, 8, 2}, {10, 12, 7, 6}, {4, 9, 11, 5}, {8, 6, 3, 7}};
        System.out.println(rob.MultiHouseBuilding(multiHousMoney));
    }
}
