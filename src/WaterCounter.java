public class WaterCounter {
    public double count(String text) {
        char[] arrText = text.toCharArray();
        double k = 0;
        for (int i = 0; i < arrText.length; i++) {
            if(arrText[i] == ' ') {
                k++;
            }
        }
        return k / arrText.length;
    }
}
//виклик коду new WaterCounter().count("Moon invaders") повертає 0.07692307692307693;
//виклик коду new WaterCounter().count("NoWater") повертає 0.
