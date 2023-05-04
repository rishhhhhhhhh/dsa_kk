class Solution {

    public String predictPartyVictory(String senate) {

            if(allCharacterSame(senate))

                if(senate.charAt(0)=='R')

                    return "Radiant";

            else

                return "Dire";

            StringBuilder updatedSenate = nextPossible(senate,0,0);

            return predictPartyVictory(updatedSenate.toString());

      }

      public boolean allCharacterSame(String senate){

        for(int i=0;i<senate.length()-1;i++)

            if(senate.charAt(i)!=senate.charAt(i+1))

                return false;

        return true;

      }

      public StringBuilder nextPossible(String senate,int rCount, int dCount){

        StringBuilder sb = new StringBuilder();

        int rCounter = rCount;

        int dCounter = dCount;

        for(int i=0;i<senate.length();i++){

                if (senate.charAt(i) == 'R' && dCounter > 0)

                    dCounter--;

                else if (senate.charAt(i) == 'D' && rCounter > 0)

                    rCounter--;

                else if (senate.charAt(i) == 'R' && dCounter == 0) {

                    sb.append(senate.charAt(i));

                    rCounter++;

                }

                else if (senate.charAt(i) == 'D' && rCounter == 0) {

                    sb.append(senate.charAt(i));

                    dCounter++;

                }

        }

        if((rCounter>0||dCounter>0)&&(!allCharacterSame(sb.toString())))

            return nextPossible(sb.toString(),rCounter,dCounter);

        return sb;

      }

}
