 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        int remains;
        remains = angle % 360;
        return remains;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int remain;
        remain = Math.floorMod(integer, 360);
        return remain;
    }

    public static void main(String[] args){

    }
}
