class PezDispenser {
 final private String characterName;
 private String color;
 private boolean inProduction;

 public PezDispenser(String characterName, String color, boolean inProduction) {
   this.characterName = characterName;
   this.color = color;
   this.inProduction = inProduction;
 }

 public String getTheCharacter() {
   return characterName;
 }

 public String getColor() {
   return color;
 }

 public boolean getInProduction() {
   return inProduction;
 }
}
