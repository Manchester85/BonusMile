public class Main {
        public static void main(String[] args) {
            BonusMilesService service = new BonusMilesService();
            int cost = 10_000;
            int bonusMile = service.calculate(10_000, 20);
            System.out.println(bonusMile);
        }
    }





