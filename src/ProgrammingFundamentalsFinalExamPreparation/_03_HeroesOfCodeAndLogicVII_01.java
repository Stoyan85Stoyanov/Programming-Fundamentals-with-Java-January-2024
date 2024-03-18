package ProgrammingFundamentalsFinalExamPreparation;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class _03_HeroesOfCodeAndLogicVII_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> heroesHP = new LinkedHashMap<>();
        Map<String, Integer> heroesMP = new LinkedHashMap<>();

        int countHeroes = Integer.parseInt(scanner.nextLine());

        for (int hero = 1; hero <= countHeroes; hero++) {
            String input = scanner.nextLine();

            String[] tokens = input.split("\\s+");

            String heroName = tokens[0];
            int hp = Integer.parseInt(tokens[1]);
            int mp = Integer.parseInt(tokens[2]);

            if (hp < 100) {

                heroesHP.put(heroName, hp);

            }
            if (mp < 200) {

                heroesMP.put(heroName, mp);
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String [] tokens = command.split(" - ");
            String commandName = tokens [0];
            String heroName = tokens [1];

            switch (commandName) {
                case  "CastSpell":
                    int mpNeeded = Integer.parseInt(tokens [2]);
                    String spellName = tokens [3];
                    int mpCurrent = heroesMP.get(heroName);


                    if (mpCurrent >= mpNeeded) {
                        int mpHero = mpCurrent - mpNeeded;
                        heroesMP.put(heroName, mpHero);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, mpHero);


                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;

                case  "TakeDamage":
                    int damage = Integer.parseInt(tokens [2]);
                    String attacker = tokens [3];
                    int currentHP = heroesHP.get(heroName) - damage;

                    if (currentHP > 0){
                        heroesHP.put(heroName, currentHP);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);


                    }else {
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        heroesHP.remove(heroName);
                        heroesMP.remove(heroName);
                    }
                    break;

                case  "Recharge":
                      int amountIncrease = Integer.parseInt(tokens [2]);
                      int currentMp = heroesMP.get(heroName);
                      int increaseMp = currentMp + amountIncrease;
                      if (increaseMp >= 200){
                          increaseMp = 200;
                      }
                      heroesMP.put(heroName, increaseMp);
                    System.out.printf("%s recharged for %d MP!%n", heroName, increaseMp - currentMp );
                    break;

                case  "Heal":
                     int amount = Integer.parseInt(tokens [2]);
                     int currentHp = heroesHP.get(heroName);
                     int increaseHp = currentHp + amount;
                    if (increaseHp >= 100){
                        increaseHp = 100;
                    }
                    heroesHP.put(heroName, increaseHp);
                    System.out.printf("%s healed for %d HP!%n",heroName, increaseHp - currentHp);
                    break;
            }

        command = scanner.nextLine();
        }

        heroesHP.entrySet().stream().sorted((h1, h2) -> Integer.compare(h2.getValue(),h1.getValue()))
                .forEach(hero -> {

                    System.out.println(hero.getKey());
                    System.out.println("  HP: " + hero.getValue());
                    System.out.println("  MP: " + heroesMP.get(hero.getKey()));

             });
        }
    }

