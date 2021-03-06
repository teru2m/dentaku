class teru2m_dentaku{
  public static int calc(int num1, int num2, String str){
    int result;
    if (str.equals("kake")){
      result = num1 * num2;
    }else if (str.equals("tasu")){
      result = num1 + num2;
    }else if (str.equals("hiku")){
      result = num1 - num2;
    }else{
      if (num2 == 0){
        errDisp("0 で割ろうとしました");
      }

      result = num1 / num2;
    }

    return result;
  }

  public static void inputCheck(String args[]){
    if (args.length != 3){
      errDisp("引数は3個入力して下さい");
    }
  }

  public static void valCheck(int num1, int num2, String[] args){
    try{
      num1 = Integer.parseInt(args[0]);
      num2 = Integer.parseInt(args[2]);
    }catch(NumberFormatException e){
      errDisp("数値でない値が入力されています");
    }
  }

  public static void opeCheck(String str){
    String opeStr[] = {"kake", "waru", "tasu", "hiku"};
    boolean errFlag = true;
    for (int i = 0 ; i < 4 ; i++){
      if (str.equals(opeStr[i])){
        errFlag = false;
      }
    }

    if (errFlag == true){
      errDisp("演算子は kake waru tasu hiku の4つです");
    }
  }

  private static void errDisp(String errStr){
    System.out.println("Usage : java dentaku 数値 演算子 数値");
    System.out.println(errStr);
    System.exit(0);  /* プログラムを終了する */
  }

  public static void main(String args[]){
    int val1 = 0;  /* 最初の数字 */
    int val2 = 0;  /* 次の数字 */
    String ope;    /* 演算子 */
    int kekka;     /* 結果を格納 */

    inputCheck(args);
    valCheck(val1, val2, args);
    ope = args[1];
    opeCheck(ope);
    kekka = calc(val1, val2, ope);

    System.out.println("入力された式は " + val1 + " " + ope + " " + val2 + " です");
    System.out.println("計算結果は " + kekka + " です");
  }
}