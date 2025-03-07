package lec3.abstraction;

public class Vegetable {

    int vitaminC;
    int vitaminB;
    int vitaminE;
    int protein;
    int fat;
    int carb;

    //야채 또는 채소를 추상화
    //기본 3대 영양소(탄/단/지) 비타민 c, d, e
    //건강해지기

    Vegetable(int vitaminB, int vitaminC, int vitaminE, int protein, int carb, int fat) {
        this.vitaminB = vitaminB;
        this.vitaminC = vitaminC;
        this.vitaminE = vitaminE;
        this.protein = protein;
        this.carb = carb;
        this.fat = fat;
    }

    public void beHealthy(){

    }
}
