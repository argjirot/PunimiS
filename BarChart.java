import javax.swing.JOptionPane;

public class BarChart{
   public static void main(String[] args) {
       
      int numberOfValues = 6;
      String userStringInput;
      double values;
      int barGraph;
      
      String titulli = JOptionPane.showInputDialog("Shtyp emrin e tiullit te grafit: ");
      String outputString = titulli+"\n";
      for( int store = 1; store <= numberOfValues; store++ ) {
         userStringInput = JOptionPane.showInputDialog("Shtyp vleren e " + store+ ":");
      
         values = Double.parseDouble(userStringInput);
         if(values > 100){
            barGraph = (int)(values/100);
            outputString += "Vlera " + store +": ";
            for( int printAsterisk = 1; printAsterisk <= barGraph; printAsterisk++){
               outputString += "*";
            }
            outputString += "\n";
         }
         else {
            barGraph = (int)(values);
            outputString += "Vlera " + store +": ";
            for( int printAsterisk = 1; printAsterisk <= barGraph; printAsterisk++){
               outputString += "*";
            }
            outputString += "\n";
         }
      
      }
      JOptionPane.showMessageDialog(null , outputString);
      System.exit(0);
   }
}
