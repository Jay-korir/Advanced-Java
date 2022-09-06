package warChallenge.weapons.warThreads;

import warChallenge.weapons.Army;
import warChallenge.weapons.DifficultyLevel;

import java.util.Random;

import static warChallenge.Soldier.allyCount;
import static warChallenge.Soldier.enemyCount;
import static warChallenge.WarGameController.difficultyLevel;

public class JetsThread extends Thread {
    private Army ally;
    private Army enemy;

    public JetsThread(Army ally, Army enemy) {
        this.ally = ally;
        this.enemy = enemy;
    }

    @Override
    public void run() {
        int choice = new Random().nextInt(30);
        if (choice % 2 == 0) {
            for (int j = 0; j < 10; j++) {
                int soldierIndex = new Random().nextInt(ally.getSoldiers().size());
                if (ally.getSoldiers().get(soldierIndex).jetHasMissile() && ally.getSoldiers().get(soldierIndex).isAlive()) {
                    ally.getSoldiers().get(soldierIndex).fireJet();
                } else
                    ally.getSoldiers().get(soldierIndex).setAlive(false);
            }

            //enemy shot
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(enemy.getSoldiers().size());
                choice = new Random().nextInt(5);
                boolean gameLevel = false;
                if (difficultyLevel == DifficultyLevel.EASY && choice % 1 == 0)
                    gameLevel = true;
                if (difficultyLevel == DifficultyLevel.MEDIUM && choice % 2 == 0)
                    gameLevel = true;
                if (difficultyLevel == DifficultyLevel.HARD && choice % 5 == 0)
                    gameLevel = true;
                if (gameLevel && enemy.getSoldiers().get(soldierIndex).isAlive())
                    enemy.getSoldiers().get(soldierIndex).shot();
                enemyCount += 1;

            }
        } else if (choice % 5 == 0) {
            for (int j = 0; j < 10; j++) {
                int soldierIndex = new Random().nextInt(enemy.getSoldiers().size());
                if (enemy.getSoldiers().get(soldierIndex).jetHasMissile() && enemy.getSoldiers().get(soldierIndex).isAlive()) {
                    enemy.getSoldiers().get(soldierIndex).fireJet();
                } else
                    enemy.getSoldiers().get(soldierIndex).setAlive(false);
            }

            //ally shot
            for (int i = 0; i < 5; i++) {
                int soldierIndex = new Random().nextInt(ally.getSoldiers().size());
                choice = new Random().nextInt(5);

                if ((choice % 5 == 0) && ally.getSoldiers().get(soldierIndex).isAlive())
                    ally.getSoldiers().get(soldierIndex).shot();
                allyCount += 1;

            }
        }
    }

}
