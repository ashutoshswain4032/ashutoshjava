class Operations{
        private double num;
        public double result;
        void setNum(double num){
            this.num=num;
        }
        void setAddition(){
            result=result+num;
        }
        void setMultiplication(){
            result=result*num;
        }
        void setSubstraction(){
            result=result-num;
        }
        void setDivision(){
            result=result/num;
        }
        double getAddition(){
            return result;
        }
        double getMultiplication(){
            return result;
        }
        double getDivision(){
            return result;
        }
        double getSubstraction(){
            return result;
        }

}
public class Calculator {
    public static void main(String[] args) {
        Operations o=new Operations();
        do{

        }while(ch=='y'||ch=='Y');
    }
}
