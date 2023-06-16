public class RobotReturntoOrigin {
   
    public boolean judgeCircle(String moves) {
        int ud = 0;
        int lr = 0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R'){
                lr+=1;
            }
            else if(moves.charAt(i)=='L'){
                lr-=1;
            }
            else if(moves.charAt(i)=='U'){
                ud +=1;
            }
            else if(moves.charAt(i)=='D'){
                ud-=1;
            }
        }
        if(ud==0 && lr==0){
            return true;
        }
        else{
            return false;
        }
    }
}

